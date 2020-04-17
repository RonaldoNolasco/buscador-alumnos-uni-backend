DROP SCHEMA public CASCADE; CREATE SCHEMA public;

--SELECT pg_size_pretty( pg_total_relation_size('alumno'));
SELECT COUNT(*) FROM alumno;

COPY alumno FROM '/home/shooter/Documents/Heroku/buscador-alumnos-uni/scrapping/2_sql_to_csv.txt' WITH (FORMAT csv);
--Revisar los que tienen mas de 4 comas
DELETE FROM alumno;
SELECT * FROM alumno;
SELECT (codigo, especialidad, apellido_paterno, apellido_materno, nombre) FROM alumno WHERE codigo LIKE '2018%' AND nombre LIKE 'RON%';
DROP TABLE alumno;
CREATE TABLE prueba(
    nombre VARCHAR(20),
    juego VARCHAR(20)
);

DROP TABLE prueba;
COPY prueba FROM '/home/shooter/Documents/Heroku/buscador-alumnos-uni/csv.txt' WITH (FORMAT csv);

--INSERT INTO alumno (codigo, apellido_paterno, apellido_materno, especialidad, nombre) VALUES ('20180125F', 'Nolasco', 'Chavez', 'Sistemas', 'Ronaldo');