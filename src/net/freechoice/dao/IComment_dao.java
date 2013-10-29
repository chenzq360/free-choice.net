package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Comment;



public interface IComment_dao {
	
	int 			getCommentCount();

	FC_Comment		getCommentById(int id);
	
	List<FC_Comment> getCommentsOfPost(int postId);
}
