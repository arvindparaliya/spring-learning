package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	//@RequestMapping(value="/helloPage", method=RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {
		
		System.out.println("openHelloPage() method executed");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		
		return mav;
		
	}
	
	@GetMapping("/aboutUs")
	public  String openAboutUsPage() {
		
		return "about-us";
	}
	
	@GetMapping("/myForm")
	public  String openMyFormPage() {
		
		return "my-form";
	}
	
	@PostMapping("/submitForm")
	public  String handleForm(@ModelAttribute User user) {
		
	System.out.println("Name :" + user.getName());
	System.out.println("Email :" + user.getEmail());
	System.out.println("Phone :" + user.getPhone());
	
		return "profile";
	}
	
	
	
//	@PostMapping("/submitForm")
//	public  String handleForm(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phone1") String myphone,
//			Model model 
//			
//			) {
//	System.out.println("Name :" + myname);
//	System.out.println("Email :" + myemail);
//	System.out.println("Phone :" + myphone);
//		
//	User user = new User();
//	user.setName(myname);
//	user.setEmail(myemail);
//	user.setPhone(myphone);
//	
//	model.addAttribute("model_user", user);
//	
//		return "profile";
//	}
	

	
	
//	@PostMapping("/submitForm")
//	public  String handleForm(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phone1") String myphone,
//			Model model 
//			
//			) {
//	System.out.println("Name :" + myname);
//	System.out.println("Email :" + myemail);
//	System.out.println("Phone :" + myphone);
//		
//	model.addAttribute("model_name", myname);
//	model.addAttribute("model_email", myemail);
//	model.addAttribute("model_phone", myphone);
//	
//		return "profile";
//	}
	
	
//	@PostMapping("/submitForm")
//	public  String handleForm(HttpServletRequest req) {
//		String myname = req.getParameter("name1");
//		String myemail = req.getParameter("eamil1");
//		String myphone = req.getParameter("phone1");
//		
//		System.out.println("Name :" + myname);
//		System.out.println("Email :" + myemail);
//		System.out.println("Phone :" + myphone);
//		
//		return "profile";
//	}
}
