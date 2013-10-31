package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_User;


public interface IDao_User extends IDao<FC_User> {
	
	/**
	 * 
	 * @param name used to log in, unique
	 * @return usually one FC_user only, i.e. list.size() == 0
	 */
	List<FC_User> 	getUsersByName(String name);
	
	FC_User			getUserOfPost(int postId);
	
	List<FC_User> 	getUsersOfProject(int projectId);

	List<FC_User> 	getUsersOfTeam(int teamId);
	

}





