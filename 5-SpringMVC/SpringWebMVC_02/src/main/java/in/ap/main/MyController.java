package in.ap.main;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ap.beans.User;
import jakarta.servlet.http.HttpServletRequest;



@Controller
public class MyController
{	
	@GetMapping("/openHello")
	public ModelAndView openHelloPage() {
		
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("hello");
	    
	    return mav;
	}
	@GetMapping("/myForm")
	public String openMyForm()
	{	
		return "my-form";
	}
	
	
	@PostMapping("/submitForm")
	public String handleMyForm(@ModelAttribute User user)
	{
		
		System.out.println("Name :" + user.getName());
		System.out.println("Email :" + user.getEmail());
		System.out.println("City :" + user.getCity());
	
		
		return "profile";
		//==============================================================//
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam ("name") String myname,
//			@RequestParam ("email") String myemail,
//			@RequestParam ("city") String mycity,
//			Model model
//			
//			)
//	{
//		
//		System.out.println("Name :" + myname);
//		System.out.println("Email :" + myemail);
//		System.out.println("City :" + mycity);
//		
//		User user = new User();
//		user.setName(myname);
//		user.setEmail(myemail);
//		user.setCity(mycity);
//		
//		model.addAttribute("model_user", user);
	
		
//		model.addAttribute("model_name", myname);
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_city", mycity);
		
//		return "profile";
//	}
	
	//==============================================================//
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(HttpServletRequest req)
//	{
//		String myname = req.getParameter("name");
//		String myemail = req.getParameter("email");
//		String mycity = req.getParameter("city");
//		
//		System.out.println("Name :" + myname);
//		System.out.println("Email :" + myemail);
//		System.out.println("City :" + mycity);
//		
//		return "profile";
//	}

}


