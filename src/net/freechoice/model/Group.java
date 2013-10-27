package net.freechoice.model;

import java.sql.Date;

public class Group {
	
	private int			id;
	private	boolean		is_valid;
	
	private Date		date_created;
	private int			id_owner;
	private String		name;
	private String		tagline;
	
	public Group() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isIs_valid() {
		return is_valid;
	}
	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public int getId_owner() {
		return id_owner;
	}
	public void setId_owner(int id_owner) {
		this.id_owner = id_owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Group ? 
				(((Group)o).id == this.id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}
