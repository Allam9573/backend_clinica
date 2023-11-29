create database clinica;
use clinica;

CREATE TABLE pacientes (
    paciente_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    fecha_nacimiento DATE,
    direccion VARCHAR(100),
    telefono VARCHAR(15)
);

-- Creación de la tabla Especialidades
CREATE TABLE especialidades (
    especialidad_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50)
);

-- Creación de la tabla Salas
CREATE TABLE salas (
    sala_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    descripcion VARCHAR(200)
);

-- Creación de la tabla Doctores
CREATE TABLE doctores (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    especialidad_id INT,
    FOREIGN KEY (especialidad_id) REFERENCES especialidades(especialidad_id)
);



-- Creación de la tabla Citas
CREATE TABLE citas (
    cita_id INT AUTO_INCREMENT PRIMARY KEY,
    paciente_id INT,
    doctor_id INT,
    sala_id INT,
    fecha_cita DATE,
    hora_cita TIME,
    FOREIGN KEY (paciente_id) REFERENCES pacientes(paciente_id),
    FOREIGN KEY (doctor_id) REFERENCES doctores(doctor_id),
    FOREIGN KEY (sala_id) REFERENCES salas(sala_id)
);

-- Creación de la tabla HistorialCitas
CREATE TABLE historial_citas (
    historial_id INT PRIMARY KEY,
    cita_id INT,
    paciente_id INT,
    diagnostico VARCHAR(200),
    tratamiento VARCHAR(200),
    fecha_historial DATE,
    FOREIGN KEY (cita_id) REFERENCES citas(cita_id),
    FOREIGN KEY (paciente_id) REFERENCES pacientes(paciente_id)
);



-- Creación de la tabla HorarioCitas
CREATE TABLE horario_citas (
    horario_id INT AUTO_INCREMENT PRIMARY KEY,
    doctor_id INT,
    dia_semana VARCHAR(20),
    hora_inicio TIME,
    hora_fin TIME,
    FOREIGN KEY (doctor_id) REFERENCES doctores(doctor_id)
);