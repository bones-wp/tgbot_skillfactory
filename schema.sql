CREATE TABLE if not exists ACTIVE_CHAT
(
    ID      SERIAL PRIMARY KEY NOT NULL,
    CHAT_ID INTEGER            NOT NULL
);

CREATE TABLE if not exists INCOMES
(
    ID      SERIAL PRIMARY KEY NOT NULL,
    CHAT_ID INTEGER            NOT NULL,
    INCOME  INTEGER
);

CREATE TABLE if not exists SPENDS
(
    ID      SERIAL PRIMARY KEY NOT NULL,
    CHAT_ID INTEGER            NOT NULL,
    SPEND   INTEGER
);

create sequence HIBERNATE_SEQUENCE
    minvalue 100000
    maxvalue 9999999999999999
    start with 100060
    increment by 1
    cache 20;