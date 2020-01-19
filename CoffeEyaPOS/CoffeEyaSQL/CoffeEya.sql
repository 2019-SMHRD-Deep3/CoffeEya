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
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('곽창혁','1111','곽창혁','MANAGER');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('노동경','1111','노동경','MANAGER');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('김준형','1111','김준형','MANAGER');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('김효진','1111','김준형','MANAGER');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('1111','1111','아르바이트생1','EMPLOYEE');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('2222','2222','아르바이트생2','EMPLOYEE');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('3333','3333','아르바이트생3','EMPLOYEE');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('4444','4444','아르바이트생4','EMPLOYEE');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('5555','5555','아르바이트생5','EMPLOYEE');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('6666','6666','아르바이트생6','EMPLOYEE');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('7777','7777','아르바이트생7','EMPLOYEE');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('8888','8888','아르바이트생8','EMPLOYEE');

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
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (1,to_date('20/01/01','RR/MM/DD'),'카드',6000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (2,to_date('20/01/01','RR/MM/DD'),'카드',10000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (3,to_date('20/01/02','RR/MM/DD'),'현금',9500,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (4,to_date('20/01/02','RR/MM/DD'),'카드',18000,'4444');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (5,to_date('20/01/03','RR/MM/DD'),'현금',22000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (6,to_date('20/01/03','RR/MM/DD'),'현금',22000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (7,to_date('20/01/03','RR/MM/DD'),'카드',18000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (8,to_date('20/01/04','RR/MM/DD'),'현금',4000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (9,to_date('20/01/04','RR/MM/DD'),'카드',6000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (10,to_date('20/01/04','RR/MM/DD'),'카드',10000,'4444');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (11,to_date('20/01/05','RR/MM/DD'),'카드',6000,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (12,to_date('20/01/05','RR/MM/DD'),'카드',10000,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (13,to_date('20/01/06','RR/MM/DD'),'현금',9500,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (14,to_date('20/01/06','RR/MM/DD'),'카드',18000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (15,to_date('20/01/06','RR/MM/DD'),'현금',22000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (16,to_date('20/01/06','RR/MM/DD'),'현금',22000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (17,to_date('20/01/06','RR/MM/DD'),'카드',18000,'4444');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (18,to_date('20/01/07','RR/MM/DD'),'현금',4000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (19,to_date('20/01/07','RR/MM/DD'),'카드',6000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (20,to_date('20/01/07','RR/MM/DD'),'카드',10000,'4444');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (21,to_date('20/01/07','RR/MM/DD'),'카드',6000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (22,to_date('20/01/08','RR/MM/DD'),'카드',10000,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (23,to_date('20/01/08','RR/MM/DD'),'현금',9500,'4444');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (24,to_date('20/01/08','RR/MM/DD'),'카드',18000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (25,to_date('20/01/08','RR/MM/DD'),'현금',22000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (26,to_date('20/01/08','RR/MM/DD'),'현금',22000,'4444');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (27,to_date('20/01/08','RR/MM/DD'),'카드',18000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (28,to_date('20/01/08','RR/MM/DD'),'현금',4000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (29,to_date('20/01/08','RR/MM/DD'),'카드',6000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (30,to_date('20/01/09','RR/MM/DD'),'카드',10000,'4444');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (31,to_date('20/01/09','RR/MM/DD'),'카드',6000,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (32,to_date('20/01/09','RR/MM/DD'),'카드',10000,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (33,to_date('20/01/10','RR/MM/DD'),'현금',9500,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (34,to_date('20/01/10','RR/MM/DD'),'카드',18000,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (35,to_date('20/01/11','RR/MM/DD'),'현금',22000,'4444');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (36,to_date('20/01/11','RR/MM/DD'),'현금',22000,'1111');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (37,to_date('20/01/11','RR/MM/DD'),'카드',18000,'2222');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (38,to_date('20/01/11','RR/MM/DD'),'현금',4000,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (39,to_date('20/01/12','RR/MM/DD'),'카드',6000,'3333');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (40,to_date('20/01/12','RR/MM/DD'),'카드',10000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (41,to_date('20/01/12','RR/MM/DD'),'카드',6000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (42,to_date('20/01/13','RR/MM/DD'),'카드',10000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (43,to_date('20/01/13','RR/MM/DD'),'현금',9500,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (44,to_date('20/01/14','RR/MM/DD'),'카드',18000,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (45,to_date('20/01/15','RR/MM/DD'),'현금',22000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (46,to_date('20/01/16','RR/MM/DD'),'현금',22000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (47,to_date('20/01/16','RR/MM/DD'),'카드',18000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (48,to_date('20/01/17','RR/MM/DD'),'현금',4000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (49,to_date('20/01/17','RR/MM/DD'),'카드',6000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (50,to_date('20/01/17','RR/MM/DD'),'카드',10000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (51,to_date('20/01/18','RR/MM/DD'),'카드',6000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (52,to_date('20/01/18','RR/MM/DD'),'카드',10000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (53,to_date('20/01/18','RR/MM/DD'),'현금',9500,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (54,to_date('20/01/18','RR/MM/DD'),'카드',18000,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (55,to_date('20/01/19','RR/MM/DD'),'현금',22000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (56,to_date('20/01/19','RR/MM/DD'),'현금',22000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (57,to_date('20/01/19','RR/MM/DD'),'카드',18000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (58,to_date('20/01/19','RR/MM/DD'),'현금',4000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (59,to_date('20/01/20','RR/MM/DD'),'카드',6000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (60,to_date('20/01/20','RR/MM/DD'),'카드',10000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (61,to_date('20/01/20','RR/MM/DD'),'카드',6000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (62,to_date('20/01/21','RR/MM/DD'),'카드',10000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (63,to_date('20/01/21','RR/MM/DD'),'현금',9500,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (64,to_date('20/01/22','RR/MM/DD'),'카드',18000,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (65,to_date('20/01/22','RR/MM/DD'),'현금',22000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (66,to_date('20/01/22','RR/MM/DD'),'현금',22000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (67,to_date('20/01/22','RR/MM/DD'),'카드',18000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (68,to_date('20/01/22','RR/MM/DD'),'현금',4000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (69,to_date('20/01/23','RR/MM/DD'),'카드',6000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (70,to_date('20/01/23','RR/MM/DD'),'카드',10000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (71,to_date('20/01/24','RR/MM/DD'),'카드',6000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (72,to_date('20/01/24','RR/MM/DD'),'카드',10000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (73,to_date('20/01/25','RR/MM/DD'),'현금',9500,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (74,to_date('20/01/25','RR/MM/DD'),'카드',18000,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (75,to_date('20/01/26','RR/MM/DD'),'현금',22000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (76,to_date('20/01/26','RR/MM/DD'),'현금',22000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (77,to_date('20/01/26','RR/MM/DD'),'카드',18000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (78,to_date('20/01/26','RR/MM/DD'),'현금',4000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (79,to_date('20/01/26','RR/MM/DD'),'카드',6000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (80,to_date('20/01/27','RR/MM/DD'),'카드',10000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (81,to_date('20/01/27','RR/MM/DD'),'카드',6000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (82,to_date('20/01/28','RR/MM/DD'),'카드',10000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (83,to_date('20/01/28','RR/MM/DD'),'현금',9500,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (84,to_date('20/01/28','RR/MM/DD'),'카드',18000,'김준형');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (85,to_date('20/01/28','RR/MM/DD'),'현금',22000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (86,to_date('20/01/29','RR/MM/DD'),'현금',22000,'곽창혁');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (87,to_date('20/01/29','RR/MM/DD'),'카드',18000,'노동경');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (88,to_date('20/01/30','RR/MM/DD'),'현금',4000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (89,to_date('20/01/30','RR/MM/DD'),'카드',6000,'김효진');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (90,to_date('20/01/30','RR/MM/DD'),'카드',10000,'곽창혁');
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
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (31,11,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (32,12,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (33,12,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (34,12,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (35,13,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (36,13,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (37,14,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (38,14,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (39,14,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (40,14,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (41,14,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (42,15,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (43,15,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (44,16,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (45,16,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (46,16,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (47,17,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (48,17,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (49,18,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (50,18,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (51,18,27,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (52,18,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (53,18,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (54,18,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (55,18,10,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (56,18,2,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (57,19,20,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (58,19,22,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (59,20,17,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (60,20,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (61,21,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (62,22,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (63,22,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (64,22,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (65,23,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (66,23,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (67,24,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (68,24,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (69,24,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (70,24,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (71,24,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (72,25,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (73,25,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (74,26,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (75,26,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (76,26,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (77,27,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (78,27,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (79,28,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (80,28,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (81,28,27,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (82,28,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (83,28,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (84,28,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (85,28,10,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (86,28,2,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (87,29,20,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (88,29,22,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (89,30,17,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (90,30,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (92,31,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (92,32,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (93,32,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (94,32,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (95,33,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (96,33,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (97,34,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (98,34,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (99,34,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (100,34,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (101,34,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (102,35,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (103,35,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (104,36,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (105,36,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (106,36,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (107,37,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (108,37,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (109,38,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (110,38,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (111,38,27,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (112,38,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (113,38,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (114,38,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (115,38,10,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (116,38,2,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (117,39,20,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (118,39,22,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (119,40,17,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (120,40,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (121,41,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (122,42,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (123,42,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (124,42,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (125,43,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (126,43,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (127,44,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (128,44,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (129,44,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (130,44,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (131,44,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (132,45,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (133,45,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (134,46,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (135,46,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (136,46,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (137,47,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (138,47,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (139,48,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (140,48,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (141,48,27,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (142,48,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (143,48,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (144,48,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (145,48,10,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (146,48,2,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (147,49,20,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (148,49,22,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (149,50,17,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (150,50,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (151,51,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (152,52,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (153,52,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (154,52,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (155,53,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (156,53,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (157,54,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (158,54,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (159,54,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (160,54,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (161,54,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (162,55,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (163,55,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (164,56,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (165,56,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (166,56,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (167,57,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (168,57,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (169,58,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (170,58,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (171,58,27,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (172,58,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (173,58,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (174,58,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (175,58,10,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (176,58,2,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (177,59,20,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (178,59,22,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (179,60,17,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (180,60,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (181,61,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (182,62,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (183,62,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (184,62,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (185,63,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (186,63,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (187,64,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (188,64,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (189,64,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (190,64,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (191,64,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (192,65,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (193,65,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (194,66,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (195,66,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (196,66,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (197,67,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (198,67,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (199,68,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (200,68,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (201,69,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (202,69,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (203,69,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (204,70,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (205,70,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (206,71,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (207,72,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (208,72,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (209,72,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (210,73,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (211,73,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (212,74,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (213,74,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (214,74,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (215,74,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (216,74,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (217,75,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (218,75,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (219,76,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (220,76,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (221,76,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (222,77,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (223,77,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (224,78,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (225,78,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (226,78,27,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (227,78,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (228,78,10,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (229,78,11,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (230,78,10,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (231,78,2,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (232,79,20,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (233,79,22,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (234,80,17,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (235,80,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (236,81,1,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (237,82,1,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (238,82,2,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (239,82,4,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (240,83,8,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (241,83,10,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (242,84,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (243,84,8,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (244,84,2,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (245,84,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (246,84,3,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (247,85,7,8);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (248,85,7,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (249,86,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (250,86,13,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (251,86,1,9);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (252,87,4,2);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (253,87,3,4);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (254,88,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (255,88,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (256,88,9,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (257,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (258,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (259,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (260,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (261,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (262,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (263,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (264,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (265,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (266,89,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (267,90,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (268,90,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (269,90,18,1);
Insert into DETAIL (DE_NUM,OR_NUM,PRO_NUM,DE_AMOUNT) values (270,90,18,1);
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
   (   "CUS_NUMBER" VARCHAR2(40 BYTE), 
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