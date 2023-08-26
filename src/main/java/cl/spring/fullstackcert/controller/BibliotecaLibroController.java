package cl.spring.fullstackcert.controller;


import cl.spring.fullstackcert.model.BibliotecaLibro;
import cl.spring.fullstackcert.repository.BibliotecaLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bibliotecaLibro")
@CrossOrigin("*")
public class BibliotecaLibroController {

    private final BibliotecaLibroRepository bibliotecaLibroRepository;

    @Autowired
    public BibliotecaLibroController(BibliotecaLibroRepository bibliotecaLibroRepository) {
        this.bibliotecaLibroRepository = bibliotecaLibroRepository;
    }

    @PostMapping("/")
    public ResponseEntity <BibliotecaLibro> guardarBibliotecaLibro( @RequestBody BibliotecaLibro bibliotecaLibro) {
        return ResponseEntity.ok(bibliotecaLibroRepository.save(bibliotecaLibro));
    }

    @PutMapping("/")
    public ResponseEntity <BibliotecaLibro> actualizarBibliotecaLibro( @RequestBody BibliotecaLibro bibliotecaLibro) {
        return ResponseEntity.ok(bibliotecaLibroRepository.save(bibliotecaLibro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <?> eliminarBibliotecaLibro( @PathVariable("id") Long id) {
        bibliotecaLibroRepository.deleteById(id);
        return ResponseEntity.ok("BibliotecaLibro eliminada correctamente");
    }

@GetMapping("/{id}")
    public ResponseEntity<BibliotecaLibro> obtenerBibliotecaPorId ( @PathVariable ("id") Long id ){
        return ResponseEntity.ok(bibliotecaLibroRepository.findById(id).orElseThrow(() -> new RuntimeException("BibliotecaLibro no encontrada")));
}



}
