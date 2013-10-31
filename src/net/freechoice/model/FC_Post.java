package net.freechoice.model;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="FC_Post")
public class FC_Post implements Serializable, IModel{

	private static final long serialVersionUID = -7328287539453747388L;

	@Id
	@OneToMany(mappedBy="id_post_", targetEntity=FC_Comment.class, cascade=CascadeType.ALL)
	private int				_id;
	
	private boolean 		is_valid;//default true
	
	@ManyToOne
	@JoinColumn(name="_id")
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
	
	@Override
	public int get_id() {
		return _id;
	}

	@Override
	public void set_id(int _id) {
		this._id = _id;
	}

	@Override
	public boolean isIs_valid() {
		return is_valid;
	}

	@Override
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
		return o instanceof FC_Post ? 
				(((FC_Post)o)._id == this._id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this._id;
	}

}
