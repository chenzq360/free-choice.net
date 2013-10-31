package net.freechoice.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="FC_Team")
public class FC_Team implements Serializable {
	
	private static final long serialVersionUID = -9181758135249535900L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int			_id;
	
	private	boolean		is_valid = true;

//	@ManyToOne
//	@JoinColumn(name="_id")
	private int			id_leader_;
	private Date		date_created;
	private String		name;
	private String		tagline;
	private String		appendix;
	
	public FC_Team() {
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


	public int getId_leader_() {
		return id_leader_;
	}


	public void setId_leader_(int id_leader_) {
		this.id_leader_ = id_leader_;
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


	public String getTagline() {
		return tagline;
	}


	public void setTagline(String tagline) {
		this.tagline = tagline;
	}


	public String getAppendix() {
		return appendix;
	}


	public void setAppendix(String appendix) {
		this.appendix = appendix;
	}


	@Override
	public boolean equals(Object o) {
		return o instanceof FC_Team ? 
				(((FC_Team)o)._id == this._id ? true : false) 
				: false;
	}
	
	@Override
	public int hashCode() {
		return this._id;
	}
}
