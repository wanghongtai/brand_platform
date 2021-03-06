/*****************************************************************
                  jQuery Validate扩展验证方法      
*****************************************************************/
// 判断整数value是否等于0 
$.validator.addMethod("isIntEqZero", function(value, element) { 
    value=parseInt(value);      
    return this.optional(element) || value==0;       
}, "整数必须为0"); 
  
// 判断整数value是否大于0
$.validator.addMethod("isIntGtZero", function(value, element) { 
     value=parseInt(value);      
     return this.optional(element) || value>0;       
}, "整数必须大于0"); 
  
// 判断整数value是否大于或等于0
$.validator.addMethod("isIntGteZero", function(value, element) { 
     value=parseInt(value);      
     return this.optional(element) || value>=0;       
}, "整数必须大于或等于0");   

// 判断整数value是否不等于0 
$.validator.addMethod("isIntNEqZero", function(value, element) { 
     value=parseInt(value);      
     return this.optional(element) || value!=0;       
}, "整数必须不等于0");  

// 判断整数value是否小于0 
$.validator.addMethod("isIntLtZero", function(value, element) { 
     value=parseInt(value);      
     return this.optional(element) || value<0;       
}, "整数必须小于0");  

// 判断整数value是否小于或等于0 
$.validator.addMethod("isIntLteZero", function(value, element) { 
     value=parseInt(value);      
     return this.optional(element) || value<=0;       
}, "整数必须小于或等于0");  

// 判断浮点数value是否等于0 
$.validator.addMethod("isFloatEqZero", function(value, element) { 
     value=parseFloat(value);      
     return this.optional(element) || value==0;       
}, "浮点数必须为0"); 
  
// 判断浮点数value是否大于0
$.validator.addMethod("isFloatGtZero", function(value, element) { 
     value=parseFloat(value);      
     return this.optional(element) || value>0;       
}, "浮点数必须大于0"); 
  
// 判断浮点数value是否大于或等于0
$.validator.addMethod("isFloatGteZero", function(value, element) { 
     value=parseFloat(value);      
     return this.optional(element) || value>=0;       
}, "浮点数必须大于或等于0");   

// 判断浮点数value是否不等于0 
$.validator.addMethod("isFloatNEqZero", function(value, element) { 
     value=parseFloat(value);      
     return this.optional(element) || value!=0;       
}, "浮点数必须不等于0");  

// 判断浮点数value是否小于0 
$.validator.addMethod("isFloatLtZero", function(value, element) { 
     value=parseFloat(value);      
     return this.optional(element) || value<0;       
}, "浮点数必须小于0");  

// 判断浮点数value是否小于或等于0 
$.validator.addMethod("isFloatLteZero", function(value, element) { 
     value=parseFloat(value);      
     return this.optional(element) || value<=0;       
}, "浮点数必须小于或等于0");  

// 判断浮点型  
$.validator.addMethod("isFloat", function(value, element) {       
     return this.optional(element) || /^[-\+]?\d+(\.\d+)?$/.test(value);       
}, "只能包含数字、小数点等字符"); 
 
// 匹配integer
$.validator.addMethod("isInteger", function(value, element) {       
     return this.optional(element) || (/^[-\+]?\d+$/.test(value) && parseInt(value)>=0);       
}, "匹配integer");  
 
// 判断数值类型，包括整数和浮点数
$.validator.addMethod("isNumber", function(value, element) {       
     return this.optional(element) || /^[-\+]?\d+$/.test(value) || /^[-\+]?\d+(\.\d+)?$/.test(value);       
}, "匹配数值类型，包括整数和浮点数");  

// 只能输入[0-9]数字
$.validator.addMethod("isDigits", function(value, element) {       
     return this.optional(element) || /^\d+$/.test(value);       
}, "只能输入0-9数字");  

$.validator.addMethod("lgDecimal", function(value, element) {
	if(saas.isNull(value)){
		return true;
	}else{
		return (value<=999999.99 && value>0);  
	}
}, '<i class="layui-icon">&#xe60b;</i> 金额超出范围（0<金额<=999999.99）'); 
// 判断中文字符 
$.validator.addMethod("isChinese", function(value, element) {       
     return this.optional(element) || /^[\u0391-\uFFE5]+$/.test(value);       
}, "只能包含中文字符。");   
 
    // 判断英文字符 
$.validator.addMethod("isEnglish", function(value, element) {       
     return this.optional(element) || /^[A-Za-z]+$/.test(value);       
}, "只能包含英文字符。");   
 
     // 手机号码验证    
$.validator.addMethod("isMobile", function(value, element) {
	var length = value.length;
	var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
	return this.optional(element) || (length == 11 && mobile.test(value));
}, '<i class="layui-icon">&#xe60b;</i> 请正确填写您的手机号码');

$.validator.addMethod("contactMobile", function(value, element) {    
	  var length = value.length;
	  value=value.replace("，",",");
	  var mobiles=value.split(",");
	  var isOk=true;
	  for(var i=0;i<mobiles.length;i++){
		  if(!/^1(3|4|5|7|8)\d{9}$/.test(mobiles[i])){
			  return false;
		  }
	  }
	  return this.optional(element) ||  isOk;    
	}, "请正确填写您的手机号码。");

// 只能输入[0-9]数字
$.validator.addMethod("isMoney", function(value, element) { 
    return this.optional(element) ||/^([1-9][\d]{0,6})(\.[\d]{1,2})?$/.test(value);
}, '<i class="layui-icon">&#xe60b;</i> 金额格式不正确');  


// 电话号码验证    
$.validator.addMethod("isPhone", function(value, element) {    
  var tel = /^(\d{3,4}-?)?\d{7,9}$/g;    
  return this.optional(element) || (tel.test(value));    
}, "请正确填写您的电话号码。");

// 联系电话(手机/电话皆可)验证   
$.validator.addMethod("isTel", function(value,element) {   
    var length = value.length;   
    var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
    var tel = /^(\d{3,4}-?)?\d{7,9}$/g;       
    return this.optional(element) || tel.test(value) || (length==11 && mobile.test(value));   
}, '<i class="layui-icon">&#xe60b;</i> 请输入正确的电话号码'); 
 
     // 匹配qq      
$.validator.addMethod("isQq", function(value, element) {       
     return this.optional(element) || /^[1-9]\d{4,12}$/;       
}, "匹配QQ");   
 
     // 邮政编码验证    
$.validator.addMethod("isZipCode", function(value, element) {    
  var zip = /^[0-9]{6}$/;    
  return this.optional(element) || (zip.test(value));    
}, "请正确填写您的邮政编码。");  

// 匹配密码，以字母开头，长度在6-12之间，只能包含字符、数字和下划线。      
$.validator.addMethod("isPwd", function(value, element) {       
     return this.optional(element) || /^[a-zA-Z]\\w{6,12}$/.test(value);       
}, "以字母开头，长度在6-12之间，只能包含字符、数字和下划线。");  

// 身份证号码验证
$.validator.addMethod("isIdCardNo", function(value, element) { 
  //var idCard = /^(\d{6})()?(\d{4})(\d{2})(\d{2})(\d{3})(\w)$/;
  return this.optional(element) || isIdCardNo(value);    
}, "请输入正确的身份证号码。"); 

//营业执照验证
$.validator.addMethod("businessLicense", function(value, element) { 
var businessLicense = /\d{15}/;
return this.optional(element) ||(businessLicense.test(value));    
}, "请输入正确的营业执照号码。"); 

// IP地址验证   
$.validator.addMethod("ip", function(value, element) {    
  return this.optional(element) || /^(([1-9]|([1-9]\d)|(1\d\d)|(2([0-4]\d|5[0-5])))\.)(([1-9]|([1-9]\d)|(1\d\d)|(2([0-4]\d|5[0-5])))\.){2}([1-9]|([1-9]\d)|(1\d\d)|(2([0-4]\d|5[0-5])))$/.test(value);    
}, "请填写正确的IP地址。");
   
    // 字符验证，只能包含中文、英文、数字、下划线等字符。    
$.validator.addMethod("stringCheck", function(value, element) {       
     return this.optional(element) || /^[a-zA-Z0-9\u4e00-\u9fa5-_]+$/.test(value);       
}, "只能包含中文、英文、数字、下划线等字符");   
   
    // 匹配english  
$.validator.addMethod("isEnglish", function(value, element) {       
     return this.optional(element) || /^[A-Za-z]+$/.test(value);       
}, "匹配english");   

// 匹配汉字  
$.validator.addMethod("isChinese", function(value, element) {       
     return this.optional(element) || /^[\u4e00-\u9fa5]+$/.test(value);       
}, "匹配汉字");   

// 匹配中文(包括汉字和字符) 
$.validator.addMethod("isChineseChar", function(value, element) {       
     return this.optional(element) || /^[\u0391-\uFFE5]+$/.test(value);       
}, "匹配中文(包括汉字和字符) "); 
  
// 判断是否为合法字符(a-zA-Z0-9-_)
$.validator.addMethod("isRightfulString", function(value, element) {       
     return this.optional(element) || /^[A-Za-z0-9_-]+$/.test(value);       
}, "判断是否为合法字符(a-zA-Z0-9-_)");   

// 判断是否包含中英文特殊字符，除英文"-_"字符外
$.validator.addMethod("isContainsSpecialChar", function(value, element) {  
     var reg = RegExp(/[(\ )(\`)(\~)(\!)(\@)(\#)(\$)(\%)(\^)(\&)(\*)(\()(\))(\+)(\=)(\|)(\{)(\})(\')(\:)(\;)(\')(',)(\[)(\])(\.)(\<)(\>)(\/)(\?)(\~)(\！)(\@)(\#)(\￥)(\%)(\…)(\&)(\*)(\（)(\）)(\—)(\+)(\|)(\{)(\})(\【)(\】)(\‘)(\；)(\：)(\”)(\“)(\’)(\。)(\，)(\、)(\？)]+/);   
     return this.optional(element) || !reg.test(value);       
}, "含有中英文特殊字符"); 

//增加身份证验证
function isIdCardNo(num) {
    var factorArr = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1);
    var parityBit = new Array("1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2");
    var varArray = new Array();
    var intValue;
    var lngProduct = 0;
    var intCheckDigit;
    var intStrLen = num.length;
    var idNumber = num;
    // initialize
    if ((intStrLen != 15) && (intStrLen != 18)) {
        return false;
    }
    // check and set value
    for (i = 0; i < intStrLen; i++) {
        varArray[i] = idNumber.charAt(i);
        if ((varArray[i] < '0' || varArray[i] > '9') && (i != 17)) {
            return false;
        } else if (i < 17) {
            varArray[i] = varArray[i] * factorArr[i];
        }
    }
    if (intStrLen == 18) {
        //check date
        var date8 = idNumber.substring(6, 14);
        if (isDate8(date8) == false) {
            return false;
        }
        // calculate the sum of the products
        for (i = 0; i < 17; i++) {
            lngProduct = lngProduct + varArray[i];
        }
        // calculate the check digit
        intCheckDigit = parityBit[lngProduct % 11];
        // check last digit
        if (varArray[17] != intCheckDigit) {
            return false;
        }
    }
    else {        //length is 15
        //check date
        var date6 = idNumber.substring(6, 12);
        if (isDate6(date6) == false) {
            return false;
        }
    }
    return true;
}
function isDate6(sDate) {
    if (!/^[0-9]{6}$/.test(sDate)) {
        return false;
    }
    var year, month, day;
    year = sDate.substring(0, 4);
    month = sDate.substring(4, 6);
    if (year < 1700 || year > 2500) return false
    if (month < 1 || month > 12) return false
    return true
}

function isDate8(sDate) {
    if (!/^[0-9]{8}$/.test(sDate)) {
        return false;
    }
    var year, month, day;
    year = sDate.substring(0, 4);
    month = sDate.substring(4, 6);
    day = sDate.substring(6, 8);
    var iaMonthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    if (year < 1700 || year > 2500) return false
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) iaMonthDays[1] = 29;
    if (month < 1 || month > 12) return false
    if (day < 1 || day > iaMonthDays[month - 1]) return false
    return true
}

//自定义下拉框验证
var buildValidSelect = function(selectName){
	var select = $("select[name='"+selectName+"']").next().find("input");
	if(saas.isNull(select.val()) && $('#'+selectName+'-error').length == 0){
		select.after('<label id="'+selectName+'-error" class="select-error" for="'+selectName+'"><i class="layui-icon">&#xe60b;</i> 必填</label>');
	}
	return false;
}



/*******************************layui 自定义验证***********************************/
layui.use(['form', 'laydate'], function() {
	var form = layui.form,laydate = layui.laydate;
	
	//验证
	form.verify({
		//电话
		gqgx_phone : function(value,item) {
			var length = value.length;
			var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
			if(length == 0 || (length == 11 && mobile.test(value))){
				
			}else{
				return '请填写正确的手机号码';
			}
		},
		//金额
		gqgx_amount : function(value,item) { 
			if(saas.isNotNull(value) && !(/^([1-9][\d]{0,8})(\.[\d]{1,2})?$/).test(value)){
				return '金额格式不对（0<金额<100000000）';
			}
		},
		//客手机号是否存在
		gqgx_mobileIsExists : function(value,item){
			var result = false;
        	var data={customerMobile: value,id:$("#customerId").val()};
        	saas.ajax({
        		type:"post",
        		url:"/customer/mobileIsExists",
        		data:data,
        		dataType:"json",
        		async:false,	
        		success : function(data) {
        			if(data == 1){
        				result = true;
        			}
        		}
        	});
        	if(result){
        		return '客户手机已存在！';
        	}
		}
	});
})