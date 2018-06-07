
package com.zhang.myspringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.myspringboot.mapper.PersonMapper;
import com.zhang.myspringboot.model.Person;
import com.zhang.myspringboot.service.IPersonService;

@Service("personService")
public class PersonService implements IPersonService{
	
	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public Person getPerson(int id) {
		return personMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean savePerson(Person person) {
		int ret = personMapper.insert(person);
		if(ret > 0) {
			return true;
		} else {
			return false;
		}
	}
}