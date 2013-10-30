package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Comment;



public interface IDao_Comment extends IDao<FC_Comment> {
	
	List<FC_Comment> getCommentsOfPost(int postId);

	List<FC_Comment> getCommentsOfName(String name);
	
	List<FC_Comment> getCommentsOfEmail(String email);

}




