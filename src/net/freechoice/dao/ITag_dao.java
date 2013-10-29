
package net.freechoice.dao;

import java.util.List;

import net.freechoice.model.FC_Tag;

public interface ITag_dao {
	

	int 			getTagCount();
	
	String			getTagName();
	
	List<FC_Tag>	getAllTags();
	
	List<FC_Tag> 	getTagsOfPost(int postId);
	
	List<String> 	getTagNamesOfPost(int postId);
}
