package net.freechoice.model;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="FC_Post")
public class FC_Post implements Serializable {

	private static final long serialVersionUID = -7328287539453747388L;
	private static final int serialID32 = (int)(serialVersionUID ^ (serialVersionUID >>> 32));

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int				_id;
	
	private boolean 		is_valid = true;//default true
	private int				id_author;// FK
	
	private Time			time_posted;//timestamp
	private short			month_posted;
	
	private int				num_read;
	private int				num_comment;
	
	private String			title;
	private String			abstraction;
	private String			content;
	
	public FC_Post() {
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


	public int getId_author() {
		return id_author;
	}


	public void setId_author(int id_author) {
		this.id_author = id_author;
	}


	public Time getTime_posted() {
		return time_posted;
	}


	public void setTime_posted(Time time_posted) {
		this.time_posted = time_posted;
	}


	public short getMonth_posted() {
		return month_posted;
	}


	public void setMonth_posted(short month_posted) {
		this.month_posted = month_posted;
	}


	public int getNum_read() {
		return num_read;
	}


	public void setNum_read(int num_read) {
		this.num_read = num_read;
	}


	public int getNum_comment() {
		return num_comment;
	}


	public void setNum_comment(int num_comment) {
		this.num_comment = num_comment;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAbstraction() {
		return abstraction;
	}


	public void setAbstraction(String abstraction) {
		this.abstraction = abstraction;
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
		} else if (o instanceof FC_Post) {
			return ((FC_Post)o)._id == this._id;
		} else {
			return false;
		}
	}
    
	@Override
	public int hashCode() {
		return this._id * 31 + serialID32;
	}

}
