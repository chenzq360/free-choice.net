
-- table with 'R_' perfix connects two/multi entities

-- table with 'FC_' (stands for 'free-choice') 
-- 		indicate that this is an entity table


-- all name 			-> varchar(30)
-- password, email, tag 		
-- 						-> varchar(40)
-- other				-> text

-- date 				 -> java.sql.Date
-- timestamp 			 -> java.sql.TimeStamp

-- gender:boolean. true for female, false for male.

-- primary key starts with '_', e.g. _id
-- foreign key ends with '_', e.g. id_user_



DROP TABLE IF EXISTS 	FC_Post		CASCADE;
DROP TABLE IF EXISTS 	FC_Comment 	CASCADE;
DROP TABLE IF EXISTS 	FC_Tag		CASCADE;

DROP TABLE IF EXISTS	R_tag_post;

CREATE TABLE FC_Post
(
	_id				serial		PRIMARY KEY,

	is_valid		boolean 	NOT NULL DEFAULT true,

	id_author_		integer		NOT NULL REFERENCES FC_User(_id),
	
	month_posted	smallint	NOT NULL 
								CHECK(month_posted > 0 
										AND month_posted < 13),

	time_posted		timestamp	NOT NULL,

	num_read		integer		NOT NULL DEFAULT 0 
								CHECK (num_read > 0),

	num_comment		integer		NOT NULL DEFAULT 0 
								CHECK (num_comment > 0),
	title 			text,
	abstract		text,
	content			text
);

CREATE TABLE FC_Tag
(
	_id				serial		PRIMARY KEY,
	is_valid		boolean		NOT NULL DEFAULT true,
	content			varchar(40)
);

CREATE TABLE FC_Comment
(
	_id				serial		PRIMARY KEY,
	is_valid		boolean		NOT NULL DEFAULT true,

	id_post_		integer		NOT NULL REFERENCES FC_Post(_id),

	time_posted		timestamp	NOT NULL,
	email 			varchar(40) NOT NULL,
	name 			varchar(30) NOT NULL,
	comment 		text
);


CREATE TABLE R_tag_post
(
	id_post_		integer		NOT NULL REFERENCES FC_Post(_id),
	id_tag_			integer		NOT NULL REFERENCES FC_Tag(_id),

	PRIMARY KEY(id_post_, id_tag_)
);
