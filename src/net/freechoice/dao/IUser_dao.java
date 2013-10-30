package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_User;



public interface IUser_dao {
	
	int 			getUserCount();
	
	FC_User			getUserById(int id);

	// by poj , by team
	List<FC_User> 	getUsersOfProject(int projectId);

	List<FC_User> 	getUsersOfTeam(int teamId);
}


