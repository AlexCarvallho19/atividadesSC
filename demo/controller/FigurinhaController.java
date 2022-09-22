package figurinhas.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import figurinhas.demo.models.Figurinha;
import figurinhas.demo.service.FigurinhaService;

@RestController
@RequestMapping("/figurinhas")
public class FigurinhaController {
	
	@Autowired
	private FigurinhaService figurinhaService;
	
	
		@PostMapping
		public ResponseEntity<Figurinha> saveFigurinha(@RequestBody Figurinha fig) {
			return new ResponseEntity<>(figurinhaService.saveFigurinha(fig),HttpStatus.OK);
		}
		//Busca figurinha pelo Id
		
		@GetMapping("/{id}")
		public List<Figurinha> getFigurinha(@PathVariable Long id) {
			return figurinhaService.listFigurinha(id);
		}
		@GetMapping
		public ResponseEntity<List<Figurinha>> getAllFigurinha() {
			return new ResponseEntity<>(figurinhaService.getFigurinhas(),HttpStatus.OK);
		}
	
		@GetMapping("/{idDono}")
		@ResponseBody
		public ResponseEntity<List<Figurinha>> getAllFigurinhasPorUsuario(@PathVariable("idDono") Long idDono) {
			return new ResponseEntity<>(figurinhaService.getFigurinhasByUser(idDono), HttpStatus.OK);
		}
	
	
	
	
}
