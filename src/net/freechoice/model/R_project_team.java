package net.freechoice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.freechoice.util.HashUtil;



@Entity
@Table(name="R_project_team")
public class R_project_team implements Serializable {

	private static final long serialVersionUID = -2288295341210324056L;

	private int 			id_project_;
	private int				id_team_;
	

	public R_project_team() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_project_() {
		return id_project_;
	}
	public void setId_project_(int id_project_) {
		this.id_project_ = id_project_;
	}
	public int getId_team_() {
		return id_team_;
	}
	public void setId_team_(int id_team_) {
		this.id_team_ = id_team_;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_project_team)) {
			return false;
		} else {
			R_project_team obj = (R_project_team)o;
			return obj.id_project_ == this.id_project_ 
					&& obj.id_team_ == this.id_team_;
		}
	}
	@Override
	public int hashCode() {
		return HashUtil.hashIntegers(this.id_project_, this.id_team_);
	}
}
