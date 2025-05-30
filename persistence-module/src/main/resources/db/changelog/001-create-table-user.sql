CREATE TABLE IF NOT EXISTS public.t_user (
    email VARCHAR NOT NULL,
    name VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    last_update_time BIGINT,
    PRIMARY KEY (email)
);
