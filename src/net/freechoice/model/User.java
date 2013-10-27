package net.freechoice.model;

public class User {
	
	private int				id;
	private boolean			is_valid;//default true
	
	private	int				id_profile;//FK
	private int 			id_group;//FK
	private String			path_photo;
	
	private String			name_login;
	private String			name_display;
	private String			password;

	private String			tagline;
	
	public User() {
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

	public int getId_profile() {
		return id_profile;
	}

	public void setId_profile(int id_profile) {
		this.id_profile = id_profile;
	}

	public int getId_group() {
		return id_group;
	}

	public void setId_group(int id_group) {
		this.id_group = id_group;
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
	
	@Override
	public boolean equals(Object o) {
		return o instanceof User ? 
				(((User)o).id == this.id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}
