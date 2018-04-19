var supportMail = '1191837698@qq.com';

//设置全局AJAX配置
$.ajaxSetup({
    xhrFields: {
        withCredentials: true
    },
    crossDomain: true,
});

// 常规浏览器语言和IE浏览器
String.prototype.orEnglish = function (en) {
    var lang = navigator.language || navigator.userLanguage;
    lang = lang.substr(0, 2);
    return (lang === 'zh') ? this.toString() : en;
};

// 跳转页面
function jumpToURL(URL) {
    window.location.href = URL;
}

// 这个接口用来保存永久数据
function saveData(key, value) {
    localStorage.setItem(key, JSON.stringify({ value: value }));
}

function loadData(key) {
    var data = localStorage.getItem(key);
    return data ? JSON.parse(data).value : null;
}

// 这个接口用来保存临时数据，浏览器关闭时会清空
function saveCache(key, value) {
    sessionStorage.setItem(key, JSON.stringify({ value: value }));
}

function loadCache(key) {
    var data = sessionStorage.getItem(key);
    return data ? JSON.parse(data).value : null;
}

//
function getSequence(num) {
    if (isNaN(num)) {
        return num;
    }
    return (num == 1) ? '1st' : (num == 2) ? '2nd' : (num == 3) ? '3rd' : (num > 3) ? (num + 1) + 'th' : num;
}

function getSuppliers() {
    var cacheKey = 'suppliers';
    var result = loadCache(cacheKey);
    if (result) {
        console.log('Find suppliers in cache');
    } else {
        $.ajax({
            url: 'http://localhost:8091/api/basic/supplier/all',
            type: 'GET',
            async: false,   // 同步获取数据
            dataType: "json",
            success: function (result) {
                result = result;
                saveCache(cacheKey, result);
            },
        });
    }
    result = loadCache(cacheKey);
    return result;
}

function getPurchaseOrders() {
    var result;
    var cacheKey = 'purchaseOrders';
    sessionStorage.removeItem(cacheKey);
    $.ajax({
        url: 'http://localhost:8091/api/purchase/order/all',
        type: 'GET',
        async: false,   // 同步获取数据
        dataType: "json",
        success: function (result) {
            result = result;
            saveCache(cacheKey, result);
        },
    });
    result = loadCache(cacheKey);
    return result;
}

























function checkManifestFile(vueComponent, file) {
    var fileName = file.name;
    var fileSuffix = fileName.substring(fileName.lastIndexOf('.') + 1);
    if (fileSuffix != 'xml') {
        vueComponent.$message.error('请选择xml格式的manifest文件。'.orEnglish('Please select a xml format file.'));
        return false;
    }
    var MAX_SIZE = 3 * 100 * 1024; //max manifest file size is 300kb.
    if (file.size > MAX_SIZE) {
        vueComponent.$message.error('上传文件的大小不要超过300kb。'.orEnglish('Upload file size should not exceed 300kb.'));
        return false;
    }
    return true;
}



Array.prototype.expandParams = function () {
    for (var i = 0; i < this.length; i++) {
        var params = this[i].parameters;
        for (var j = 0; j < params.length; j++) {
            var key = params[j].name;
            this[i][key] = params[j].value;
        }
    }
};
