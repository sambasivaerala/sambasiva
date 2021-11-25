
package mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class control {
	@RequestMapping("/intr")
	public ModelAndView hello(@RequestParam float t1,@RequestParam float t2,@RequestParam float t3) {
		float c=(t1*t2*t3)/100;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("intrest", c);
		return mv;
		
	}
}