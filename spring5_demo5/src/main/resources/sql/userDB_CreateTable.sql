CREATE TABLE user_db.t_book (
                                book_id BIGINT auto_increment NOT NULL,
                                bookName varchar(100) NOT NULL,
                                bstatus varchar(100) NOT NULL,
                                CONSTRAINT t_book_PK PRIMARY KEY (book_id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
