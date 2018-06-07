
package com.zhang.myspringboot.service;

import com.zhang.myspringboot.model.Person;

public interface IPersonService {
	public Person getPerson(int id);
	public boolean savePerson(Person person);
}