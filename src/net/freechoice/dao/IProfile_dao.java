package net.freechoice.dao;

import net.freechoice.model.FC_Profile;



public interface IProfile_dao {

	int 			getProfileCount();
	
	FC_Profile 		getProfileById(int id);
	
	
}
