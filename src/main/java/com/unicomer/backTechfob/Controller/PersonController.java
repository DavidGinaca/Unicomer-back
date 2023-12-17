package com.unicomer.backTechfob.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicomer.backTechfob.Model.Person;
import com.unicomer.backTechfob.Service.PersonService;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void createPerson(@RequestBody Person person){
        personService.createPerson(person);

    }

}
