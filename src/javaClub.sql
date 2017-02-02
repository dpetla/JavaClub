
/**
 * Author:  Douglas Petla
 * Student ID: 991413692
 * Created: Jul 27, 2016
 */


-- delete previous table
DROP TABLE IF EXISTS jcUser;

-- create table
CREATE TABLE jcUser
(
    id VARCHAR(25) PRIMARY KEY,
    password varchar(128) NOT NULL,
    firstName VARCHAR(25) NOT NULL,
    lastName VARCHAR(25) NOT NULL,
    email VARCHAR(50) NOT NULL
);

--SELECT * FROM jcUser;