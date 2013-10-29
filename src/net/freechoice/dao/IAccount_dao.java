package net.freechoice.dao;

import net.freechoice.model.FC_Account;



public interface IAccount_dao {

	int 			getAccountCount();
	
	FC_Account		getAccountById(int id);
	
}
