package net.freechoice.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<T> {

	/**
	 * 
	 * @return valid only
	 */
	int 			getCount();
	
	
	/**
	 * 
	 * @return columns in table
	 */
	int 			getAllCount();
	
	T				getById(int id);
	
	Serializable	add(T entity);
	void 			delete(T entity);
	void 			delete(int id);
	void			invalidate(T entity);
	void			invalidate(int id);
	void			update(T entity);
	
	List<T> 		getAll();
}





