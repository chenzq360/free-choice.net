package net.freechoice.model;

public class Tag {
	
	private int				id;
	private boolean			is_valid;
	private String			content;
	
	public Tag() {
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Tag ? 
				(((Tag)o).id == this.id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}
