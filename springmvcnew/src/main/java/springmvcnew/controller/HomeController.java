package springmvcnew.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String homePage(Model model) {
		System.out.println("This is home URL:");

		model.addAttribute("name", "Ajinkya Hatalage");
		List<String> friends = new ArrayList<String>();
		friends.add("Ajinkya");
		friends.add("Kunal");
		friends.add("Tejas");

		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About page:");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is Help controller:");

		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Utaam");
		modelAndView.addObject("rollnumber", 31);
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
