CREATE TABLE contact (
                         id bigserial NOT NULL,
                         email varchar(255),
                         message varchar(255),
                         name varchar(255),
                         phone varchar(255),
                         PRIMARY KEY (id)
);
