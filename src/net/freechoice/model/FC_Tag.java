package net.freechoice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="FC_Tag")
public class FC_Tag implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private static final int serialID32 = (int)(serialVersionUID ^ (serialVersionUID >>> 32));
	@Id
	private int				_id;
	private boolean			is_valid;
	private String			content;
	
	public FC_Tag() {
		// TODO Auto-generated constructor stub
	}
	
	public int get_id() {
		return _id;
	}
	
	public void set_id(int _id) {
		this._id = _id;
	}
	
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	public boolean isIs_valid() {
		return is_valid;
	}
	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o) {
			return true;
		} else if (o instanceof FC_Tag) {
			return ((FC_Tag)o)._id == this._id;
		} else {
			return false;
		}
	}
    
	@Override
	public int hashCode() {
		return this._id * 31 + serialID32;
	}
}
