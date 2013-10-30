package net.freechoice.dao;

import net.freechoice.model.FC_Profile;



public interface IDao_Profile extends IDao<FC_Profile> {

	FC_Profile		getProfileOfUser(int userId);
	
}
