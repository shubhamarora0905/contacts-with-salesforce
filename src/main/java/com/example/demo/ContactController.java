package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;

	@PostMapping("/contacts")
	public void addContact(@RequestBody Contact c) {
		contactService.addContact(c);
	}

	@GetMapping("/contacts")
	public List<Contact> getAllContacts() {
		return contactService.getAllContacts();
	}

	@GetMapping("/add")
	public ModelAndView addContact() {
		return new ModelAndView("addContact", "contact", new Contact());
	}

	@PostMapping("/saveContact")
	public ModelAndView saveContact(@Validated Contact contact, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return null;
		} else {
			contactService.addContact(contact);
			return new ModelAndView("redirect:/");
		}
	}
}
