CREATE TABLE templates (
  id VARCHAR(50) ,
  subject VARCHAR(45) NOT NULL,
  content VARCHAR(45) NOT NULL,
  language VARCHAR(45) NOT NULL,
  primary key (id)
);


CREATE TABLE sms (
  id VARCHAR(50) ,
  subject VARCHAR(45) NOT NULL,
  content VARCHAR(45) NOT NULL,
  language VARCHAR(45) NOT NULL,
  primary key (id)
);


CREATE TABLE mail (
  id VARCHAR(50) ,
  subject VARCHAR(45) NOT NULL,
  content VARCHAR(45) NOT NULL,
  language VARCHAR(45) NOT NULL,
  primary key (id)
);


SELECT * FROM templates;
SELECT * FROM sms;
SELECT * FROM mail;

