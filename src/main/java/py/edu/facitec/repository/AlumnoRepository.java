package py.edu.facitec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.facitec.entidad.Alumno;
														//Entidad   Tipo de dato del pk
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
