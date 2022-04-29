package com.rtw.Project2.Services;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class P2DBPass {
	
	String robDBUsrN;
	String robDBPass;
	
	@RequestMapping("/")
	public Model modelUser() {
		Model mdl=null; 
		robDBUsrN="postgres";
		mdl.addAttribute( "robDBUsrN", robDBUsrN);
	//model.addAttribute(String x) {
		return mdl;
	}
	@RequestMapping("/") 
	public Model modelPass() {
		Model mdl1=null; 
		robDBPass="techSavvy1213!!";
		mdl1.addAttribute( "robDBPassN",robDBPass);
	//model.addAttribute(String x) {
		return mdl1;
	}
}
