COPY registro FROM '/home/shooter/Documents/Heroku/buscador-alumnos-uni/scrapping/2_sql_to_csv.txt' WITH (FORMAT csv);
--Revisar los que tienen mas de 4 comas
DELETE FROM registro;
SELECT * FROM registro;
SELECT * FROM registro WHERE codigo LIKE '2018%';
DROP TABLE registro;
CREATE TABLE prueba(
    nombre VARCHAR(20),
    juego VARCHAR(20)
);

DROP TABLE prueba;
COPY prueba FROM '/home/shooter/Documents/Heroku/buscador-alumnos-uni/csv.txt' WITH (FORMAT csv);