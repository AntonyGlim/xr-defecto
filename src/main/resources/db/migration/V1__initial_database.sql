-- *for Windows
-- \! chcp 1251

-- *for Linux
-- sudo -i -u postgres
-- psql

-- *new password for user postgres
-- ALTER USER postgres PASSWORD 'admin';

-- DROP SCHEMA IF EXISTS as_terra_xr_defecto_v1 CASCADE;
-- CREATE SCHEMA as_terra_xr_defecto_v1;
--
-- SET search_path TO as_terra_xr_defecto_v1;

DROP TABLE IF EXISTS test;
CREATE TABLE test
(
    id         bigserial,
    username   varchar(50) NOT NULL,
    password   varchar(80) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name  VARCHAR(50) NOT NULL,
    email      VARCHAR(50) NOT NULL,
    phone      VARCHAR(15) NOT NULL,
    PRIMARY KEY (id)
);
-- \d test;
