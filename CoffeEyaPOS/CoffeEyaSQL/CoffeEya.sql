--------------------------------------------------------
--  ÆÄÀÏÀÌ »ý¼ºµÊ - È­¿äÀÏ-1¿ù-14-2020   
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
   
SET DEFINE OFF;
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('°ûÃ¢Çõ10','1111','°ûÃ¢Çõ10','940511');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('°ûÃ¢Çõ','1111','°ûÃ¢Çõ','940511');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('°ûªFÇõ','1111','°ûÃ¢Çõ2','4949449');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('ehdrud1129','1212','³ëµ¿°æ','921129');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('kjh','1111','±èÁØÇü','19910614');

  CREATE UNIQUE INDEX "MEMBER_PK" ON "MEMBER1" ("MEM_ID") 
  ;

  ALTER TABLE "MEMBER" ADD CONSTRAINT "MEMBER_PK" PRIMARY KEY ("MEM_ID") ENABLE;
  ALTER TABLE "MEMBER" MODIFY ("MEM_ID" NOT NULL ENABLE);
  
  
  
  
  --------------------------------------------------------
--  ÆÄÀÏÀÌ »ý¼ºµÊ - È­¿äÀÏ-1¿ù-14-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PRODUCT
--------------------------------------------------------

  CREATE TABLE "PRODUCT" 
   (	"PRO_NUM" NUMBER(10,0), 
	"PRO_NAME" VARCHAR2(20 BYTE), 
	"PRO_PRICE" NUMBER(10,0)
   ) ;

SET DEFINE OFF;

  CREATE UNIQUE INDEX "MENU_PK" ON "PRODUCT" ("PRO_NUM") 
  ;

  ALTER TABLE "PRODUCT" ADD CONSTRAINT "MENU_PK" PRIMARY KEY ("PRO_NUM") ENABLE;
  ALTER TABLE "PRODUCT" MODIFY ("PRO_NUM" NOT NULL ENABLE);



--------------------------------------------------------
--  ÆÄÀÏÀÌ »ý¼ºµÊ - È­¿äÀÏ-1¿ù-14-2020   
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

SET DEFINE OFF;

  CREATE UNIQUE INDEX "ORDERING_PK" ON "ORDERING" ("OR_NUM") 
  ;

  ALTER TABLE "ORDERING" ADD CONSTRAINT "ORDERING_PK" PRIMARY KEY ("OR_NUM") ENABLE;
  ALTER TABLE "ORDERING" MODIFY ("OR_NUM" NOT NULL ENABLE);

  ALTER TABLE "ORDERING" ADD CONSTRAINT "ORDERING_NUMBER_FK" FOREIGN KEY ("MEM_ID")
	  REFERENCES "MEMBER" ("MEM_ID") ENABLE;




--------------------------------------------------------
--  ÆÄÀÏÀÌ »ý¼ºµÊ - È­¿äÀÏ-1¿ù-14-2020   
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

SET DEFINE OFF;

  CREATE UNIQUE INDEX "DETAIL_PK" ON "DETAIL" ("DE_NUM") 
  ;

  ALTER TABLE "DETAIL" ADD CONSTRAINT "DETAIL_PK" PRIMARY KEY ("DE_NUM") ENABLE;
  ALTER TABLE "DETAIL" MODIFY ("DE_NUM" NOT NULL ENABLE);

  ALTER TABLE "DETAIL" ADD CONSTRAINT "DETAIL_ORDERING_FK" FOREIGN KEY ("OR_NUM")
	  REFERENCES "ORDERING" ("OR_NUM") ENABLE;
  ALTER TABLE "DETAIL" ADD CONSTRAINT "DETAIL_PRODUCT_FK" FOREIGN KEY ("PRO_NUM")
	  REFERENCES "PRODUCT" ("PRO_NUM") ENABLE;

