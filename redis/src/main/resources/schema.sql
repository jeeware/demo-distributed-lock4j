CREATE TABLE IF NOT EXISTS Counter (
    name      VARCHAR(255) PRIMARY KEY NOT NULL,
    count     NUMERIC(10) not null,
    version   INTEGER not null
);