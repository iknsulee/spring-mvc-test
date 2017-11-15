package kr.co.zyosoft;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private String member;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home_1(Locale locale, Model model) {

		System.out.println("TEST111");

		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/cafe", method = RequestMethod.GET)
	public String cafe(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "cafe";
	}

	@RequestMapping(value = "/webtoon", method = RequestMethod.GET)
	public String webtoon(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "webtoon";
	}

}
