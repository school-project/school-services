drop table FACILITY if exists;
CREATE TABLE FACILITY (
	FACILITY_ID NUMBER (10,0) NOT NULL,
	FACILITY_NAME VARCHAR2(30),
	FACILITY_TYPE VARCHAR2(30),
	PARKING_SLOTS VARCHAR2(30),
	DISABLED_PROVISION VARCHAR2(3),
	VISIBLE VARCHAR2(3),
	CONSTRAINT PK_FACILITY PRIMARY KEY (FACILITY_ID)
);

drop table CUSTOMER if exists;
CREATE TABLE CUSTOMER (
	CUSTOMER_ID NUMBER (10,0) NOT NULL,
	FIRST_NAME VARCHAR2(30),
	LAST_NAME VARCHAR2(30),
	MOBILE VARCHAR2(30),
	EMAIL_ID VARCHAR2(50),
	ADDRESS VARCHAR2(200),
	CONSTRAINT PK_CUSTOMER PRIMARY KEY (CUSTOMER_ID)
);

drop table ROLE if exists;
CREATE TABLE ROLE (
	ROLE_ID NUMBER (10,0) NOT NULL,
	ROLE_NAME VARCHAR2(30),
	CONSTRAINT PK_ROLE PRIMARY KEY (ROLE_ID)
);

drop table PLAN if exists;
CREATE TABLE PLAN (
	PLAN_ID NUMBER (10,0) NOT NULL,
	PLAN_NAME VARCHAR2(30),
	CONSTRAINT PK_PLAN PRIMARY KEY (PLAN_ID)
);

drop table SERVICE if exists;
CREATE TABLE SERVICE (
	SERVICE_ID NUMBER (10,0) NOT NULL,
	NAME VARCHAR2(30),
	RATE NUMBER (16,2),
	UOM VARCHAR2(30),
	CONSTRAINT PK_SERVICE PRIMARY KEY (SERVICE_ID)
);

drop table PLAN_SERVICE_RATE if exists;
CREATE TABLE PLAN_SERVICE_RATE (
	PLAN_ID NUMBER (10,0) NOT NULL,
	PLAN_PERIOD VARCHAR2(30),
	SERVICE_ID NUMBER (10,0) NOT NULL,
	RATE NUMBER (16,2),
	INCLUDED_AMOUNT NUMBER (10,0),
	OVERUSAGE_CHARGE NUMBER (16,2),
	CHARGE_CYCLE NUMBER (16,2)
);

drop table SUBSCRIPTION if exists;
CREATE TABLE SUBSCRIPTION (
	SUBSCRIPTION_ID NUMBER (10,0) NOT NULL,
	PLAN_ID NUMBER (10,0) NOT NULL,
	SUBSCRIPTION_START_DATE DATE,
	BILL_CYCLE_DATE DATE,
	ORDER_ID VARCHAR2(30),
	STATUS VARCHAR2(30),
	ACCOUNT_ID NUMBER (10,0) NOT NULL,
	CUSTOMER_ID NUMBER (10,0) NOT NULL,
	CONSTRAINT PK_SUBSCRIPTION PRIMARY KEY (SUBSCRIPTION_ID)
);

drop table ACCOUNT_CUSTOMER_LINK if exists;
CREATE TABLE ACCOUNT_CUSTOMER_LINK (
	UNIQUE_ID NUMBER (10,0) NOT NULL,
	ACCOUNT_ID NUMBER (10,0) NOT NULL,
	CUSTOMER_ID NUMBER (10,0) NOT NULL,
	CONSTRAINT PK_ACCOUNT_CUSTOMER_LINK PRIMARY KEY (UNIQUE_ID)
);