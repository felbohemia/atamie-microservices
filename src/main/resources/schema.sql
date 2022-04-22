
--DROP TABLE IF EXISTS customer;


CREATE TABLE IF NOT EXISTS customer
(
  cus_Id int not null primary key AUTO_INCREMENT,
  first_Name varchar(20) not null,
  last_Name varchar(20) not null,
  phone varchar(13) not null,
  email varchar(50) not null,
  period DATETIME,
  UNIQUE(phone, email)

);