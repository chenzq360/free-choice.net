package net.freechoice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.freechoice.util.HashUtil;



@Entity
@Table(name="R_team_user")
public class R_team_user implements Serializable {

	private static final long serialVersionUID = -729119141361332071L;

	@Id
	@ManyToMany
	@JoinColumn(name="_id")
	private int 			id_team_;
	
	@Id
	@ManyToMany
	@JoinColumn(name="_id")
	private int				id_user_;
	
	public R_team_user() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_team_() {
		return id_team_;
	}
	public void setId_team_(int id_team_) {
		this.id_team_ = id_team_;
	}
	public int getId_user_() {
		return id_user_;
	}
	public void setId_user_(int id_user_) {
		this.id_user_ = id_user_;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_team_user)) {
			return false;
		} else {
			R_team_user obj = (R_team_user)o;
			return obj.id_team_ == this.id_team_ 
					&& obj.id_user_ == this.id_user_;
		}
	}
	@Override
	public int hashCode() {
		return HashUtil.hashIntegers(this.id_user_, this.id_user_);
	}
}
