package com.theismann.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM d, ''yyyy");
		String formattedDate = formatter.format(date);
		
		model.addAttribute("date", formattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH: mm: ss");
		String formattedTime = formatter.format(date);
		
		model.addAttribute("date", formattedTime);
		return "time.jsp";
	}
}
