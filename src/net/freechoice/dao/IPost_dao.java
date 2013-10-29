package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Post;

public interface IPost_dao {
	
	int 			getPostCount();
	
	void			addPost(final FC_Post post);
	void 			deletePost(final FC_Post post);
	void 			updatePost(final FC_Post post);
	
	FC_Post 		getPostById(int id);
	
	List<FC_Post>	getPostByMonth(int month);
	
	List<FC_Post>	getPostByTag(int tagId);

	List<FC_Post>	getPostByTags(int...tagIds);
	
	List<FC_Post> 	getPostByUser(int userId);
	
}
