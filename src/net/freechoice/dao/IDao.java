package net.freechoice.dao;

import java.io.Serializable;
import java.util.List;

import net.freechoice.model.FreeChoiceEntity;

public interface IDao<T extends FreeChoiceEntity> {

	/**
	 * 
	 * @return valid entities only
	 */
	int 			getCount();
	
	
	/**
	 * 
	 * @return all entities in table
	 */
	int 			getAllCount();

	List<T> 		getAll();
	
	List<T> 		getAllValid();
	
	
	T				getById(int id);
	
	Serializable	save(T entity);
	
	void 			delete(T entity);
	
	void 			delete(int id);

	void			invalidate(T entity);
	
	void			invalidate(int id);
	
	void			update(T entity);
}





