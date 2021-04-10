create database assignment2;

use assignment2;

create table users(
    username varchar(30) not null,
    password varchar(20) not null,
	primary key(username)
);

insert into users values ('tom','password1');
insert into users values ('dick','password2');
insert into users values ('harry','password3');
