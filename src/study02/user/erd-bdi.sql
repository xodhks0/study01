
/* Drop Triggers */

DROP TRIGGER TRI_USER_INFO_UI_NUM;



/* Drop Tables */

DROP TABLE USER_INFO CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_USER_INFO_UI_NUM;




/* Create Sequences */

CREATE SEQUENCE SEQ_USER_INFO_UI_NUM INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE USER_INFO
(
	UI_NUM number(10,0) NOT NULL,
	UI_ID varchar2(50) NOT NULL UNIQUE,
	UI_PWD varchar2(50) NOT NULL,
	UI_NAME varchar2(30) NOT NULL,
	UI_AGE number(3,0) NOT NULL,
	UI_ETC varchar2(4000),
	PRIMARY KEY (UI_NUM)
);



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_USER_INFO_UI_NUM BEFORE INSERT ON USER_INFO
FOR EACH ROW
BEGIN
	SELECT SEQ_USER_INFO_UI_NUM.nextval
	INTO :new.UI_NUM
	FROM dual;
END;

/




