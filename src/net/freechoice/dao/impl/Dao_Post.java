package net.freechoice.dao.impl;

import java.sql.Date;
import java.util.List;

import net.freechoice.dao.IDao_Post;
import net.freechoice.model.FC_Post;
import net.freechoice.model.FC_User;

import org.hibernate.SessionFactory;

public class Dao_Post extends DaoAux< FC_Post> implements IDao_Post {

	public Dao_Post() {
		super(FC_Post.class);
	}
	
	Dao_Post(SessionFactory sessionFactory) {
		super(FC_Post.class);
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Post> getPostsByAutor(int id) {
		return (List<FC_Post>)getSession().createSQLQuery(
				"select * from FC_Post where id_author = " + id)
				.addEntity(FC_Post.class)
				.list();
	}

	@Override
	public List<FC_Post> getPostsBetween(Date start, Date end) {
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
