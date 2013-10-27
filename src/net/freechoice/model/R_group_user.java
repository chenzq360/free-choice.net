package net.freechoice.model;

public class R_group_user {

	private int			id_user;
	private	int			id_group;
	
	public R_group_user() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_group() {
		return id_group;
	}
	public void setId_group(int id_group) {
		this.id_group = id_group;
	}
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_group_user)) {
			return false;
		} else {
			R_group_user obj = (R_group_user)o;
			return obj.id_group == this.id_group && obj.id_user == this.id_user;
		}
	}
	@Override
	public int hashCode() {
		return this.id_group ^ this.id_user;
	}
}
