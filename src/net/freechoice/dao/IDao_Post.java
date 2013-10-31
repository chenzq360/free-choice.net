package net.freechoice.dao;

import java.sql.Date;
import java.util.List;

import net.freechoice.model.FC_Post;

public interface IDao_Post extends IDao<FC_Post> {

	List<FC_Post> 	getPostsByAutor(int userId);

	/**
	 * 
	 * @param start : java.sql.Date, not java.util.Date !
	 * @param end
	 * @return
	 */
	List<FC_Post>	getPostsBetween(Date start, Date end);
	
	List<FC_Post>	getPostsOnDate(Date date);
	/**
	 * 
	 * @param let month = [ x | x <-[1 .. 12] ]
	 * @return
	 */
	List<FC_Post>	getPostsOnMonth(int month);
	
	List<FC_Post>	getPostsOfTag(int tagId);

	List<FC_Post>	getPostsOfTags(List<Integer> tagIds);
	
	List<FC_Post> 	getPostsOfTeam(int teamId);

	List<FC_Post> 	getPostsOfProject(int projectId);

}



