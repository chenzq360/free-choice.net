package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Team;


public interface ITeam_dao {

	
	
	List<FC_Team>	getTeamsOfUser(int userId);
	
	List<FC_Team>	getTeamsByName(String name);
	
	List<FC_Team> 	getTeamsByManager(int userId);
}
