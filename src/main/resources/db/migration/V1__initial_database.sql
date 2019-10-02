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

DROP TABLE IF EXISTS x_ray_machines;
CREATE TABLE x_ray_machines
(
    id                     INTEGER,
    title                  varchar(50)      NOT NULL,
    focal_heel             DOUBLE PRECISION NOT NULL,
    min_voltage            DOUBLE PRECISION NOT NULL,
    max_voltage            DOUBLE PRECISION NOT NULL,
    min_current            DOUBLE PRECISION NOT NULL,
    max_current            DOUBLE PRECISION NOT NULL,
    source_window_distance DOUBLE PRECISION NOT NULL,
    PRIMARY KEY (id)
);
-- \d test;
