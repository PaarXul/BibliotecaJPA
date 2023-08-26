package cl.spring.fullstackcert.controller;


import cl.spring.fullstackcert.model.Libro;
import cl.spring.fullstackcert.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
@CrossOrigin("*")
public class LibroController {

    private final LibroRepository libroRepository;

    @Autowired
    public LibroController(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }


    @PostMapping("/")
    public ResponseEntity<Libro> guardarLibro(@RequestBody Libro libro) {
        return ResponseEntity.ok(libroRepository.save(libro));
    }

    @PutMapping("/")
    public ResponseEntity<Libro> actualizarLibro(@RequestBody Libro libro) {
        return ResponseEntity.ok(libroRepository.save(libro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarLibro(@PathVariable("id") Long id) {
        libroRepository.deleteById(id);
        return ResponseEntity.ok("Libro eliminado correctamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(libroRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro no encontrado")));
    }

    @GetMapping("/")
    public ResponseEntity<List<Libro>> obtenerLibros() {
        return ResponseEntity.ok(libroRepository.findAll());
    }

}
