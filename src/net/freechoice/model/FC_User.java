package net.freechoice.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="FC_User")
public class FC_User implements Serializable, FreeChoiceEntity{

	private static final long serialVersionUID = -464078696567349754L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@OneToMany(mappedBy="id_user_", targetEntity=FC_Post.class, cascade=CascadeType.ALL)
//	@OneToMany(mappedBy="id_manager_", targetEntity=FC_Project.class, cascade=CascadeType.ALL)
	private int				_id;
	
	private boolean			is_valid = true;//default true
	
	@ManyToOne
	@JoinColumn(name="_id")
	private	int				id_profile_;//FK
	
	private String			path_photo;
	
	private String			name_login;
	private String			name_display;
	private String			password;

	private String			tagline;
	private String			appendix;
	
	public FC_User() {
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


	public int getId_profile() {
		return id_profile_;
	}


	public void setId_profile(int id_profile) {
		this.id_profile_ = id_profile;
	}


	public String getPath_photo() {
		return path_photo;
	}


	public void setPath_photo(String path_photo) {
		this.path_photo = path_photo;
	}


	public String getName_login() {
		return name_login;
	}


	public void setName_login(String name_login) {
		this.name_login = name_login;
	}


	public String getName_display() {
		return name_display;
	}


	public void setName_display(String name_display) {
		this.name_display = name_display;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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
		return o instanceof FC_User ? 
				(((FC_User)o)._id == this._id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this._id;
	}
}
