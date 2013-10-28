package net.freechoice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.freechoice.util.HashUtil;



@Entity
@Table(name="R_user_post")
public class R_user_post implements Serializable {

	private static final long serialVersionUID = -8192655124206007745L;
	
	private int			id_user_;
	private	int			id_blog_;
	
	public R_user_post() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_user_() {
		return id_user_;
	}

	public void setId_user_(int id_user_) {
		this.id_user_ = id_user_;
	}

	public int getId_blog_() {
		return id_blog_;
	}

	public void setId_blog_(int id_blog_) {
		this.id_blog_ = id_blog_;
	}

	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_user_post)) {
			return false;
		} else {
			R_user_post obj = (R_user_post)o;
			return obj.id_blog_ == this.id_blog_ && obj.id_user_ == this.id_user_;
		}
	}
	@Override
	public int hashCode() {
		return HashUtil.hashIntegers(this.id_blog_, this.id_user_);
	}
}
