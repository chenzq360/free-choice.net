package net.freechoice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.freechoice.util.HashUtil;



@Entity
@Table(name="R_project_user")
public class R_project_user implements Serializable {

	private static final long serialVersionUID = 3712549588813918267L;

	private int 			id_project_;
	private int				id_user_;
	
	public R_project_user() {
		// TODO Auto-generated constructor stub
	}

	public int getId_project_() {
		return id_project_;
	}
	public void setId_project_(int id_project_) {
		this.id_project_ = id_project_;
	}
	public int getId_user_() {
		return id_user_;
	}
	public void setId_user_(int id_user_) {
		this.id_user_ = id_user_;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_project_user)) {
			return false;
		} else {
			R_project_user obj = (R_project_user)o;
			return obj.id_project_ == this.id_project_ 
					&& obj.id_user_ == this.id_user_;
		}
	}
	@Override
	public int hashCode() {
		return HashUtil.hashIntegers(this.id_project_, this.id_user_);
	}
}


