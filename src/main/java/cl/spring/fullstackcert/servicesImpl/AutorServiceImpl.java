package cl.spring.fullstackcert.servicesImpl;


import cl.spring.fullstackcert.model.Autor;
import cl.spring.fullstackcert.repository.AutorRepository;
import cl.spring.fullstackcert.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl implements AutorService {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorServiceImpl(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }


    @Override
    public Autor obtenerAutorPorId(Long id) {
        return autorRepository.findById(id).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
    }

    @Override
    public Autor obtenerAutorPorNombre(String nombre) {
        return autorRepository.findByNombre(nombre);
    }

    @Override
    public Autor guardarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public Autor actualizarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public void eliminarAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
