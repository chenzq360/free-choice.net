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

	List<FC_Post>	getAllPosts();
	
	List<FC_Post>	getPostsByMonth(int month);
	
	List<FC_Post>	getPostsOfTag(int tagId);

	List<FC_Post>	getPostsOfTags(List<Integer> tagIds);
	
	List<FC_Post> 	getPostsOfUser(int userId);

	List<FC_Post> 	getPostsOfTeam(int teamId);

	List<FC_Post> 	getPostsOfProject(int projectId);
}



