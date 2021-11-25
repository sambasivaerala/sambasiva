package eight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import eight.Emp;
import eight.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService eservice;

	@RequestMapping(value= "/viewemp/{page_id}", method= RequestMethod.GET) 
	public ModelAndView paginate(@PathVariable int page_id) {		
		int total = 5;
		if( page_id == 1 ) {
		} else {			
			page_id = ( page_id - 1 ) * total + 1;  
		}

		List<Emp> list = eservice.getEmployeesByPage( page_id, total );

		return new ModelAndView("viewemps", "list", list);  
	}
}
