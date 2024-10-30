package py.edu.facitec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.model.Suscrito;
import py.edu.facitec.repository.SuscritoRepository;



//Aplicar la arquitectura rest
//Representational State Transfer
//Solicitudes sin alm. de estado.
@RestController
@RequestMapping("/api")
//api afecta a todos los metodos de la clase
public class SuscritoController {

	
	//Autowired de suscrito Repository
	@Autowired
	private SuscritoRepository suscritoRepository;
	
	
	@GetMapping("/suscritos")
	public ResponseEntity<List<Suscrito>> getSuscritos(){
		
		List<Suscrito> suscritos=new ArrayList<>();
		//buscar todos
		suscritos = suscritoRepository.findAll();
		
		return new ResponseEntity<List<Suscrito>>(suscritos, HttpStatus.OK);
	}
	
		
	@PostMapping("/suscrito")
	//JSON --> JAVA
	public ResponseEntity<Suscrito> guardarSuscrito(@RequestBody Suscrito suscrito){
		
		suscritoRepository.save(suscrito);
			
		
		//devolver el objeto nuevo creado
		//id nuevo
		return new ResponseEntity<Suscrito>(suscrito, HttpStatus.OK);
		

	}
	
}