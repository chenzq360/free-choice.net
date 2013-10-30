package net.freechoice.dao;

import java.util.List;

public interface IDao<T> {

	int 			getCount();
	
	T				getById(int id);
	
	void			add(T entity);
	void 			delete(T entity);
	void 			delete(int entity);
	void			invalidate(T entity);
	void			invalidate(int entity);
	void			update(T entity);
	
	List<T> 		getAll();
}
