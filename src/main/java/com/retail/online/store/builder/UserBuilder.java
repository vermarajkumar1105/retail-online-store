/**
 * 
 */
package com.retail.online.store.builder;

import org.springframework.stereotype.Component;

import com.retail.online.store.model.User;
import com.retail.online.store.model.UserType;

/**
 * @author Rajkumar Verma
 *
 */
@Component
public class UserBuilder {

	private String firstName;
	private String lastName;
	private String telephone;
	private UserType userType;

	public UserBuilder() {

	}

	public UserBuilder firstName(String firstname) {
		this.firstName = firstname;
		return this;
	}

	public UserBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder telephone(String telephone) {
		this.telephone = telephone;
		return this;
	}

	public UserBuilder userType(UserType userType) {
		this.userType = userType;
		return this;
	}

	public User build() {
		return new User(firstName, lastName, telephone, userType);
	}
}
