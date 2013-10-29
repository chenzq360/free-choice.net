package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Post;

public interface IPost_dao {
	
	int 			getPostCount();

	FC_Post 		getPostById(int id);
	
	void			addPost(FC_Post post);
	void 			deletePost(FC_Post post);
	void 			deletePost(int postId);
	void 			updatePost(FC_Post post);
	
	
	List<FC_Post>	getPostByMonth(int month);
	
	List<FC_Post>	getPostByTag(int tagId);
	////////????
	List<FC_Post>	getPostByTags(int...tagIds);
	
	List<FC_Post> 	getPostByUser(int userId);

	List<FC_Post> 	getPostByTeam(int teamId);

	List<FC_Post> 	getPostByProject(int projectId);
}
