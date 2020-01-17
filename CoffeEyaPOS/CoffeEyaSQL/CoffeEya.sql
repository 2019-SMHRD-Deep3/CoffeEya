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
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('1111','1111','아르바이트생1','employee');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('2222','2222','아르바이트생2','employee');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('3333','3333','아르바이트생3','employee');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('4444','4444','아르바이트생4','employee');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('5555','5555','아르바이트생5','employee');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('6666','6666','아르바이트생6','employee');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('7777','7777','아르바이트생7','employee');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('8888','8888','아르바이트생8','employee');
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
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (1,to_date('20/01/01','RR/MM/DD'),'카드',6000,'아르바이트생1');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (2,to_date('20/01/01','RR/MM/DD'),'카드',10000,'아르바이트생1');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (3,to_date('20/01/02','RR/MM/DD'),'현금',9500,'아르바이트생1');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (4,to_date('20/01/02','RR/MM/DD'),'카드',18000,'아르바이트생1');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (5,to_date('20/01/03','RR/MM/DD'),'현금',22000,'아르바이트생1');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (6,to_date('20/01/03','RR/MM/DD'),'현금',22000,'아르바이트생5');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (7,to_date('20/01/03','RR/MM/DD'),'카드',18000,'아르바이트생5');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (8,to_date('20/01/04','RR/MM/DD'),'현금',4000,'아르바이트생5');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (9,to_date('20/01/04','RR/MM/DD'),'카드',6000,'아르바이트생5');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (10,to_date('20/01/04','RR/MM/DD'),'카드',10000,'아르바이트생5');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (11,to_date('20/01/04','RR/MM/DD'),'현금',9500,'아르바이트생5');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (12,to_date('20/01/04','RR/MM/DD'),'카드',18000,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (13,to_date('20/01/05','RR/MM/DD'),'현금',22000,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (14,to_date('20/01/05','RR/MM/DD'),'카드',22000,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (15,to_date('20/01/05','RR/MM/DD'),'현금',18000,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (16,to_date('20/01/06','RR/MM/DD'),'현금',4000,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (17,to_date('20/01/06','RR/MM/DD'),'카드',6000,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (18,to_date('20/01/06','RR/MM/DD'),'카드',10000,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (19,to_date('20/01/06','RR/MM/DD'),'현금',9500,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (20,to_date('20/01/07','RR/MM/DD'),'현금',18000,'아르바이트생6');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (21,to_date('20/01/07','RR/MM/DD'),'현금',22000,'아르바이트생2');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (22,to_date('20/01/07','RR/MM/DD'),'카드',22000,'아르바이트생2');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (23,to_date('20/01/07','RR/MM/DD'),'카드',18000,'아르바이트생2');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (24,to_date('20/01/07','RR/MM/DD'),'카드',4000,'아르바이트생2');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (25,to_date('20/01/07','RR/MM/DD'),'카드',6000,'아르바이트생2');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (26,to_date('20/01/08','RR/MM/DD'),'카드',10000,'아르바이트생2');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (27,to_date('20/01/08','RR/MM/DD'),'현금',9500,'아르바이트생2');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (28,to_date('20/01/08','RR/MM/DD'),'현금',18000,'아르바이트생2');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (29,to_date('20/01/08','RR/MM/DD'),'카드',22000,'아르바이트생7');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (30,to_date('20/01/08','RR/MM/DD'),'카드',22000,'아르바이트생7');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (31,to_date('20/01/08','RR/MM/DD'),'카드',8000,'아르바이트생7');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (32,to_date('20/01/08','RR/MM/DD'),'현금',4000,'아르바이트생7');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (33,to_date('20/01/08','RR/MM/DD'),'카드',6000,'아르바이트생7');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (34,to_date('20/01/09','RR/MM/DD'),'카드',10000,'아르바이트생7');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (35,to_date('20/01/09','RR/MM/DD'),'현금',9500,'아르바이트생7');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (36,to_date('20/01/09','RR/MM/DD'),'카드',18000,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (37,to_date('20/01/09','RR/MM/DD'),'카드',22000,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (38,to_date('20/01/09','RR/MM/DD'),'현금',22000,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (39,to_date('20/01/09','RR/MM/DD'),'카드',18000,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (40,to_date('20/01/09','RR/MM/DD'),'현금',4000,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (41,to_date('20/01/10','RR/MM/DD'),'카드',6000,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (42,to_date('20/01/10','RR/MM/DD'),'카드',10000,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (43,to_date('20/01/10','RR/MM/DD'),'현금',9500,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (44,to_date('20/01/10','RR/MM/DD'),'카드',18000,'아르바이트생3');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (45,to_date('20/01/04','RR/MM/DD'),'카드',22000,'아르바이트생4');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (46,to_date('20/01/10','RR/MM/DD'),'현금',22000,'아르바이트생4');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (47,to_date('20/01/11','RR/MM/DD'),'현금',18000,'아르바이트생4');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (48,to_date('20/01/11','RR/MM/DD'),'현금',4000,'아르바이트생4');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (49,to_date('20/01/11','RR/MM/DD'),'카드',6000,'아르바이트생4');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (50,to_date('20/01/11','RR/MM/DD'),'카드',10000,'아르바이트생4');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (51,to_date('20/01/12','RR/MM/DD'),'카드',9500,'아르바이트생4');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (52,to_date('20/01/12','RR/MM/DD'),'카드',18000,'아르바이트생4');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (53,to_date('20/01/12','RR/MM/DD'),'카드',22000,'아르바이트생8');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (54,to_date('20/01/12','RR/MM/DD'),'현금',22000,'아르바이트생8');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (55,to_date('20/01/12','RR/MM/DD'),'카드',18000,'아르바이트생8');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (56,to_date('20/01/12','RR/MM/DD'),'현금',4000,'아르바이트생8');
------------------------------------------------------
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
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (5,3,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (6,3,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (7,4,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (8,4,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (9,4,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (10,4,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (11,4,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (12,5,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (13,5,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (14,6,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (15,6,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (16,6,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (17,7,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (18,7,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (19,8,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (20,8,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (21,8,27,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (22,8,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (23,8,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (24,8,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (25,8,10,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (26,8,2,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (27,9,20,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (28,9,22,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (29,10,17,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (30,10,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (31,11,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (32,11,1,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (33,12,17,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (34,13,19,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (35,14,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (36,14,2,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (37,14,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (38,14,9,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (39,14,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (40,15,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (41,16,3,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (42,17,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (43,18,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (44,18,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (45,19,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (46,20,1,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (47,21,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (48,22,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (49,23,6,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (50,23,6,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (51,24,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (52,24,8,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (53,25,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (54,26,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (55,27,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (56,28,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (57,29,11,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (58,30,20,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (59,31,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (60,32,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (53,33,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (54,34,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (55,35,14,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (56,36,12,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (57,37,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (58,38,7,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (59,39,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (60,40,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (61,41,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (62,42,21,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (63,43,21,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (64,44,10,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (65,45,10,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (66,46,6,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (67,47,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (68,48,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (69,49,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (70,50,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (71,51,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (72,51,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (73,52,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (74,53,6,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (75,53,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (76,53,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (77,53,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (78,54,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (79,55,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (80,56,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (81,56,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (82,56,6,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (83,56,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (84,56,1,1);
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
