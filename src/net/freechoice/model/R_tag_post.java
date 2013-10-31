package net.freechoice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.freechoice.util.HashUtil;


@Entity
@Table(name="R_tag_post")
public class R_tag_post {
	
	@Id
//	@ManyToMany
//	@JoinColumn(name="_id")
	private int			id_tag_;
	
	
	@Id
//	@ManyToMany
//	@JoinColumn(name="_id")
	private int			id_post_;
	
	public R_tag_post() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_tag_post)) {
			return false;
		} else {
			R_tag_post obj = (R_tag_post)o;
			return obj.id_post_ == this.id_post_ 
					&& obj.id_tag_ == this.id_tag_;
		}
	}
	@Override
	public int hashCode() {
		return HashUtil.hashIntegers(this.id_post_, this.id_tag_);
	}
}
