BEGIN
 EXECUTE IMMEDIATE '
     CREATE TABLE Counter (
        name      VARCHAR(255) PRIMARY KEY NOT NULL,
        count     NUMERIC(10) not null,
        version   INTEGER not null
    )
    ';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -955 THEN
            RAISE;
        END IF;
END;
;;
