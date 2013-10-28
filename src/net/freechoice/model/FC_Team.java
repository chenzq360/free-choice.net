package net.freechoice.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="FC_Team")
public class FC_Team implements Serializable {
	
	private static final long serialVersionUID = -9181758135249535900L;
	
	private int			_id;
	private	boolean		is_valid;
	
	private Date		date_created;
	private int			id_owner;
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

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public int getId_owner() {
		return id_owner;
	}

	public void setId_owner(int id_owner) {
		this.id_owner = id_owner;
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
