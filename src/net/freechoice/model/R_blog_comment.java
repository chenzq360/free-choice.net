package net.freechoice.model;

public class R_blog_comment {
	
	private int			id_blog;
	private int			id_comment;
	
	public R_blog_comment() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_blog() {
		return id_blog;
	}
	public void setId_blog(int id_blog) {
		this.id_blog = id_blog;
	}
	public int getId_comment() {
		return id_comment;
	}
	public void setId_comment(int id_comment) {
		this.id_comment = id_comment;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_blog_comment)) {
			return false;
		} else {
			R_blog_comment obj = (R_blog_comment)o;
			return obj.id_blog == this.id_blog && obj.id_comment == this.id_comment;
		}
	}
	@Override
	public int hashCode() {
		return this.id_blog ^ this.id_comment;
	}
}
