DROP TABLE GOODS CASCADE CONSTRAINT;
DROP TABLE GOODS1 CASCADE CONSTRAINT;

CREATE SEQUENCE GOODS_SEQ
INCREMENT BY 1
START WITH 1
MINVALUE 0 
MAXVALUE 9999 
NOCYCLE
NOCACHE

CREATE TABLE GOODS(
	GOODS_NO NUMBER DEFAULT 1 PRIMARY KEY,
	MEMBER_ID VARCHAR2(50) NOT NULL,
	GOODS_TITLE VARCHAR2(100) NOT NULL UNIQUE,
	GOODS_PRICE NUMBER NOT NULL UNIQUE,
	GOODS_QUANTITY NUMBER NOT NULL,
	GOODS_PHOTO VARCHAR2(4000) NOT NULL,
	GOODS_CONTENT VARCHAR2(4000) NOT NULL,
	GOODS_REGDATE DATE DEFAULT(SYSDATE) NOT NULL,
	CONSTRAINT GOODS_FK_MEMBER_ID FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER(MEMBER_ID)
	ON DELETE CASCADE
);
--테이블정의서에서 GOODS_READCOUNT : 조회수 안 넣었습니다.

CREATE TABLE GOODS1(
	GOODS_NO NUMBER DEFAULT 1 PRIMARY KEY,
	MEMBER_ID VARCHAR2(50) NOT NULL,
	GOODS_TITLE VARCHAR2(100) NOT NULL UNIQUE,
	GOODS_PRICE NUMBER NOT NULL UNIQUE,
	GOODS_QUANTITY NUMBER NOT NULL,
	GOODS_PHOTO VARCHAR2(4000) NOT NULL,
	GOODS_CONTENT VARCHAR2(4000) NOT NULL,
	GOODS_REGDATE DATE DEFAULT(SYSDATE) NOT NULL
);


SELECT * FROM GOODS;