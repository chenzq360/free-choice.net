package net.freechoice.dao.impl;

import java.util.List;

import net.freechoice.dao.IDao_User;
import net.freechoice.model.FC_User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class Dao_User extends HibernateDaoSupport implements IDao_User {

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IDao_User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(IDao_User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(IDao_User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void invalidate(IDao_User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void invalidate(int entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(IDao_User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<IDao_User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_User> getUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FC_User getUserOfPost(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_User> getUsersOfProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_User> getUsersOfTeam(int teamId) {
		// TODO Auto-generated method stub
		return null;
	}

}
