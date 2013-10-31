
package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Tag;

public interface IDao_Tag extends IDao<FC_Tag>{
	
	List<FC_Tag>	getTagsByName(String name);
	
	String			getTagName(int tagId);
	
	List<String> 	getAllTagNames();
	
	List<FC_Tag> 	getTagsOfPost(int postId);
	
	List<String> 	getTagNamesOfPost(int postId);
}
