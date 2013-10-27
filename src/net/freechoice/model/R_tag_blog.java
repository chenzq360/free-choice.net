package net.freechoice.model;

public class R_tag_blog {
	
	private int			id_tag;
	private int			id_blog;
	
	public R_tag_blog() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_tag() {
		return id_tag;
	}
	public void setId_tag(int id_tag) {
		this.id_tag = id_tag;
	}
	public int getId_blog() {
		return id_blog;
	}
	public void setId_blog(int id_blog) {
		this.id_blog = id_blog;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_tag_blog)) {
			return false;
		} else {
			R_tag_blog obj = (R_tag_blog)o;
			return obj.id_blog == this.id_blog && obj.id_tag == this.id_tag;
		}
	}
	@Override
	public int hashCode() {
		return this.id_blog ^ this.id_tag;
	}
}
