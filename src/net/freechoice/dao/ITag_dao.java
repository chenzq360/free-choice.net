
package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Tag;

public interface ITag_dao {
	

	int 			getTagCount();
	

	

	List<FC_Tag>	getAllTags();
	
	List<String>	getTagsByName(String name);
	
	String			getTagName(int tagId);
	
	List<String> 	getAllTagNames();
	
	List<FC_Tag> 	getTagsOfPost(int postId);
	
	List<String> 	getTagNamesOfPost(int postId);
}
