package studentregistration.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import studentregistration.model.UserBean;
import studentregistration.persistant.dao.UserDAO;
import studentregistration.persistant.dto.UserRequestDTO;
//import studentregistration.persistant.dao.UserDAO;
//import studentregistration.persistant.dto.UserRequestDTO;
import studentregistration.persistant.dto.UserResponseDTO;

@Controller
public class UserManagementController {
	@Autowired
	private UserDAO dao;
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String displayView(ModelMap model) {
//		UserRequestDTO dto=new UserRequestDTO();
//	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView showLogin() {
		return new ModelAndView("login", "bean", new UserBean());		
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView showwelcome() {
		return new ModelAndView("welcome", "bean", new UserBean());		
	}
	
	@RequestMapping(value="/loginprocess", method=RequestMethod.POST)
	public String loginprocess(@ModelAttribute("bean") @Validated UserBean bean,
			BindingResult bs, ModelMap model) {		
		if(bs.hasErrors()) {
			return "login";
		}
		UserRequestDTO dto=new UserRequestDTO();
		dto.setUserId(bean.getUserId());
		dto.setUserName(bean.getUserName());
		dto.setUserPassword(bean.getUserPassword());
		ArrayList<UserResponseDTO> res=dao.validateUser(dto);
		if(res.size()==0) {
			model.addAttribute("error", "User Name or Password is incorrect!");
			return "login";
		}else {
		model.addAttribute("list", res);		
		return "welcome";
		}
	}
	
	@RequestMapping(value="/usr001", method=RequestMethod.GET)
	public ModelAndView showusr001() {
		return new ModelAndView("usr001", "bean", new UserBean());		
	}
	
	/*@RequestMapping(value="/usr001process", method=RequestMethod.GET)
	public String displayView(ModelMap model) {
		ArrayList<UserResponseDTO> list = dao.selectALL();
		model.addAttribute("list", list);
		return "usr001";
	}*/
	
	@RequestMapping(value="/usr001process", method=RequestMethod.POST)	
	public String searchUserProcess(@ModelAttribute("bean") UserBean bean, ModelMap model) {			
		UserRequestDTO dto=new UserRequestDTO();
		dto.setUserId(bean.getUserId());
		dto.setUserName(bean.getUserName());		
		ArrayList<UserResponseDTO> res=dao.userSearch(dto);
		if(res.size()==0) {
			model.addAttribute("error", "No Data Found.");
			return "usr001";
		}else {
		model.addAttribute("list", res);		
		return "usr001";
		}
		
		
	}
	
	
	
	
	
}
