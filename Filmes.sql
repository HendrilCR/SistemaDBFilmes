drop table if exists filmes;
drop table if exists usuarios;
drop table if exists avaliacoes;

create table usuarios(
	id serial primary key,
	nome varchar(40),
	usuario varchar(40),
	email varchar(40),
	senha varchar(40) --Lembrar de implementar encriptação de senhas
	-- Informações adicionais como Gênero, Pais, etc
);

create table filmes(
	id serial primary key,
	nome varchar(40),
	classificacao_indicativa varchar(5),
	genero varchar(15),
	ano_lancamento integer,
	media_estrelas float(5),
	link_imagem varchar(255)
);

create table avaliacoes(
	id serial primary key,
	idUsuario integer,
	idFilme integer,
	comentario varchar(255),
	estrelas integer
);

insert into usuarios (nome, usuario,email,senha) values 
		('Marcelo Correia','marcelo','mcorreia@hotmail.com','12345678'),
		('Amanda Louza','amanda','amouza@hotmail.com','23213131');

insert into filmes (nome,classificacao_indicativa,genero,ano_lancamento,media_estrelas,link_imagem) values 
		('Detetive Pikachu','13+','Aventura',2020,0,'images/coverDetetivePikachu.jpg'),
		('Motoqueiro Fantasma','13+','Ação',2007,0,'images/coverMotoqueiroFantasma.jpg');

insert into avaliacoes (idUsuario, idFilme, comentario, estrelas) values 
		(1,1,'PIKACHU AAAAAAAAAAAAAA',5),
		(2,1,'Filme poggers',5),
		(2,2,'MORTOQUEIRO',5);


select * from usuarios;
select * from filmes;
select * from avaliacoes;

