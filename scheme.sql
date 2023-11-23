create database db_clinica;
use db_clinica;
drop database db_clinica;

show tables;

create table especialidades(
	id_especialidad int primary key auto_increment,
    nombre varchar(50) not null
);

create table doctores(
	id_doctor int auto_increment,
    nombre varchar(50),
    apellido varchar(50),
    dni varchar(20),
    telefono varchar(15),
    correo varchar(50),
    especialidad int,
    primary key(id_doctor),
    foreign key(especialidad) references especialidades(id_especialidad)
);

create table pacientes(
	id_paciente int primary key auto_increment,
    nombre varchar(50),
    apellido varchar(50),
    dni varchar(20),
    telefono varchar(15),
    correo varchar(50),
    fecha_ingreso date
);

create table citas(
	id_cita int primary key auto_increment,
    id_paciente int,
    id_doctor int,
    fecha_cita date,
    diagnostico varchar(50),
    foreign key(id_paciente) references pacientes(id_paciente),
    foreign key(id_doctor) references doctores(id_doctor)
);

create table historial_pacientes(
	id_historial int auto_increment primary key,
    id_cita int,
    foreign key(id_cita) references citas(id_cita)
);

create table salas(
	id_sala int primary key auto_increment,
    disponible boolean
);

desc especialidades;