package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	

	public List<Alumno> findByDni(String dni);
	public List<Alumno> findByNombreLike(String nombre);
	public List<Alumno> findByIdAlumnoLessThan(int id);
	//==> select * from alumno where idAlumno < ?

	public List<Alumno> findByIdAlumnoGreaterThan(int id);
	//==> select * from alumno where idAlumno > ?

	public List<Alumno> findByIdAlumno(int id);
	//==> select * from alumno where idAlumno = ?


	public List<Alumno> findByIdAlumnoLike(int id);
	//==> select * from alumno where idAlumno like ?
}
