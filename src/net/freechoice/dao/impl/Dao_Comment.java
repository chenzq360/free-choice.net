package net.freechoice.dao.impl;

import java.util.List;

import net.freechoice.dao.IDao_Comment;
import net.freechoice.model.FC_Comment;

import org.hibernate.SessionFactory;

public class Dao_Comment extends DaoAux<FC_Comment> implements IDao_Comment {

	
	public Dao_Comment() {
		super(FC_Comment.class);
	}
	
	Dao_Comment(SessionFactory sessionFactory) {
		super(FC_Comment.class);
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Comment> getCommentsOfPost(int postId) {
		return (List<FC_Comment>)getSession().createSQLQuery(
				"select * from FC_Comment where id_post_ = " + postId
				).addEntity(FC_Comment.class)
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Comment> getCommentsOfName(String name) {
		return (List<FC_Comment>)getSession().createSQLQuery(
				"select * from FC_Comment where name = '" + name + "'"
				).addEntity(FC_Comment.class)
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Comment> getCommentsOfEmail(String email) {
		return (List<FC_Comment>)getSession().createSQLQuery(
				"select * from FC_Comment where email = '" + email + "'"
				).addEntity(FC_Comment.class)
				.list();
	}

}
