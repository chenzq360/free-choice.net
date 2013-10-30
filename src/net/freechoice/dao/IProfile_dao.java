package net.freechoice.dao;

import net.freechoice.model.FC_Profile;



public interface IProfile_dao {

	int 			getProfileCount();

	FC_Profile		getProfileById(int id);
	
	void			addProfile(FC_Profile profile);
	void 			deleteProfile(FC_Profile profile);
	void 			deleteProfile(int profileId);
	void			updateProfile(FC_Profile profile);
	
	FC_Profile		getProfileOfUser(int userId);
	
}
