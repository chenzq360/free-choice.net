

DROP TABLE IF EXISTS	FC_Project	CASCADE;

DROP TABLE IF EXISTS 	FC_Team 	CASCADE;
DROP TABLE IF EXISTS	FC_User		CASCADE;

DROP TABLE IF EXISTS 	FC_Profile	CASCADE;
DROP TABLE IF EXISTS 	FC_Account	CASCADE;
DROP TABLE IF EXISTS	FC_Transaction	CASCADE;

DROP TABLE IF EXISTS	R_team_user;


------------------------  User --------------------------------------
CREATE TABLE FC_Profile
(
	_id				serial		PRIMARY KEY,
	is_valid		boolean		NOT NULL DEFAULT true,

	date_register	date		NULL NULL,
	email			varchar(40) NULL NULL,
	site_personal	text,
	name_first		varchar(30)			,
	name_last		varchar(30)			,
	contact_public	text				,

	gender 			boolean				,
	date_birth		date
);

-- for the convience of java programming, we choose to use int
--	instead of some user-defined enumeration to represent currency type 
CREATE TABLE FC_Account
(
	_id 			serial		PRIMARY KEY,
	is_valid		boolean		NOT NULL DEFAULT true,

	date_created	date 		NOT NULL,
	balance			money		NOT NULL
);

CREATE TABLE FC_Transaction
(
	_id				serial		PRIMARY KEY,
	is_valid		boolean		NOT NULL DEFAULT true,

	id_account_		integer		NOT NULL REFERENCES FC_Account(_id),

	time_committed	timestamp	NOT NULL,
	amount			money		NOT NULL
);

CREATE TABLE FC_User
(
	_id				serial		PRIMARY KEY,
	is_valid 		boolean		NOT NULL DEFAULT true,

	id_profile_		integer		NOT NULL REFERENCES FC_Profile(_id),

	path_photo		text		NOT NULL, --default???
	name_login		varchar(30) NOT NULL UNIQUE,
	name_display	varchar(30)	NOT NULL,
	password		varchar(40) NOT NULL,

	tagline			text				,
	appendix		text
);

------------------------  User --------------------------------------


CREATE TABLE FC_Team
(
	_id				serial		PRIMARY KEY,
	is_valid		boolean 	NOT NULL DEFAULT true,
	
	id_leader_		integer		NOT NULL REFERENCES FC_User(_id),
	date_created	date 		NOT NULL,
	
	name 			text		NOT NULL,
	tagline			text				,
	appendix		text
);

CREATE TABLE R_team_user
(
	id_user_		integer		NOT NULL REFERENCES FC_User(_id),
	id_team_		integer		NOT NULL REFERENCES FC_Team(_id),

	PRIMARY Key(id_team_, id_user_)
);

CREATE TABLE FC_Project
(
	_id				serial		PRIMARY	KEY,
	is_valid		boolean		NOT NULL DEFAULT true,

	id_manager_		integer		NOT NULL REFERENCES FC_User(_id),
	id_team_ 		integer		REFERENCES FC_Team(_id),--null if only one participant
	date_created	date 		NOT NULL,
	
	name 			text		NOT NULL,
	subject			text		NOT	NULL,
	appendix		text
);

