package net.freechoice.dao.impl;

import java.util.List;

import net.freechoice.dao.IComment_dao;
import net.freechoice.model.FC_Comment;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DAO_Comment extends HibernateDaoSupport 
							implements IComment_dao {

	@Override
	public int getCommentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FC_Comment getCommentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComment(FC_Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(FC_Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(int commentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateComment(FC_Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FC_Comment> getCommentsOfPost(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

}
