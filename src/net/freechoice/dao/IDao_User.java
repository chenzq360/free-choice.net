package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_User;


public interface IDao_User extends IDao<FC_User> {
	
	List<FC_User> 	getUsersByName(String name);
	
	FC_User			getUserOfPost(int postId);
	
	List<FC_User> 	getUsersOfProject(int projectId);

	List<FC_User> 	getUsersOfTeam(int teamId);
	

}





