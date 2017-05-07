/**
 * 
 */
package br.com.makersweb.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author anderson.aristides
 *
 */
@Controller
public class LoginController {

	private static String GO_LOGIN = "login";
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "redirect:plain/login.html";
	}

	@RequestMapping(value = "login.html")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView(GO_LOGIN);

		return mav;
	}

}
