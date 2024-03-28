package com.example.vika.service;

import com.example.vika.model.Contact;
import com.example.vika.repository.ContactRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ContactImpl {
    private final ContactRepository contactRepository ;

   public List<Contact> contactList(){
        return contactRepository.findAll();
    }
    public void saveContact(Contact contact){
       contactRepository.save(contact);
    }
}
