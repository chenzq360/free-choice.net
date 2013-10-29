package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Account;
import net.freechoice.model.FC_Comment;
import net.freechoice.model.FC_User;



public interface IUser_dao {
	
	int 			getUserCount();
	
	FC_User			getUserById(int id);
	int 			getCommentCount();

	FC_Comment		getCommentById(int id);
	
	void			addAccount(FC_Account account);
	void 			deleteAccount(FC_Account account);
	void 			deleteAccount(int accountId);
	void			updateAccount(FC_Account account);
	
	// by poj , by team
	List<FC_User> 	getUsersByProject(int projectId);

	List<FC_User> 	getUsersByTeam(int teamId);
}


