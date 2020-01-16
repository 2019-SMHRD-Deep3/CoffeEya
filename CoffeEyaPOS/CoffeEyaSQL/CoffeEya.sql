drop table member cascade CONSTRAINTS;
drop table product cascade CONSTRAINTS;
drop table ordering cascade CONSTRAINTS;
drop table detail;
drop table customer;


--------------------------------------------------------
--  파일이 생성됨 - 수요일-1월-15-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------



CREATE TABLE "MEMBER" 
   (   "MEM_ID" VARCHAR2(40 BYTE), 
   "MEM_PW" VARCHAR2(40 BYTE), 
   "MEM_NAME" VARCHAR2(40 BYTE),
   "MEM_PERM" VARCHAR2(40 BYTE)
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
   (   "PRO_NUM" NUMBER(20,0), 
   "PRO_NAME" VARCHAR2(40 BYTE), 
   "PRO_PRICE" NUMBER(20,0)
   ) ;
REM INSERTING into PRODUCT
SET DEFINE OFF;
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (1,'에스프레소',2000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (2,'아메리카노',2000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (3,'아이스_아메리카노',2000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (4,'카페라떼',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (5,'아이스_카페라떼',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (6,'카푸치노',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (7,'아이스_카푸치노',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (8,'카라멜마끼아또',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (9,'아이스_카라멜마끼아또',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (10,'카페모카',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (11,'아이스_카페모카',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (12,'초코라떼',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (13,'아이스_초코라떼',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (14,'헤이즐럿라떼',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (15,'아이스_헤이즐럿라떼',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (16,'바닐라라떼',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (17,'아이스_바닐라라떼',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (18,'그린티라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (19,'아이스_그린티라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (20,'고구마라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (21,'아이스_고구마라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (22,'딸기라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (23,'아이스_딸기라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (24,'쿠키',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (25,'마카롱',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (26,'머핀',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (27,'베이글',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (28,'조각케익',5000);

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
   (   "OR_NUM" NUMBER(20,0), 
   "OR_DATE" DATE, 
   "OR_PAY" VARCHAR2(40 BYTE), 
   "OR_SUM" NUMBER(20,0), 
   "MEM_ID" VARCHAR2(40 BYTE)
   ) ;
REM INSERTING into ORDERING
SET DEFINE OFF;
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (1,to_date('20/01/01','RR/MM/DD'),'카드',6000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (2,to_date('20/01/01','RR/MM/DD'),'카드',10000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (3,to_date('20/01/02','RR/MM/DD'),'현금',9500,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (4,to_date('20/01/02','RR/MM/DD'),'현금',18000,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (5,to_date('20/01/04','RR/MM/DD'),'현금',22000,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (6,to_date('20/01/04','RR/MM/DD'),'현금',22000,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (7,to_date('20/01/04','RR/MM/DD'),'현금',18000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (8,to_date('20/01/04','RR/MM/DD'),'현금',4000,'김효진');
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
   (   "DE_NUM" NUMBER(20,0), 
   "OR_NUM" NUMBER(20,0), 
   "PRO_NUM" NUMBER(20,0), 
   "DE_AMOUNT" NUMBER(20,0)
   ) ;
REM INSERTING into DETAIL
SET DEFINE OFF;
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (1,1,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (2,2,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (3,2,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (4,2,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (5,3,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (6,3,4,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (7,4,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (8,4,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (9,4,6,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (10,4,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (11,4,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (12,5,3,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (13,5,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (14,6,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (15,6,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (16,6,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (17,7,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (18,7,6,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (19,8,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (20,8,1,1);
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
     
--------------------------------------------------------
--  파일이 생성됨 - 목요일-1월-16-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CUSTOMER
--------------------------------------------------------

  CREATE TABLE "CUSTOMER" 
   (	"CUS_NUMBER" VARCHAR2(40 BYTE), 
	"CUS_NAME" VARCHAR2(40 BYTE), 
	"CUS_PHONE" VARCHAR2(40 BYTE), 
	"CUS_SEX" VARCHAR2(40 BYTE), 
	"CUS_BIRTHDAY" DATE, 
	"CUS_POINT" NUMBER(20,0)
   ) ;
REM INSERTING into CUSTOMER
SET DEFINE OFF;
Insert into CUSTOMER (CUS_NUMBER,CUS_NAME,CUS_PHONE,CUS_SEX,CUS_BIRTHDAY,CUS_POINT) values (7001,'김혜리','010-8447-4564','FEMALE',to_date('98/11/04','RR/MM/DD'),1320);
Insert into CUSTOMER (CUS_NUMBER,CUS_NAME,CUS_PHONE,CUS_SEX,CUS_BIRTHDAY,CUS_POINT) values (7002,'고성원','010-4644','MALE',to_date('96/03/02','RR/MM/DD'),260);
Insert into CUSTOMER (CUS_NUMBER,CUS_NAME,CUS_PHONE,CUS_SEX,CUS_BIRTHDAY,CUS_POINT) values (7003,'이재욱','010-3628','MALE',to_date('94/08/12','RR/MM/DD'),873);
Insert into CUSTOMER (CUS_NUMBER,CUS_NAME,CUS_PHONE,CUS_SEX,CUS_BIRTHDAY,CUS_POINT) values (7004,'윤지혜','010-8487-4564','FEMALE',to_date('90/02/09','RR/MM/DD'),1358);
Insert into CUSTOMER (CUS_NUMBER,CUS_NAME,CUS_PHONE,CUS_SEX,CUS_BIRTHDAY,CUS_POINT) values (7005,'강혜성','010-4644-4852','FEMALE',to_date('98/08/17','RR/MM/DD'),1351);
Insert into CUSTOMER (CUS_NUMBER,CUS_NAME,CUS_PHONE,CUS_SEX,CUS_BIRTHDAY,CUS_POINT) values (7006,'이재원','010-3628-4491','FEMALE',to_date('99/11/06','RR/MM/DD'),5142);
Insert into CUSTOMER (CUS_NUMBER,CUS_NAME,CUS_PHONE,CUS_SEX,CUS_BIRTHDAY,CUS_POINT) values (7007,'김인우','010-5496-8125','MALE',to_date('00/07/08','RR/MM/DD'),3213);
Insert into CUSTOMER (CUS_NUMBER,CUS_NAME,CUS_PHONE,CUS_SEX,CUS_BIRTHDAY,CUS_POINT) values (7008,'유지윤','010-8486-1138','MALE',to_date('00/02/12','RR/MM/DD'),153);
--------------------------------------------------------
--  DDL for Index CUSTOMER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "CUSTOMER_PK" ON "CUSTOMER" ("CUS_NUMBER") 
  ;
--------------------------------------------------------
--  Constraints for Table CUSTOMER
--------------------------------------------------------

  ALTER TABLE "CUSTOMER" MODIFY ("CUS_NUMBER" NOT NULL ENABLE);
  ALTER TABLE "CUSTOMER" ADD CONSTRAINT "CUSTOMER_PK" PRIMARY KEY ("CUS_NUMBER") ENABLE;
