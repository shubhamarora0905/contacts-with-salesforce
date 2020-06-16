package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepo;

	public void addContact(Contact c) {
		contactRepo.save(c);
	}

	public List<Contact> getAllContacts() {
		List<Contact> contacts = new ArrayList<>();
		contactRepo.findAll().forEach(contacts::add);
		return contacts;
	}
}
