DROP TABLE IF EXISTS ROOM;

CREATE TABLE ROOM (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               room_name VARCHAR(250) NOT NULL,
                               capacity INT DEFAULT NULL
);