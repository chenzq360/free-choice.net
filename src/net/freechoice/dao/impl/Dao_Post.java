package net.freechoice.dao.impl;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import net.freechoice.dao.IDao_Post;
import net.freechoice.model.FC_Post;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class Dao_Post extends HibernateDaoSupport implements IDao_Post {

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAllCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FC_Post getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable add(FC_Post entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(FC_Post entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void invalidate(FC_Post entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void invalidate(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(FC_Post entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<FC_Post> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_Post> getPostsByAutor(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_Post> getPostsOnDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_Post> getPostsOnMonth(int month) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_Post> getPostsOfTag(int tagId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_Post> getPostsOfTags(List<Integer> tagIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_Post> getPostsOfTeam(int teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FC_Post> getPostsOfProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
