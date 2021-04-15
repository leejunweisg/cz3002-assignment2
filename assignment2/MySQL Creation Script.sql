create database assignment2;

use assignment2;

create table accounts(
    username varchar(30) not null,
    password varchar(20) not null,
	primary key(username)
);

insert into accounts values ('tom','password1');
insert into accounts values ('dick','password2');
insert into accounts values ('harry','password3');
