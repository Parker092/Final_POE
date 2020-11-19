CREATE TABLE Medico (
  id_medico int NOT NULL PRIMARY KEY,
  nombre varchar(255),
  apellido varchar(255),
  id_especialidad int,
  sueldo decimal,
  telefono varchar(255),
  sexo varchar(255)
);

CREATE TABLE Especialidad (
  id_especialidad int NOT NULL PRIMARY KEY,
  especialidad varchar(255)
);

CREATE TABLE Paciente (
  id_paciente int NOT NULL PRIMARY KEY,
  nombre varchar(255),
  apellido varchar(255),
  telefono varchar(255),
  tipo_sangre varchar(255),
  edad int,
  peso decimal,
  sexo varchar(255),
  estatura decimal,
  fecha_nacimiento date,
  dui varchar(255)
);

CREATE TABLE Medicamento (
  id_medicamento int NOT NULL PRIMARY KEY,
  nombre varchar(255),
  laboratorio varchar(255),
  precio decimal
);

CREATE TABLE Receta (
  id_receta int NOT NULL PRIMARY KEY,
  fecha date,
  hora datetime,
  id_medico int,
  id_paciente int
);

CREATE TABLE Det_Receta (
  id_det_rec int,
  id_receta int,
  id_medicamento int,
  cantidad int
);

CREATE TABLE Consultorio (
  id_consultorio int NOT NULL PRIMARY KEY,
  id_especialidad int,
  id_medico int
);

CREATE TABLE Consulta (
  id_consulta int NOT NULL PRIMARY KEY,
  id_medico int,
  id_paciente int,
  id_consultorio int,
  fecha date,
  hora date,
  diagnostico varchar(255),
  costo decimal
);

CREATE TABLE Cita (
  id_cita int NOT NULL PRIMARY KEY,
  id_medico int,
  id_paciente int,
  id_consultorio int,
  fecha date,
  hora date
);

ALTER TABLE Medico ADD FOREIGN KEY (id_especialidad) REFERENCES Especialidad (id_especialidad);

ALTER TABLE Consultorio ADD FOREIGN KEY (id_especialidad) REFERENCES Especialidad (id_especialidad);

ALTER TABLE Receta ADD FOREIGN KEY (id_medico) REFERENCES Medico (id_medico);

ALTER TABLE Consultorio ADD FOREIGN KEY (id_medico) REFERENCES Medico (id_medico);

ALTER TABLE Consulta ADD FOREIGN KEY (id_medico) REFERENCES Medico (id_medico);

ALTER TABLE Cita ADD FOREIGN KEY (id_medico) REFERENCES Medico (id_medico);

ALTER TABLE Receta ADD FOREIGN KEY (id_paciente) REFERENCES Paciente (id_paciente);

ALTER TABLE Consulta ADD FOREIGN KEY (id_paciente) REFERENCES Paciente (id_paciente);

ALTER TABLE Cita ADD FOREIGN KEY (id_paciente) REFERENCES Paciente (id_paciente);

ALTER TABLE Consulta ADD FOREIGN KEY (id_consultorio) REFERENCES Consultorio (id_consultorio);

ALTER TABLE Cita ADD FOREIGN KEY (id_consultorio) REFERENCES Consultorio (id_consultorio);

ALTER TABLE Det_Receta ADD FOREIGN KEY (id_receta) REFERENCES Receta (id_receta);

ALTER TABLE Det_Receta ADD FOREIGN KEY (id_medicamento) REFERENCES Medicamento (id_medicamento);
