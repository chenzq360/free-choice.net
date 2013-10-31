package net.freechoice.dao.impl;

import java.io.Serializable;
import java.util.List;

import net.freechoice.dao.IDao;
import net.freechoice.model.IModel;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DaoAux<T extends IModel> 
				extends HibernateDaoSupport implements IDao<T>{

	private Class<T>	type;
	private String tableName = type.getSimpleName();
	
	DaoAux(Class<T> t) {
		this.type = t;
	}
	
	@Override
	public int getCount() {
		return(
			(Long)getSession()
				.createQuery("select count(*) from " + tableName
								+ "where is_valid = true")
								.uniqueResult()
			).intValue();
	}

	@Override
	public	int getAllCount() {
		return(
			(Long)getSession()
				.createQuery("select count(*) from " + tableName)
				.uniqueResult()
			).intValue();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return getHibernateTemplate().find("from " + tableName);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<T> getAllValid() {
		return (List<T>)getSession().createSQLQuery(
		"select from " + type.getSimpleName() +" where is_valid = true")
		.addEntity(type)
		.list();
	}
	@Override
	public T getById(int id) {
		return getHibernateTemplate().get(type, id);
	}
	@Override
	public Serializable	save(T entity) {
		return getHibernateTemplate().save(entity);
	}
	
	@Override
	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(getById(id));
	}

	@Override
	public void update(T entity) {
		getHibernateTemplate().update(entity);
	}

	@Override
	public void invalidate(T entity) {
		entity.setIs_valid(false);
		getHibernateTemplate().update(entity);
	}

	@Override
	public void invalidate(int id) {
		T t = getById(id);
		t.setIs_valid(false);
		getHibernateTemplate().update(t);
	}
}
