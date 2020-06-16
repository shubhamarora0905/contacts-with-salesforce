package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/")
	public ModelAndView loadHomePage() {
		List<Contact> contacts = contactService.getAllContacts();
		contacts.removeIf(n -> n == null);
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("contacts", contacts);
		modelMap.put("contactForBinding", new Contact());
		return new ModelAndView("homepage", "modelMap", modelMap);
	}
	
}
