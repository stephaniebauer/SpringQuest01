package com.wildcodeschool.quest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class Quest01Application {

	public static void main(String[] args) {
		SpringApplication.run(Quest01Application.class, args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return"Dr. Who: <ul><li><a href='/firstdoctor'>First Doctor</a></li>"
				+ "<li><a href='/seconddoctor'>Second Doctor</a></li>"
				+ "<li><a href='/thirddoctor'>Third Doctor</a></li>"
				+ "<li><a href='/fourthdoctor'>Fourth Doctor</a></li></ul>";
	}	
	
	@RequestMapping("/firstdoctor")
	@ResponseBody
	public String first() {
		return"William Hartnell";
	}
	
	@RequestMapping("/seconddoctor")
	@ResponseBody
	public String second() {
		return"Patrick Troughton";
	}
	
	@RequestMapping("/thirddoctor")
	@ResponseBody
	public String third() {
		return"Jon Pertwee";
	}
	
	@RequestMapping("/fourthdoctor")
	@ResponseBody
	public String fourth() {
		return"Tom Baker";
	}
	

}