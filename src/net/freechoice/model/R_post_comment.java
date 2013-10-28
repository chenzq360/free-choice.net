package net.freechoice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.freechoice.util.HashUtil;



@Entity
@Table(name="R_post_comment")
public class R_post_comment implements Serializable  {
	
	private static final long serialVersionUID = -3162417045908554598L;

	private int			id_post_;
	private int			id_comment_;
	
	public R_post_comment() {
		// TODO Auto-generated constructor stub
	}

	public int getId_post_() {
		return id_post_;
	}
	public void setId_post_(int id_post_) {
		this.id_post_ = id_post_;
	}
	public int getId_comment_() {
		return id_comment_;
	}
	public void setId_comment_(int id_comment_) {
		this.id_comment_ = id_comment_;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_post_comment)) {
			return false;
		} else {
			R_post_comment obj = (R_post_comment)o;
			return obj.id_post_ == this.id_post_ 
					&& obj.id_comment_ == this.id_comment_;
		}
	}
	@Override
	public int hashCode() {
		return HashUtil.hashIntegers(this.id_post_, this.id_comment_);
	}
}
