package com.parthib.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String HelloWorld() {
		return "Hello I am Lucy! What are you doing man";
	}

	/*
	 * @RequestMapping("say-hello-html")
	 * 
	 * @ResponseBody public String HelloWorldHTML() { StringBuffer sb = new
	 * StringBuffer(); sb.append("<html>"); sb.append("<head>");
	 * sb.append("<title>"); sb.append("My First MVC app with jsp");
	 * sb.append("</title>"); sb.append("</head>"); sb.append("<body>");
	 * sb.append("Hello I am Lucy. I am the king of my own made kingdom.");
	 * sb.append("</body>"); sb.append("</html>");
	 * 
	 * return sb.toString(); }
	 */

	@RequestMapping("say-hello-jsp")
	public String HelloWordJSP() {
		return "SayHello";
	}
}
