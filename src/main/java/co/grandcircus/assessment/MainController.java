package co.grandcircus.assessment;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String Home() {
		return "home";
	
	}
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	
	}
	
		
	@PostMapping("/login-submit")
	public String LoginSubmit(
		@RequestParam String name, 
		@RequestParam String password,
		Model model ) {
		
		String UpperCase = name.toUpperCase();
		System.out.println("UpperCase");
		
		int Length = name.length(); 
		
		model.addAttribute("name", UpperCase);
		model.addAttribute("length", Length);
		
		if (password.equals("open sesame")) {
			return "welcome";
		
		} else {
		    return "error"; 	
		}
				
	}	
}
