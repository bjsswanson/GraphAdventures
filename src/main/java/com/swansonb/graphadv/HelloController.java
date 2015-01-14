package com.swansonb.graphadv;

import com.swansonb.graphadv.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@SuppressWarnings("SpringJavaAutowiringInspection")
	@Autowired
	StoryRepository helloInject;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", helloInject.toString());
		return "hello";
	}
}