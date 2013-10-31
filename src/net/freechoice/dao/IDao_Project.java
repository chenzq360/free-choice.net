package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Project;
import net.freechoice.model.FC_User;


public interface IDao_Project extends IDao<FC_Project>{

	List<FC_Project> getProjectsBySubject(String sbj);
	
	List<FC_Project> getProjectsByName(String name);
	
	List<FC_Project> getProjectsOfTeam(int teamId);

	List<FC_Project> getProjectsOfUser(int userId);
	
//	FC_User			 getProjectManager(int id);
}
