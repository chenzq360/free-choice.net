package net.freechoice.dao;

import net.freechoice.model.FC_User;



public interface IUser_dao {
	
	int 			getUserCount();
	
	FC_User			getUserById(int id);

}
