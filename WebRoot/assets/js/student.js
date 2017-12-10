//获取上方导航元素
var Alerts = $(".Alerts");
var PersonalManagement = $(".PersonalManagement");
var MaterialManagement=$(".MaterialManagement");

//获取左侧边导航块
var LeftPM=$("#LeftPM");
var LeftMM=$("#LeftMM");
var LeftAlerts=$("#LeftAlerts");

//获取左侧边导航详细元素
var CommonFile = $(".CommonFile");
var Notification = $(".Notification");
var PersonalInformation = $(".PersonalInformation");
var PartyInformation = $(".PartyInformation");
var RewardsAndPunishments= $(".RewardsAndPunishments");
var UploadedMaterial= $(".UploadedMaterial");
var UploadMaterial= $(".UploadMaterial");
var ApplicationMaterial= $(".ApplicationMaterial");

//获取中间内容块
var MidCommonFile = $(".MidCommonFile");
var MidNotification = $(".MidNotification");
var MidPersonalInformation = $(".MidPersonalInformation");
var MidPartyInformation = $(".MidPartyInformation");
var MidRewardsAndPunishments= $(".MidRewardsAndPunishments");
var MidUploadedMaterial= $(".MidUploadedMaterial");
var MidUploadMaterial= $(".MidUploadMaterial");
var MidApplicationMaterial=$(".MidApplicationMaterial");

//获取左侧导航栏详细元素的Li
var LeftPMLi = $("#LeftPM li");
var LeftMMLi=$("#LeftMM Li");
var LeftAlertsLi=$("#LeftAlerts  Li");





//更换导航栏被选中的元素背景
function changChoose(object,k){
    object.eq(k).addClass("active").siblings().removeClass("active");
}

//初始化页面
window.onload = initPage();
function initPage(){
	changChoose(LeftPMLi,0);
    LeftPM.show();
    LeftMM.hide();
    LeftAlerts.hide();
	MidPersonalInformation.show();
	MidPartyInformation.hide();
	MidRewardsAndPunishments.hide();
	MidUploadedMaterial.hide();
	MidUploadMaterial.hide();
	MidCommonFile.hide();
    MidNotification.hide();
    MidApplicationMaterial.hide();
}

//上方导航元素被点击以后
PersonalManagement.click(function(){   //上方个人管理
    LeftAlerts.hide();
    LeftPM.show();
    LeftMM.hide();
    PersonalInformation.click();
});
MaterialManagement.click(function(){  //上方材料管理
    LeftAlerts.hide();
    LeftPM.hide();
    LeftMM.show();
    UploadedMaterial.click();
});
Alerts.click(function(){     //上方消息通知
    LeftAlerts.show();
    LeftPM.hide();
    LeftMM.hide();
    CommonFile.click();
});

//左侧导航个人信息
PersonalInformation.click(function(){ 
    changChoose(LeftPMLi,0);
    MidCommonFile.hide();
    MidNotification.hide();
	MidPersonalInformation.show();
	MidPartyInformation.hide();
	MidRewardsAndPunishments.hide();
	MidUploadedMaterial.hide();
	MidUploadMaterial.hide();
	MidApplicationMaterial.hide();
});
//左侧党籍信息
PartyInformation.click(function(){
    changChoose(LeftPMLi,1); 
    MidCommonFile.hide();
    MidNotification.hide();
	MidPersonalInformation.hide();
	MidPartyInformation.show();
	MidRewardsAndPunishments.hide();
	MidUploadedMaterial.hide();
	MidUploadMaterial.hide();
	MidApplicationMaterial.hide();
});
//左侧奖惩信息
RewardsAndPunishments.click(function(){  
	changChoose(LeftPMLi,2); 
    MidCommonFile.hide();
    MidNotification.hide();
	MidPersonalInformation.hide();
	MidPartyInformation.hide();
	MidRewardsAndPunishments.show();
	MidUploadedMaterial.hide();
	MidUploadMaterial.hide();
	MidApplicationMaterial.hide();
});
//左侧已上传材料
UploadedMaterial.click(function(){ 
    changChoose(LeftMMLi,0);  
    MidCommonFile.hide();
    MidNotification.hide();
	MidPersonalInformation.hide();
	MidPartyInformation.hide();
	MidRewardsAndPunishments.hide();
	MidUploadedMaterial.show();
	MidUploadMaterial.hide();
	MidApplicationMaterial.hide();
});
//左侧材料上传
UploadMaterial.click(function(){ 
    changChoose(LeftMMLi,1); 
    MidCommonFile.hide();
    MidNotification.hide();
	MidPersonalInformation.hide();
	MidPartyInformation.hide();
	MidRewardsAndPunishments.hide();
	MidUploadedMaterial.hide();
	MidUploadMaterial.show();
	MidApplicationMaterial.hide();
});
//左侧申请认证
ApplicationMaterial.click(function(){
	changChoose(LeftMMLi,2); 
    MidCommonFile.hide();
    MidNotification.hide();
	MidPersonalInformation.hide();
	MidPartyInformation.hide();
	MidRewardsAndPunishments.hide();
	MidUploadedMaterial.hide();
	MidUploadMaterial.hide();
	MidApplicationMaterial.show();
	
});
//左侧常用文件
CommonFile.click(function(){  
	changChoose(LeftAlertsLi,0); 
    MidCommonFile.show();
    MidNotification.hide();
	MidPersonalInformation.hide();
	MidPartyInformation.hide();
	MidRewardsAndPunishments.hide();
	MidUploadedMaterial.hide();
	MidUploadMaterial.hide();
	MidApplicationMaterial.hide();
});
//左侧查看通知
Notification.click(function(){ 
    changChoose(LeftAlertsLi,1); 
    MidCommonFile.hide();
    MidNotification.show();
	MidPersonalInformation.hide();
	MidPartyInformation.hide();
	MidRewardsAndPunishments.hide();
	MidUploadedMaterial.hide();
	MidUploadMaterial.hide();
	MidApplicationMaterial.hide();
});



$("#showntype").change(function (){   
	var showntype=document.getElementById("showntype");
	var selectTest2=document.getElementById("selectTest2");
	var cet4add=document.getElementById("cet4add");
//	var showntype= $("#showntype");
//	var selectTest2=$("#selectTest2");
	
	if(showntype.value.equals("1")){
		selectTest2.length=7;
		selectTest2.options[1].value="1";
		selectTest2.options[1].text="全国计算机二级合格";
		selectTest2.options[2].value="2";
		selectTest2.options[2].text="全国计算机二级优秀";
		selectTest2.options[3].value="3";
		selectTest2.options[3].text="全国计算机三级合格";
		selectTest2.options[4].value="4";
		selectTest2.options[4].text="全国计算机三级优秀";
		selectTest2.options[5].value="5";
		selectTest2.options[5].text="全国计算机四级合格";
		selectTest2.options[6].value="6";
		selectTest2.options[6].text="全国计算机四级优秀";
	}
	else if(showntype.value.equals("2")){
		alert("aaa");
//		cet4add.removeChild(selectTest2);
//		var newinput = document.createElement("newInput");
//		newinput.type = mytype;
//		newinput.id = "newInput";
//		var newline= document.createElement("br");  
//		cet4add.appendChild(newline);
}
});

String.prototype.equals = function(s){  
    return this == s;  
} 










