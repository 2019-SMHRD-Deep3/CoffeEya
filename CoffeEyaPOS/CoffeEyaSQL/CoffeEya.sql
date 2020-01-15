drop table member cascade CONSTRAINTS;
drop table product cascade CONSTRAINTS;
drop table ordering cascade CONSTRAINTS;
drop table detail;


--------------------------------------------------------
--  ������ ������ - ������-1��-15-2020   
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
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('��â��','1111','��â��','manager');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('�뵿��','1111','�뵿��','manager');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('������','1111','������','manager');
Insert into MEMBER (MEM_ID,MEM_PW,MEM_NAME,MEM_PERM) values ('��ȿ��','1111','������','manager');
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
--  ������ ������ - ������-1��-15-2020   
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
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (1,'����������',2000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (2,'�Ƹ޸�ī��',2000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (3,'���̽�_�Ƹ޸�ī��',2000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (4,'ī���',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (5,'���̽�_ī���',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (6,'īǪġ��',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (7,'���̽�_īǪġ��',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (8,'ī��Ḷ���ƶ�',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (9,'���̽�_ī��Ḷ���ƶ�',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (10,'ī���ī',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (11,'���̽�_ī���ī',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (12,'���ڶ�',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (13,'���̽�_���ڶ�',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (14,'�����񷵶�',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (15,'���̽�_�����񷵶�',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (16,'�ٴҶ��',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (17,'���̽�_�ٴҶ��',3500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (18,'�׸�Ƽ��',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (19,'���̽�_�׸�Ƽ��',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (20,'�����',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (21,'���̽�_�����',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (22,'����',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (23,'���̽�_����',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (24,'������',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (25,'���̽�_������',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (26,'�����',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (27,'���̽�_�����',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (28,'����',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (29,'���̽�_����',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (30,'�����̵�',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (31,'�ڸ����̵�',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (32,'���⿡�̵�',3700);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (33,'���Ƽ',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (34,'���̽�_���Ƽ',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (35,'��ũƼ',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (36,'���̽�_��ũƼ',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (37,'���۹�Ʈ',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (38,'���̽�_���۹�Ʈ',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (39,'������',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (40,'���̽�_������',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (41,'�����',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (42,'���̽�_�����',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (43,'������',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (44,'���̽�_������',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (45,'������',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (46,'���̽�_������',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (47,'������Ʈ������',4000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (48,'������Ʈ������',4000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (49,'��纣�����Ʈ������',4000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (50,'������ÿ��Ʈ������',4000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (51,'�ٴҶ���ũ',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (52,'���ڽ���ũ',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (53,'��纣������ũ',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (54,'���⽦��ũ',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (55,'������ũ',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (56,'���ý���ũ',4300);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (57,'��Ű',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (58,'��ī��',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (59,'����',2500);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (60,'���̱�',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (61,'����',3000);
Insert into PRODUCT (PRO_NUM,PRO_NAME,PRO_PRICE) values (62,'��������',5000);

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
--  ������ ������ - ������-1��-15-2020   
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
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (1,to_date('20/01/01','RR/MM/DD'),'ī��',6000,'��â��');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (2,to_date('20/01/01','RR/MM/DD'),'ī��',10000,'��â��');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (3,to_date('20/01/02','RR/MM/DD'),'����',9500,'�뵿��');
Insert into ORDERING (OR_NUM,OR_DATE,OR_PAY,OR_SUM,MEM_ID) values (4,to_date('20/01/02','RR/MM/DD'),'����',8000,'�뵿��');
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
--  ������ ������ - ������-1��-15-2020   
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

  
  
