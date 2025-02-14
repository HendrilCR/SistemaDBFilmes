drop table if exists filmes;
drop table if exists usuarios;

create table usuarios(
	id integer primary key,
	nome varchar(40),
	email varchar(40),
	senha varchar(40) --Lembrar de implementar encriptação de senhas
	-- Informações adicionais como Gênero, Pais, etc
);

create table filmes(
	id integer primary key,
	nome varchar(40),
	classificacao_indicativa varchar(5),
	genero varchar(15),
	ano_lancamento integer,
	media_estrelas float(5)
);

insert into usuarios values (0,'Marcelo Correia','mcorreia@hotmail.com','12345678');
insert into filmes values (0,'Detetive Pikachu','13+','Aventura',2020,0);

select * from usuarios;
select * from filmes;



