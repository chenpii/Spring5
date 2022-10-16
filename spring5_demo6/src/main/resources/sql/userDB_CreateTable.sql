CREATE TABLE user_db.t_account (
                                   id varchar(100) NOT NULL,
                                   username varchar(100) NULL,
                                   money varchar(100) NULL,
                                   CONSTRAINT t_account_PK PRIMARY KEY (id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
