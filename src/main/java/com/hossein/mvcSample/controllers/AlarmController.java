package com.hossein.mvcSample.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hossein.mvcSample.model.Alarm;

@Controller
public class AlarmController {

	@RequestMapping("/alarm")
	public String ringAlarm(Model model) {
		
		Alarm alarm = new Alarm();
		alarm.setMessage("Welcome To a Spring MVC Project");
		alarm.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("alarm", alarm);
		
		return "alarm";
	}
	
	
}
