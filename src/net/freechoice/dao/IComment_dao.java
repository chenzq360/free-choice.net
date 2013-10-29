package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Comment;



public interface IComment_dao {
	
	int 			getCommentCount();

	FC_Comment		getCommentById(int id);
	
	void			addComment(FC_Comment comment);
	void 			deleteComment(FC_Comment comment);
	void 			deleteComment(int commentId);
	void			updateComment(FC_Comment comment);
	
	List<FC_Comment> getCommentsOfPost(int postId);
}
