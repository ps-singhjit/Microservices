package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import com.contact.contact_service.entity.Contact;

import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    // fake list of contacts
    List<Contact> list = List.of(
            new Contact(1L, "UserOne@email.com", "User One", 1311L),
            new Contact(12L, "UserOne_two@email.com", "User One_two", 1311L),
            new Contact(2L, "UserTwo@email.com", "User Two", 1312L),
            new Contact(21L, "UserTwo_one@email.com", "User Two_one", 1312L),
            new Contact(23L, "UserTwo_three@email.com", "User Two_three", 1312L),
            new Contact(3L, "UserThree@email.com", "User Three", 1313L));

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
