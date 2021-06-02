USE adlister_db;

DROP TABLE IF EXISTS ads;

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    title VARCHAR (100) NOT NULL,
    description VARCHAR (100),
    user_id INT UNSIGNED DEFAULT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)

);