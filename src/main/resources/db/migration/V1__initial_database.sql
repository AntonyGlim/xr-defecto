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
  id                     serial,
  title                  VARCHAR(50)      NOT NULL,
  focal_heel             DOUBLE PRECISION NOT NULL,
  min_voltage            DOUBLE PRECISION NOT NULL,
  max_voltage            DOUBLE PRECISION NOT NULL,
  min_current            DOUBLE PRECISION NOT NULL,
  max_current            DOUBLE PRECISION NOT NULL,
  source_window_distance DOUBLE PRECISION NOT NULL,
  image                  VARCHAR(255),
  PRIMARY KEY (id)
);
-- \d x_ray_machines;
INSERT INTO x_ray_machines (title, focal_heel, min_voltage, max_voltage, min_current, max_current,
                            source_window_distance, image)
VALUES ('RIX 300 VC2', '2.5', '160', '300', '3', '3', '140', ''),
       ('0.3 СБК 160 С РК', '0.8', '50', '160', '0', '3', '60', '');
-- SELECT * FROM x_ray_machines;


DROP TABLE IF EXISTS materials;
CREATE TABLE materials
(
  id                    serial,
  title                 VARCHAR(50)      NOT NULL,
  max_allowable_voltage DOUBLE PRECISION NOT NULL,
  PRIMARY KEY (id)
);
-- \d materials;
INSERT INTO materials (title, max_allowable_voltage)
VALUES ('Al', '70'),
       ('Ti', '100'),
       ('Fe', '160'),
       ('Cu', '190');
-- SELECT * FROM materials;