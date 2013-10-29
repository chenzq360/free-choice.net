package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Transaction;



public interface ITransaction_dao {

	
	List<FC_Transaction> getTransactionsByUser(int userId);

	List<FC_Transaction> getTransactionsByAccount(int accountId);
}
