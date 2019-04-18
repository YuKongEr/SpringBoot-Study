   $(function(){
   	$(".icon-ok-sign").click(function(){
	    verify = $(this).hasClass('boxcol') ? 0 : 1;
	    $(this).toggleClass('boxcol');
	    ob = $('input[name=agree]');
	    ob.val(ob.val()==0?1:0);
	    ob.val(ob.val() !== verify ? verify : ob.val());

	    ob.val() == 0 ? $('#errormsg').removeClass('hide').addClass('show') : $('#errormsg').removeClass('show').addClass('hide');
    });
   	//输入框输入时模拟placeholder效果
   	var oInput = $(".form-data input");
   	oInput.focus(function () {
		$(this).siblings("label").hide();
    });
   	oInput.blur(function () {
		if($(this).val()==""){
			$(this).siblings("label").show();
		}
	});
   	// 输入框内容变化按钮颜色发生变化
   	oInput.keyup(function () {
		if($(this).val()!="jquery.js"){
			$(".log-btn").removeClass("off")
		}else{
            $(".log-btn").addClass("off")
		}
    });


   //     $(".form-data").delegate(".send","click",function () {
   //     	var oTime = $(".form-data .time"),
			// oSend = $(".form-data .send"),
			// num = parseInt(oTime.text()),
			// oEm = $(".form-data .time em");
		 //   $(this).hide();
		 //   oTime.removeClass("hide");
		 //   var timer = setInterval(function () {
		 //   	var num2 = num-=1;
   //             oEm.text(num2);
   //             if(num2==0){
   //                 clearInterval(timer);
   //                 oSend.text("重新发送验证码");
			// 	   oSend.show();
   //                 oEm.text("60");
   //                 oTime.addClass("hide");
   //             }
   //         },1000);
   //     });
	// $(".message").click(function () {
	// 	$(this).addClass("on");
 //        $(".account_number").removeClass("on");
	// 	$(".form2").removeClass("hide");
	// 	$(".form1").addClass("hide")
 //    });
	// $(".account_number").click(function () {
 //        $(this).addClass("on");
 //        $(".message").removeClass("on");
 //           $(".form2").addClass("hide");
 //           $(".form1").removeClass("hide")
 //       })
   });
   