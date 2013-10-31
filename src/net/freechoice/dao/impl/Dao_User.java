package net.freechoice.dao.impl;

import java.util.List;

import net.freechoice.dao.IDao_User;
import net.freechoice.model.FC_User;

import org.hibernate.SessionFactory;



public class Dao_User extends DaoAux<FC_User> implements IDao_User {

	public Dao_User() {
		super(FC_User.class);
	}
	public Dao_User(SessionFactory sessionFactory) {
		super(FC_User.class);
		setSessionFactory(sessionFactory);
	}
	
	@Override
	public void invalidate(FC_User entity) {
		
		entity.setIs_valid(false);
		getHibernateTemplate().update(entity);
	}

	@Override
	public void invalidate(int id) {
		
		FC_User usr = this.getById(id);
		usr.setIs_valid(false);
		getHibernateTemplate().update(usr);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_User> getUsersByName(String name) {
		
		return (List<FC_User>)getSession().createSQLQuery(
				"select * from FC_User where name = '" + name + "'")
				.addEntity(FC_User.class)
				.list();
	}

	@Override
	public FC_User getUserOfPost(int postId) {
		
		return (FC_User) getSession().createSQLQuery(
				"select * From FC_User where FC_User._id in "
				+ " ( select id_author_ from FC_Post where FC_Post._id = " + postId + ")"
				).addEntity(FC_User.class)
				.list().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_User> getUsersOfProject(int projectId) {
		return (List<FC_User>) getSession().createSQLQuery(
		 "SELECT * FROM FC_User WHERE _id IN"
		+"(	"
		+"	(SELECT id_manager_ FROM FC_Project "
		+"		WHERE FC_Project._id = " + projectId
		+"	) "
		+"	UNION "
		+"	(SELECT id_user_ FROM R_team_user WHERE id_team_ in"
		+"		(SELECT id_team_ from FC_Project WHERE FC_Project._id = "+projectId+ ")"
		+"	)"
		+")"
				).addEntity(FC_User.class)
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_User> getUsersOfTeam(int teamId) {
		
		return (List<FC_User>) getSession().createSQLQuery(
				"select * From FC_User where FC_User._id in "
				+ " ( select id_user_ from R_team_user where R_team_user.id_team_ = " + teamId + " ) "
				).addEntity(FC_User.class)
				.list();
	}
}
