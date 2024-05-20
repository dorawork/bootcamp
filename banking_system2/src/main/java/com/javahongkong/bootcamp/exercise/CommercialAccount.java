package com.javahongkong.bootcamp.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount extends Account{
	private List<Person> authorizedUsers;

	public CommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		super(company, pin, startingDeposit);
		authorizedUsers = new LinkedList<>();
	}

	/**
	 * @param person The authorized user to add to the account.
	 */
	protected void addAuthorizedUser(Person person) {
		authorizedUsers.add(person);
		// complete the function
	}

	/**
	 * @param person
	 * @return true if person matches an authorized user in
	 *         {@link #authorizedUsers}; otherwise, false.
	 */
	public boolean isAuthorizedUser(Person person) {
		// complete the function
		for (Person authoziPerson : authorizedUsers){
			if (authorizedUsers.contains(person)) {
				return true;
			}
		}
		return false;
	}
}
