package com.ibm.test;

import org.json.JSONObject;

public class TextGen {
	public JSONObject gen_txt(String input){
		
		JSONObject jObject = new JSONObject();
		jObject.put("text",input);
		return jObject;
	}
}
