package net.freechoice.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.From;

import net.freechoice.dao.IDao_User;
import net.freechoice.model.FC_User;

import org.hibernate.SessionFactory;
import org.hibernate.sql.Select;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bsh.This;



public class Dao_User extends HibernateDaoSupport implements IDao_User {

	private HibernateTemplate hiTemp;
	
	void init(SessionFactory sf) {
		this.hiTemp = new HibernateTemplate(sf);
	}
	
	@Override
	public int getCount() {
		return(
				(Long)getSession()
					.createQuery("select count(*) from FC_User" 
									+ "where is_valid = true").uniqueResult()
				).intValue();
	}

	@Override
	public int getAllCount() {
		return(
				(Long)getSession()
					.createQuery("select count(*) from FC_User").uniqueResult()
				).intValue();
	}

	@Override
	public FC_User getById(int id) {
		return hiTemp.get(FC_User.class, id);
	}

	@Override
	public Serializable add(FC_User entity) {
		return hiTemp.save(entity);
	}

	@Override
	public void delete(FC_User entity) {
		hiTemp.delete(entity);
	}

	@Override
	public void delete(int id) {
		hiTemp.delete(this.getById(id));
	}

	@Override
	public void invalidate(FC_User entity) {
		entity.setIs_valid(false);
		hiTemp.update(entity);
	}

	@Override
	public void invalidate(int id) {
		FC_User usr = this.getById(id);
		usr.setIs_valid(false);
		hiTemp.update(usr);
	}

	@Override
	public void update(FC_User entity) {
		hiTemp.update(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_User> getAll() {
		return (List<FC_User>)getSession().createSQLQuery(
				"select from FC_User")
				.addEntity(FC_User.class)
				.list();
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

	@Override
	public List<FC_User> getUsersOfProject(int projectId) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_User> getUsersOfTeam(int teamId) {
		
		return (List<FC_User>) getSession().createSQLQuery(
				"select * From FC_User where FC_User._id in "
				+ " ( select id_user_ from R_team_user where FC_Post.id_team_ = " + teamId + " ) "
				).addEntity(FC_User.class)
				.list();
	}

}
