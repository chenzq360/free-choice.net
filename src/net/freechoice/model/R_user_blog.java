package net.freechoice.model;

public class R_user_blog {

	private int			id_user;
	private	int			id_blog;
	
	public R_user_blog() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_blog() {
		return id_blog;
	}
	public void setId_blog(int id_blog) {
		this.id_blog = id_blog;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_user_blog)) {
			return false;
		} else {
			R_user_blog obj = (R_user_blog)o;
			return obj.id_blog == this.id_blog && obj.id_user == this.id_user;
		}
	}
}
