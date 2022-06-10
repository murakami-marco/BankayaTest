CREATE DATABASE pokemon;
CREATE USER pokemon WITH PASSWORD 'pokemon';
GRANT ALL PRIVILEGES ON DATABASE "pokemon" to pokemon;
CREATE TABLE pokemon.public.registry (
	ip varchar NOT NULL,
	request_date date NOT NULL,
	"method" varchar NOT NULL
);