package com.example.shopping.util;


import com.example.shopping.model.ProductOrder;
import com.example.shopping.model.UserDtls;
import com.example.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.security.Principal;

@Component
public class CommonUtil {

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private UserService userService;
	
	String msg=null;;
	
	public Boolean sendMailForProductOrder(ProductOrder order, String status) throws Exception
	{
//		msg="<p>Hello [[name]],</p>"
//				+ "<p>Thank you order <b>[[orderStatus]]</b>.</p>"
//				+ "<p><b>Product Details:</b></p>"
//				+ "<p>Name : [[productName]]</p>"
//				+ "<p>Category : [[category]]</p>"
//				+ "<p>Quantity : [[quantity]]</p>"
//				+ "<p>Price : [[price]]</p>"
//				+ "<p>Payment Type : [[paymentType]]</p>";
//
//		MimeMessage message = mailSender.createMimeMessage();
//		MimeMessageHelper helper = new MimeMessageHelper(message);
//
//		helper.setFrom("stor@gmail.com", "Shooping Cart");
//		helper.setTo(order.getOrderAddress().getEmail());
//
//		msg=msg.replace("[[name]]",order.getOrderAddress().getFirstName());
//		msg=msg.replace("[[orderStatus]]",status);
//		msg=msg.replace("[[productName]]", order.getProduct().getTitle());
//		msg=msg.replace("[[category]]", order.getProduct().getCategory());
//		msg=msg.replace("[[quantity]]", order.getQuantity().toString());
//		msg=msg.replace("[[price]]", order.getPrice().toString());
//		msg=msg.replace("[[paymentType]]", order.getPaymentType());
//
//		helper.setSubject("Product Order Status");
//		helper.setText(msg, true);
//		mailSender.send(message);
		return true;
	}
	
	public UserDtls getLoggedInUserDetails(Principal p) {
		String email = p.getName();
		UserDtls userDtls = userService.getUserByEmail(email);
		return userDtls;
	}
}
