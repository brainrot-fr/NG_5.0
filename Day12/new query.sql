
CREATE TABLE if not exists users (
    ID int UNIQUE PRIMARY KEY,
    Name VARCHAR(255),
    email VARCHAR(255),
    City VARCHAR(255)
);

INSERT INTO users VALUES(1, "adarsh", "adarsh@gmail.com", "MBNR");
INSERT INTO users VALUES(2, "hi", "bharat@gmail.com", "MBNR");

UPDATE users SET `Name`="second user" where ID = 2;

delete from users where `ID`=2;
select ID from users where `ID`=2;

