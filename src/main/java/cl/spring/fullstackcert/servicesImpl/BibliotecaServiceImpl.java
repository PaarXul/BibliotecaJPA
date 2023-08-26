package cl.spring.fullstackcert.servicesImpl;


import cl.spring.fullstackcert.model.Biblioteca;
import cl.spring.fullstackcert.repository.BibliotecaRepository;
import cl.spring.fullstackcert.services.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaServiceImpl implements BibliotecaService {

    private final BibliotecaRepository bibliotecaRepository;
    @Autowired
    public BibliotecaServiceImpl(BibliotecaRepository bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }

    @Override
    public Biblioteca obtenerBibliotecaPorId(Long id) {
        return bibliotecaRepository.findById(id).orElseThrow(() -> new RuntimeException("Biblioteca no encontrada"));
    }

    @Override
    public Biblioteca obtenerBibliotecaPorNombre(String nombre) {
        return bibliotecaRepository.findByNombre(nombre);
    }

    @Override
    public Biblioteca guardarBiblioteca(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    @Override
    public Biblioteca actualizarBiblioteca(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    @Override
    public void eliminarBiblioteca(Long id) {
        bibliotecaRepository.deleteById(id);
    }
}
