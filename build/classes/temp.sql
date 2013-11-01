
SELECT * FROM FC_Tag WHERE _id IN
( SELECT id_tag_ FROM R_tag_post WHERE id_post_ = ??? )


SELECT content FROM FC_Tag WHERE _id IN
(
	SELECT id_tag_ FROM R_tag_post WHERE id_post_ = ???
)


SELECT * FROM FC_Post WHERE id_author_ IN
	(SELECT id_user_ FROM R_team_user WHERE id_team_ = ???)


SELECT * FROM FC_Post WHERE _id IN
	SELECT id_team_ FROM R_tag_post WHERE id_tag_ = ???


SELECT * FROM FC_User WHERE _id IN
(	
	(SELECT id_manager_ FROM FC_Project 
		WHERE FC_Project._id = ?????
	) 
	UNION 
	(SELECT id_user_ FROM R_team_user WHERE id_team_ in
		(SELECT id_team_ from FC_Project WHERE FC_Project._id = ?????)
	)
)
-- date 				 -> java.sql.Date
-- timestamp 			 -> java.sql.TimeStamp

-- 1.   Display the ID, first name, and joining date 
		--of each member whose ID begins with the letters "A%B" or "A&B"
		-- and who joined the library no later than Nov. 30, 1997.

		SELECT LibId, Fname, Join_date FROM MEMBER4 
				WHERE (MEMBER4.LibId LIKE 'A\%B%'
					  OR MEMBER4.LibId LIKE 'A&B%' )
					  AND (MEMBER4.Join_date <= TO_DATE('1997/11/30', 'YYYY/MM/DD'))



-- 2.      List the name, ISBN, and call number of each title, 
		--provided it has been ordered from more than one supplier 
		-- and the total quantity ordered is more than 10. 
		-- The list should be arranged
		-- in non-increasing order of the total quantity ordered.

SELECT name, isbn, callnumber FROM TITLE4 NATURAL JOIN Ordered4 NATURAL JOIN Purchase_Order4 
WHERE callnumber IN
(
	SELECT CallNumber FROM Ordered4 NATURAL JOIN Purchase_Order4
	GROUP BY CallNumber
	HAVING COUNT(Supplier_Id) > 1 AND SUM(Qty) > 10
)
GROUP BY callnumber, name, isbn ORDER By SUM(Qty) DESC

-- SELECT name, isbn, callnumber FROM TITLE4 WHERE callnumber IN
-- (
-- 	SELECT CallNumber FROM Ordered4
-- 	WHERE PoNum IN
-- 	(
-- 		SELECT PoNum FROM Purchase_Order4 WHERE Qty > 10
-- 	)
-- 	GROUP BY CallNumber
-- 	HAVING COUNT(Supplier_Id) > 1
-- )
-- GROUP BY callnumber

-- SELECT CallNumber FROM Ordered4 WHERE PoNum IN
-- (
-- 	SELECT PoNum FROM Purchase_Order4 WHERE Qty > 10
-- )

-- 3.      List the IDs and first names of all the members 
		--who have read less than 5% of the total number of books read from the library, 
			--in non-decreasing order of the number of books read by each.

		SELECT LibId, Fname FROM MEMBER4 WHERE LibId IN
		(
			SELECT LibId FROM Read_By4 GROUP By LibId
				HAVING COUNT(DISTINCT CallNumber) < 0.05 * (SELECT COUNT(DISTINCT CallNumber)FROM Read_By4)
		)

-- 4.      List in alphabetical order the first names and IDs of all female members of the library 
			--who have read at least one title more than once.

SELECT Fname, LibId FROM MEMBER4 WHERE Gender = 'F' AND LibId IN
(
	SELECT LibId FROM Read_By4 WHERE TimesRead > 1
)

-- 5.      List the names of the suppliers and their respective average quantities of 
			-- title orders received, whose average quantities of title orders received is 
			-- more than the average quantity of an order in the system.


SELECT Name, SUM(Qty) FROM Supplier4 NATURAL JOIN Ordered4 NATURAL JOIN Purchase_Order4
GROUP BY Supplier_Id, Name
HAVING SUM(Qty) > (SELECT SUM(Qty) FROM Ordered4 NATURAL JOIN Purchase_Order4)
					/ (SELECT COUNT(DISTINCT Supplier_Id) FROM Ordered4 NATURAL JOIN Purchase_Order4)


-- SELECT Name, SUM(Qty) FROM Ordered4 NATURAL JOIN Purchase_Order4 
-- WHERE	(SELECT SUM(Qty) FROM Ordered4 NATURAL JOIN Purchase_Order4) AS SUM_Qty
-- AND 	(SELECT COUNT(DISTINCT Supplier_Id) FROM Ordered4 NATURAL JOIN Purchase_Order4) AS SUM_Sup
-- HAVING SUM(Qty) > SUM_Qty / SUM_Sup 

-- (SELECT SUM(Qty) FROM Ordered4 NATURAL JOIN Purchase_Order4) AS SUM_Qty

-- (SELECT COUNT(DISTINCT Supplier_Id) FROM Ordered4 NATURAL JOIN Purchase_Order4) AS SUM_Sup

-- SELECT AVG(Qty) FROM Ordered4 NATURAL JOIN Purchase_Order4
-- WHERE 
-- GROUP BY Supplier_Id

-- 6.      List alphabetically the first names and IDs of all the male members of the library 
			--who joined before Oct. 10, 1995, who have read only five or fewer different titles, 
			-- and who have not read the same title twice or more.

SELECT Fname, LibId FROM MEMBER4
WHERE Gender = 'F' 
AND  (MEMBER4.Join_date < TO_DATE('1997/11/30', 'YYYY/MM/DD')) 
AND LibId IN
(	
	SELECT LibId FROM Read_By4 WHERE LibId IN 
	(
		SELECT LibId FROM Read_By4 WHERE TimesRead < 2
	)
	GROUP BY LibId HAVING COUNT(DISTINCT CallNumber) <= 5
)	ORDER BY Fname ASC

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

