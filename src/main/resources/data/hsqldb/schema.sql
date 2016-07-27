DROP TABLE Client IF EXISTS
CREATE TABLE Client (
id BIGINT GENERATED BY DEFAULT AS IDENTITY (START WITH BY 1, INCREMENT BY 1) NOT NULL,
name VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
phone INT(12) NOT NULL,
PRIMARY KEY(id)
);