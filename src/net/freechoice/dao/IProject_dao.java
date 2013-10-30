package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Project;


public interface IProject_dao {

	
	
	
	
	List<FC_Project> getProjectsBySubject(String sbj);
	
	List<FC_Project> getProjectsByName(String name);
	
	List<FC_Project> getProjectsOfTeam(int teamId);

	List<FC_Project> getProjectsOfUser(int userId);
}
