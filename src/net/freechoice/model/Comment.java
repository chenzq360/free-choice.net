package net.freechoice.model;

import java.sql.Time;

public class Comment {

	private int				id;
	
	private boolean			is_valid;//default true
	
	private String			email;
	private Time			time_posted;
	
	private String			name;
	private String			comment;
	
	public Comment() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Time getTime_posted() {
		return time_posted;
	}
	public void setTime_posted(Time time_posted) {
		this.time_posted = time_posted;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Comment ? 
				(((Comment)o).id == this.id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}
