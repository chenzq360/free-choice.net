package net.freechoice.model;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name="FC_Project")
public class FC_Project implements Serializable{

	private static final long serialVersionUID = -1314152664859372835L;

	private int				_id;
	
	private boolean			is_valid;
	
	private int 			id_manager_;
	private int 			id_team_;
	
	private Date			date_created;
	
	private String			name;
	
	private String			subject;
	
	private String			appendix;
	
	public FC_Project() {
		// TODO Auto-generated constructor stub
	}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public boolean isIs_valid() {
		return is_valid;
	}
	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}
	public int getId_manager_() {
		return id_manager_;
	}
	public void setId_manager_(int id_manager_) {
		this.id_manager_ = id_manager_;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAppendix() {
		return appendix;
	}
	public void setAppendix(String appendix) {
		this.appendix = appendix;
	}
	
	public int getId_team_() {
		return id_team_;
	}

	public void setId_team_(int id_team_) {
		this.id_team_ = id_team_;
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof FC_Project ? 
				(((FC_Project)o)._id == this._id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this._id;
	}


	
}
