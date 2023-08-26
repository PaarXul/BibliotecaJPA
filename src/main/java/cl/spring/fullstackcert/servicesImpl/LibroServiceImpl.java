package cl.spring.fullstackcert.servicesImpl;

import cl.spring.fullstackcert.model.Libro;
import cl.spring.fullstackcert.repository.LibroRepository;
import cl.spring.fullstackcert.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl  implements LibroService {

    private final LibroRepository libroRepository;
    @Autowired
    public LibroServiceImpl(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }


    @Override
    public Libro obtenerLibroPorId(Long id) {
        return libroRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }

    @Override
    public Libro obtenerLibroPorNombre(String nombre) {
        return libroRepository.findByNombre(nombre);
    }

    @Override
    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro actualizarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
