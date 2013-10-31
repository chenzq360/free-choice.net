package net.freechoice.dao.impl;

import java.util.List;

import net.freechoice.dao.IDao_Tag;
import net.freechoice.model.FC_Tag;

import org.hibernate.SessionFactory;

public class Dao_Tag extends DaoAux<FC_Tag> implements IDao_Tag {

	
	public Dao_Tag() {
		super(FC_Tag.class);
	}
	
	Dao_Tag(SessionFactory sessionFactory) {
		super(FC_Tag.class);
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Tag> getTagsByName(String name) {
		return (List<FC_Tag>)getSession().createSQLQuery(
				"select * from FC_Tag where content = '" + name + "'"
				).addEntity(FC_Tag.class)
				.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<FC_Tag> getTagsOfPost(int postId) {
		return (List<FC_Tag>)getSession().createSQLQuery(
				"SELECT * FROM FC_Tag WHERE _id IN"
				+"( SELECT id_tag_ FROM R_tag_post WHERE id_post_ = " + postId + " ) "
				).addEntity(FC_Tag.class)
				.list();
	}
	
	@Override
	public String getTagName(int tagId) {
		return (String) getSession().createSQLQuery(
				"select content from FC_Tag where _id = " + tagId
				).addEntity(String.class)
				.list().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAllTagNames() {
		return (List<String>)getSession().createSQLQuery(
				"select content from FC_Tag"
				).addEntity(String.class)
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getTagNamesOfPost(int postId) {
		return (List<String>)getSession().createSQLQuery(
				"SELECT content FROM FC_Tag WHERE _id IN"
				+"( SELECT id_tag_ FROM R_tag_post WHERE id_post_ = "+ postId + " )"
				).addEntity(String.class)
				.list();
	}

}
