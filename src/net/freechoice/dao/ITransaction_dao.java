package net.freechoice.dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import net.freechoice.model.FC_Transaction;



public interface ITransaction_dao {

	
	


	List<FC_Transaction> getTransactionsOfUser(int userId);

	List<FC_Transaction> getTransactionsOfAccount(int accountId);
	
	List<FC_Transaction> getTransactionsOnTime(Timestamp timestamp);

	List<FC_Transaction> getTransactionsOnDate(Date date);

}
