package com.zhang.myspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zhang.myspringboot.model.Person;
import com.zhang.myspringboot.service.IPersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	@Qualifier("personService")
	private IPersonService personService;

    @RequestMapping("/get")
    @ResponseBody
    Person getPerson(@RequestParam("id")int id) {
        return personService.getPerson(id);
    }
    
    @RequestMapping("/save")
    @ResponseBody
    boolean savePerson(@RequestParam("person")String personStr) throws Exception {
    		Person person = JSON.parseObject(personStr, Person.class);
        return personService.savePerson(person);
    }
   
}
