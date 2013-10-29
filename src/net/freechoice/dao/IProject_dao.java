package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Project;


public interface IProject_dao {

	
	List<FC_Project> getProjectsByTeam(int teamId);

	List<FC_Project> getProjectsByUser(int userId);
}
