CREATE TABLE contact (
                         id bigserial NOT NULL,
                         email varchar(255),
                         message varchar(500),
                         name varchar(255),
                         phone varchar(255),
                         PRIMARY KEY (id)
);
CREATE TABLE user_entity (
                             id BIGSERIAL NOT NULL PRIMARY KEY,
                             password VARCHAR(255),
                             username VARCHAR(255) UNIQUE
);

