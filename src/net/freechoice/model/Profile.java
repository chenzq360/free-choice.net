package net.freechoice.model;

import java.sql.Date;



public class Profile {

	private int				id;
	private boolean			is_valid;
//	private int				id_user; // has user been invalidated, this shall be invalidated respectively
	
	private Date			date_register;

	private String			email;
	
	private boolean			gender;
	private Date			date_birth;
	
	private String			name_first;
	private String			name_last;
	private String			contact_public;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isIs_valid() {
		return is_valid;
	}
	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}
	public Date getDate_register() {
		return date_register;
	}
	public void setDate_register(Date date_register) {
		this.date_register = date_register;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getDate_birth() {
		return date_birth;
	}
	public void setDate_birth(Date date_birth) {
		this.date_birth = date_birth;
	}
	public String getName_first() {
		return name_first;
	}
	public void setName_first(String name_first) {
		this.name_first = name_first;
	}
	public String getName_last() {
		return name_last;
	}
	public void setName_last(String name_last) {
		this.name_last = name_last;
	}
	public String getContact_public() {
		return contact_public;
	}
	public void setContact_public(String contact_public) {
		this.contact_public = contact_public;
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof Profile ? 
				(((Profile)o).id == this.id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}
