package net.freechoice.dao;

import java.sql.Date;
import java.util.List;

import net.freechoice.model.FC_Account;



public interface IDao_Account extends IDao<IDao_Account> {
	
	List<FC_Account> getAccountsOnDate(Date date);
	
	List<FC_Account> getAccountsOfUser(int userId);

}
