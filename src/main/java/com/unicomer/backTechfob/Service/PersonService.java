package com.unicomer.backTechfob.Service;

import org.springframework.stereotype.Service;

import com.unicomer.backTechfob.Model.Person;
import com.unicomer.backTechfob.Repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;

    public void createPerson(Person person){
        
        personRepo.save(person);

    }


}
