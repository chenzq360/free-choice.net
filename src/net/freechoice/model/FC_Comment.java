package net.freechoice.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FC_Comment")
public class FC_Comment implements Serializable {

	private static final long serialVersionUID = 5237392813785018862L;
	private static final int serialID32 = (int)(serialVersionUID ^ (serialVersionUID >>> 32));

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int				_id;

	private boolean			is_valid = true;

	@ManyToOne
	@JoinColumn(name="_id")
	private int 			id_post_;
	
	private Timestamp		time_posted;
	private String			email;
	
	private String			name;
	private String			comment;
	
	public FC_Comment() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId_post_() {
		return id_post_;
	}


	public void setId_post_(int id_post_) {
		this.id_post_ = id_post_;
	}

	public Timestamp getTime_posted() {
		return time_posted;
	}

	public void setTime_posted(Timestamp time_posted) {
		this.time_posted = time_posted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof FC_Comment ? 
				(((FC_Comment)o)._id == this._id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this._id * 31 + serialID32;
	}
}
