var samoyedData = {

    payMantList:[
        {value:'1',label:'立即付款'.orEnglish('Immediate Pay')},
        {value:'2',label:'货到付款'.orEnglish('Arrival Pay')},
        {value:'3',label:'支付定金'.orEnglish('Deposit Pay')},
    ],









    regionList: [
        { value: 'cn' },
        { value: 'cn_chinamobile' },
        { value: 'cn_chinaunicom' },
        { value: 'cn_chinatelecom' },
        { value: 'global' },
        { value: 'cn_cta' },
        { value: 'cn_chinamobile-cta' },
        { value: 'cm', label: 'cmonly' },
        { value: 'cu', label: 'cuonly' },
        { value: 'ct', label: 'ctonly' },
        { value: 'cn_cmcooperation' },
        { value: 'global_crkolbi' },
        { value: 'ru' },
    ],
    changeListRegionList: [
        { value: 'cn' },
        { value: 'global' },
    ],
    manifestTypeList: [
        { value: '', label: '默认'.orEnglish('Default') },
        { value: 'path', label: '路径'.orEnglish('Path') },
        { value: 'url', label: 'URL' },
        { value: 'upload', label: '上传'.orEnglish('Upload') },
    ],
    manifestBranches: [
        { value: '', label: 'autojudge' },
        { value: 'dev' },
        { value: 'alpha' },
        { value: 'stable' },
        { value: 'jellybean' },
        { value: 'enterprise' },
    ],
    changePorts: [
        { value: '8088', label: 'MIUI Gerrit' },
        { value: '8660', label: 'BSP Gerrit' },
        { value: 'song', label: '松果 Gerrit'.orEnglish('Soon Gerrit') },
        { value: 'lmp', label: 'LMP Gerrit' },
    ],
    changeTypes: [
        { value: 'cherry-pick' },
        { value: 'checkout' },
    ],
    odexList: [
        { value: 'default', label: '跟随daily build'.orEnglish('Same as daily build') },
        { value: 'true', label: '开启'.orEnglish('Enable') },
        { value: 'false', label: '关闭'.orEnglish('Disable') },
    ],
    buildTypeList: [
        { value: 'default', label: '跟随daily build'.orEnglish('Same as daily build') },
        { value: 'userdebug' },
        { value: 'user' },
        { value: 'eng' },
    ],
    odmServerPrefix: 'work@c3-miui-ota-odm00.bj:/home/work/data/odm',
    odmList: [
        { value: '', label: '--选择ODM厂商发送--'.orEnglish('--Select ODM to send--') },
        { value: 'foxconn/', label: 'foxconn' },
        { value: 'huaqin/', label: 'huaqin' },
        { value: 'longcheer/', label: 'longcheer' },
        { value: 'wingtech/', label: 'wingtech' },
        { value: 'foxconn/userdebug/', label: 'foxconn-userdebug' },
        { value: 'huaqin/userdebug/', label: 'huaqin-userdebug' },
        { value: 'longcheer/userdebug/', label: 'longcheer-userdebug' },
        { value: 'wingtech/userdebug/', label: 'wingtech-userdebug' },
    ],
    fdsRegionList: [
        { value: 'c3', label: '北京c3（默认）'.orEnglish('Beijing c3 (Default)') },
        { value: 'awsus', label: '亚马逊美西'.orEnglish('AWS US') },
    ],
    signOptList: [
        { value: '', label: 'AUTOJUDGE' },
        { value: 'PLATFORM' },
        { value: 'SHARED' },
        { value: 'MEDIA' },
        { value: 'RELEASE' },
    ],
    jdkOptList: [
        { value: 'jdk6', label: 'JDK6' },
        { value: 'jdk7', label: 'JDK7' },
        { value: 'jdk8', label: 'JDK8' },
    ],
};

function GerritChange() {
    this.changeNumber = '';
    this.changePort = corgiFormData.changePorts[0].value;
    this.changeType = corgiFormData.changeTypes[0].value;
}
