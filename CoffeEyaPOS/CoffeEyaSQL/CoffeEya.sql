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
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (20,'오곡라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (21,'아이스_오곡라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (22,'쑥라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (23,'아이스_쑥라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (24,'고구마라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (25,'아이스_고구마라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (26,'딸기라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (27,'아이스_딸기라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (28,'쑥라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (29,'아이스_쑥라떼',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (30,'레몬에이드',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (31,'자몽에이드',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (32,'딸기에이드',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (33,'허브티',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (34,'아이스_허브티',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (35,'밀크티',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (36,'아이스_밀크티',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (37,'페퍼민트',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (38,'아이스_페퍼민트',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (39,'유자차',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (40,'아이스_유자차',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (41,'모과차',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (42,'아이스_모과차',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (43,'생강차',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (44,'아이스_생강차',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (45,'대추차',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (46,'아이스_대추차',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (47,'딸기요거트스무디',4000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (48,'망고요거트스무디',4000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (49,'블루베리요거트스무디',4000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (50,'망고애플요거트스무디',4000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (51,'바닐라쉐이크',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (52,'초코쉐이크',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (53,'블루베리쉐이크',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (54,'딸기쉐이크',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (55,'망고쉐이크',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (56,'애플쉐이크',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (57,'쿠키',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (58,'마카롱',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (59,'머핀',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (60,'베이글',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (61,'와플',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (62,'조각케익',5000);

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

  
  
