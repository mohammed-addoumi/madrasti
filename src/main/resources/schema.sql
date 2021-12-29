CREATE TABLE teacher (
id serial PRIMARY KEY,
first_name VARCHAR ( 50 )  NOT NULL,
last_name VARCHAR ( 50 ) NOT NULL
);

CREATE SEQUENCE hibernate_sequence START 1 increment BY 1;