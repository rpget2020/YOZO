DROP TABLE BROADCAST;
DROP TABLE BROADCAST CASCADE CONSTRAINTS;

CREATE SEQUENCE BROADCAST_SEQ
INCREMENT BY 1
START WITH 1
MINVALUE 0 
MAXVALUE 9999 
NOCYCLE
NOCACHE

CREATE TABLE BROADCAST(
	BROADCAST_NO NUMBER PRIMARY KEY,
	MEMBER_ID VARCHAR2(50) NOT NULL,
	BROADCAST_TITLE VARCHAR2(100) NOT NULL,
	BROADCAST_CONTENT VARCHAR2(2000) NOT NULL,
	BROADCAST_REGDATE DATE DEFAULT(SYSDATE) NOT NULL,
	BROADCAST_VIEWCOUNT NUMBER NOT NULL,
	CONSTRAINT BROADCAST_FK_MEMBER_ID FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER(MEMBER_ID)
	ON DELETE CASCADE
);

