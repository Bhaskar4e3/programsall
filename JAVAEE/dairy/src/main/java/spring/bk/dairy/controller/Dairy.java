package spring.bk.dairy.controller;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.bk.dairy.Business.Business;
import spring.bk.dairy.Entities.User;
@Controller
@Component
public class Dairy {
	@Autowired
	private Business business;
	
	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	@RequestMapping(value="/home")
	public ModelAndView loginPage() {
		
		
		ModelAndView out=new ModelAndView("homepage");
		return out;
	}

		@RequestMapping(value="/register")
		public ModelAndView registerPage() {
			ModelAndView out=new ModelAndView("registrationpage");
			return out;
		}
       @ModelAttribute
		@RequestMapping(value="/reg")
		public ModelAndView registered(@ModelAttribute("User") User user) {
    	   System.out.println(user.getUsername());
			business.save(user);
			
			ModelAndView out=new ModelAndView("regsuccess");
			return out;
		}
            
     		@RequestMapping(value="/log")
     		public ModelAndView  autheticate(@ModelAttribute("User") User user) {
     			ModelAndView out=new ModelAndView("homepage");
     		
    	   @SuppressWarnings("unused")
		String name=user.getUsername();
    	   //System.out.println(user.getUsername()+" "+user.getPassword());
    	   User user1=business.getByString(user.getUsername());
    	   if(user1!=null && user.getPassword().equals(user1.getPassword())) {
    		   out.addObject("user",user1);
    		   out=new ModelAndView("userlogin");
    	   }
    	   
    	   
		return out;
    	  
     		}
}