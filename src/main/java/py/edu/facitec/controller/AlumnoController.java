package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import py.edu.facitec.entidad.Alumno;
import py.edu.facitec.repository.AlumnoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AlumnoController {

	
	//Inyeccion de dependencias
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	
	@RequestMapping("/form")
	public String metodo() {
		
		
			//carpeta html
		return "vista/alumno/formulario";
	}
	
	@RequestMapping(value="/registrar", method = RequestMethod.POST)
	
	
					// nombre y correo
					//recibe los datos del formulario
	
	public ModelAndView registrar(Alumno alumno) {
		
		
		//registrar un alumno
		//jpa hibernate crea el sql
		
		alumnoRepository.save(alumno);
		
		System.out.println("Registrado con exito: "+alumno);
		
		
		return new ModelAndView("redirect:form");
		
	}
	
}
