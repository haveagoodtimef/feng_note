/**
 * 登录功能
 */

function loginAction(){
	var name = $("#count").val();
	var pass = $("#password").val();
	var url = "/user/login";
	var data = {name:name,"password":pass};
	$.get(url,data,function(result){
		alert(result);
	});
}

$(function(){
	$("#login").click(loginAction);
});


/**
 * 登录与注册切换的功能.
 * 
 */
$(function(){
	function get(e){
		return document.getElementById(e);
	}
	get("sig_in").onclick=function(){
		get("dl").className="log log_out";
		get("zc").className="sig sig_in";
	}
	get("back").onclick=function(){
		get("zc").className="sig sig_out";
		get("dl").className="log log_in";
	}
	
	var t =setTimeout(get("zc").style.visibility="visible",800);
	get("final_password").onblur=function(){
		var npassword=get("regist_password").value;
		var fpassword=get("final_password").value;
		if(npassword!=fpassword){
			get("warning_3").style.display="block";
		}
	}
	get("regist_password").onblur=function(){
		var npassword=get("regist_password").value.length;
		if(npassword<6&&npassword>0){
			get("warning_2").style.display="block";
		}
	}
	get("regist_password").onfocus=function(){
		get("warning_2").style.display="none";
	}
	get("final_password").onfocus=function(){
		get("warning_3").style.display="none";
	}
});