package com.ibm.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TextService {
	
	@RequestMapping(value = "/textservice", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String textServicePost(HttpServletRequest req, HttpServletResponse resp) {
		resp.addHeader("Access-Control-Allow-Origin", "*");
		resp.setContentType("application/json;encode=utf8");
		JSONObject result=new JSONObject();		
		TextGen tGen = new TextGen();
		try {
			result = tGen.gen_txt("hello world new");
			return result.toString();
		} catch (Exception e) {
			result.put("ret", 1);
			result.put("status", "500");
			result.put("msg", e.getMessage());
			return result.toString();
		}
	}
}
