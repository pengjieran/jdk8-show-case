package com.pengjieran;

import java.util.Optional;

import org.junit.Test;

import com.pengjieran.model.Person;
import com.pengjieran.model.User;

/**
 * 
 * @author Aaron
 *
 */
public class OptionlTestCase {
	
	@Test
	public void optionTestCase() {
		
		User user = new User();
		Person person = new Person();
		person.setName("哈哈");
		user.setPerson(person);
		
		String str = Optional.ofNullable(user).map(u -> u.getPerson()).map(p -> p.getName()).orElse("沒有值");
		
		System.out.println(str);
	}

	@Test
	public void optionTestnullCase() {
		
		User user = new User();
		
		String str = Optional.ofNullable(user).map(u -> u.getPerson()).map(p -> p.getName()).orElse("沒有值");
		
		System.out.println(str);
	}
}
