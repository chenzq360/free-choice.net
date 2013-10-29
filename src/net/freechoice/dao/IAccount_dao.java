package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Account;



public interface IAccount_dao {

	int 			getAccountCount();
	
	FC_Account		getAccountById(int id);
	
	void			addAccount(FC_Account account);
	void 			deleteAccount(FC_Account account);
	void 			deleteAccount(int accountId);
	void			updateAccount(FC_Account account);
	
	List<FC_Account> getAllAccounts();
}
