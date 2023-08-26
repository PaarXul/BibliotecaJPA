package cl.spring.fullstackcert.controller;

import cl.spring.fullstackcert.model.Biblioteca;
import cl.spring.fullstackcert.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca")
@CrossOrigin("*")
public class BibliotecaController {

    private final BibliotecaRepository bibliotecaRepository;

    @Autowired
    public BibliotecaController(BibliotecaRepository bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<Biblioteca>> obtenerBibliotecas() {
        return ResponseEntity.ok(bibliotecaRepository.findAll());
    }

    @PostMapping("/")
    public ResponseEntity<Biblioteca> guardarBiblioteca(@RequestBody Biblioteca biblioteca) {
        return ResponseEntity.ok(bibliotecaRepository.save(biblioteca));
    }

    @PutMapping("/")
    public ResponseEntity<Biblioteca> actualizarBiblioteca(@RequestBody Biblioteca biblioteca) {
        return ResponseEntity.ok(bibliotecaRepository.save(biblioteca));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarBiblioteca(@PathVariable("id") Long id) {
        return ResponseEntity.ok("Biblioteca eliminada correctamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Biblioteca> obtenerBibliotecaPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(bibliotecaRepository.findById(id).orElseThrow(() -> new RuntimeException("Biblioteca no encontrada")));
    }


}
