drop table member cascade CONSTRAINTS;
drop table product cascade CONSTRAINTS;
drop table ordering cascade CONSTRAINTS;
drop table detail;


--------------------------------------------------------
--  파일이 생성됨 - 수요일-1월-15-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------

  CREATE TABLE "MEMBER" 
   (	"MEM_ID" VARCHAR2(20 BYTE), 
	"MEM_PW" VARCHAR2(20 BYTE), 
	"MEM_NAME" VARCHAR2(20 BYTE), 
	"MEM_PERM" VARCHAR2(20 BYTE)
   ) ;
REM INSERTING into MEMBER
SET DEFINE OFF;
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('곽창혁','1111','곽창혁','manager');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('노동경','1111','노동경','manager');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('김준형','1111','김준형','manager');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('김효진','1111','김준형','manager');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('1111','1111','1111','employee');
--------------------------------------------------------
--  DDL for Index MEMBER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MEMBER_PK" ON "MEMBER" ("MEM_ID") 
  ;
--------------------------------------------------------
--  Constraints for Table MEMBER
--------------------------------------------------------

  ALTER TABLE "MEMBER" MODIFY ("MEM_ID" NOT NULL ENABLE);
  ALTER TABLE "MEMBER" ADD CONSTRAINT "MEMBER_PK" PRIMARY KEY ("MEM_ID") ENABLE;
  
  
  
  
  
  --------------------------------------------------------
--  파일이 생성됨 - 수요일-1월-15-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PRODUCT
--------------------------------------------------------

  CREATE TABLE "PRODUCT" 
   (	"PRO_NUM" NUMBER(10,0), 
	"PRO_NAME" VARCHAR2(20 BYTE), 
	"PRO_PRICE" NUMBER(10,0)
   ) ;
REM INSERTING into PRODUCT
SET DEFINE OFF;
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (1,'아메리카노',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (2,'에스프레소',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (3,'카페라떼',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (4,'카페모카',4500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (5,'화이트모카',5500);
--------------------------------------------------------
--  DDL for Index MENU_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MENU_PK" ON "PRODUCT" ("PRO_NUM") 
  ;
--------------------------------------------------------
--  Constraints for Table PRODUCT
--------------------------------------------------------

  ALTER TABLE "PRODUCT" MODIFY ("PRO_NUM" NOT NULL ENABLE);
  ALTER TABLE "PRODUCT" ADD CONSTRAINT "MENU_PK" PRIMARY KEY ("PRO_NUM") ENABLE;


--------------------------------------------------------
--  파일이 생성됨 - 수요일-1월-15-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ORDERING
--------------------------------------------------------

  CREATE TABLE "ORDERING" 
   (	"OR_NUM" NUMBER(10,0), 
	"OR_DATE" DATE, 
	"OR_PAY" VARCHAR2(20 BYTE), 
	"OR_SUM" NUMBER(10,0), 
	"MEM_ID" VARCHAR2(20 BYTE)
   ) ;
REM INSERTING into ORDERING
SET DEFINE OFF;
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (1,to_date('20/01/01','RR/MM/DD'),'카드',6000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (2,to_date('20/01/01','RR/MM/DD'),'카드',10000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (3,to_date('20/01/02','RR/MM/DD'),'현금',9500,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (4,to_date('20/01/02','RR/MM/DD'),'현금',8000,'노동경');
--------------------------------------------------------
--  DDL for Index ORDERING_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ORDERING_PK" ON "ORDERING" ("OR_NUM") 
  ;
--------------------------------------------------------
--  Constraints for Table ORDERING
--------------------------------------------------------

  ALTER TABLE "ORDERING" MODIFY ("OR_NUM" NOT NULL ENABLE);
  ALTER TABLE "ORDERING" ADD CONSTRAINT "ORDERING_PK" PRIMARY KEY ("OR_NUM") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ORDERING
--------------------------------------------------------

  ALTER TABLE "ORDERING" ADD CONSTRAINT "ORDERING_NUMBER_FK" FOREIGN KEY ("MEM_ID")
	  REFERENCES "MEMBER" ("MEM_ID") ENABLE;




--------------------------------------------------------
--  파일이 생성됨 - 수요일-1월-15-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table DETAIL
--------------------------------------------------------

  CREATE TABLE "DETAIL" 
   (	"DE_NUM" NUMBER(10,0), 
	"OR_NUM" NUMBER(10,0), 
	"PRO_NUM" NUMBER(10,0), 
	"DE_AMOUNT" NUMBER(10,0)
   ) ;
REM INSERTING into DETAIL
SET DEFINE OFF;
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (1,1,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (2,2,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (3,2,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (4,2,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (5,3,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (6,3,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (7,4,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (8,4,4,1);
--------------------------------------------------------
--  DDL for Index DETAIL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "DETAIL_PK" ON "DETAIL" ("DE_NUM") 
  ;
--------------------------------------------------------
--  Constraints for Table DETAIL
--------------------------------------------------------

  ALTER TABLE "DETAIL" MODIFY ("DE_NUM" NOT NULL ENABLE);
  ALTER TABLE "DETAIL" ADD CONSTRAINT "DETAIL_PK" PRIMARY KEY ("DE_NUM") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table DETAIL
--------------------------------------------------------

  ALTER TABLE "DETAIL" ADD CONSTRAINT "DETAIL_ORDERING_FK" FOREIGN KEY ("OR_NUM")
	  REFERENCES "ORDERING" ("OR_NUM") ENABLE;
  ALTER TABLE "DETAIL" ADD CONSTRAINT "DETAIL_PRODUCT_FK" FOREIGN KEY ("PRO_NUM")
	  REFERENCES "PRODUCT" ("PRO_NUM") ENABLE;

  
  
