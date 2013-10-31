package net.freechoice.dao.impl;

import java.sql.Date;
import java.util.List;

import net.freechoice.dao.IDao_Post;
import net.freechoice.model.FC_Post;

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
				"select * from FC_Post where id_author = " + id
				+" order by time_posted"
				).addEntity(FC_Post.class)
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

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Post> getPostsOnMonth(int month) {
		return (List<FC_Post>)getSession().createSQLQuery(
				"select * from FC_Post where month_posted = " + month
				).addEntity(FC_Post.class)
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Post> getPostsOfTag(int tagId) {
		return (List<FC_Post>)getSession().createSQLQuery(
				"SELECT * FROM FC_Post WHERE _id IN"
				+"(SELECT id_team_ FROM R_tag_post WHERE id_tag_ = " + tagId + " )"
				).addEntity(FC_Post.class)
				.list();
	}

	@Override
	public List<FC_Post> getPostsOfTags(List<Integer> tagIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Post> getPostsOfTeam(int teamId) {
		return (List<FC_Post>)getSession().createSQLQuery(
				"SELECT * FROM FC_Post WHERE id_author_ IN"
				+"(SELECT id_user_ FROM R_team_user WHERE id_team_ = " +teamId +" ) "
				)
				.addEntity(FC_Post.class)
				.list();
	}

	@Override
	public List<FC_Post> getPostsOfProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
