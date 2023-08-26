package cl.spring.fullstackcert.controller;


import cl.spring.fullstackcert.model.Autor;
import cl.spring.fullstackcert.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
@CrossOrigin("*")
public class AutorController {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<Autor>> obtenerAutores() {
        return ResponseEntity.ok(autorRepository.findAll());
    }

    @PostMapping("/")
    public ResponseEntity<Autor> guardarAutor(@RequestBody Autor autor) {

        return ResponseEntity.ok(autorRepository.save(autor));
    }

    @PutMapping("/")
    public ResponseEntity<Autor> actualizarAutor(@RequestBody Autor autor) {

        return ResponseEntity.ok(autorRepository.save(autor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarAutor(@PathVariable("id") Long id) {
        autorRepository.deleteById(id);
        return ResponseEntity.ok("Autor eliminado correctamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> obtenerAutorPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(autorRepository.findById(id).orElseThrow(() -> new RuntimeException("Autor no encontrado")));
    }

}
