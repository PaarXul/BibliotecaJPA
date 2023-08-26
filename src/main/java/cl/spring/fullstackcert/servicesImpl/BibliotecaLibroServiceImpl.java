package cl.spring.fullstackcert.servicesImpl;


import cl.spring.fullstackcert.model.Biblioteca;
import cl.spring.fullstackcert.repository.BibliotecaRepository;
import cl.spring.fullstackcert.services.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BibliotecaLibroServiceImpl implements BibliotecaService {


    private final BibliotecaRepository bibliotecaRepository;
    @Autowired
    public BibliotecaLibroServiceImpl(BibliotecaRepository bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Biblioteca obtenerBibliotecaPorId(Long id) {
        return bibliotecaRepository.findById(id).orElseThrow(() -> new RuntimeException("Biblioteca no encontrada"));
    }

    @Override
    @Transactional(readOnly = true)
    public Biblioteca obtenerBibliotecaPorNombre(String nombre) {
        return bibliotecaRepository.findByNombre(nombre);
    }

    @Override
    @Transactional
    public Biblioteca guardarBiblioteca(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    @Override
    @Transactional
    public Biblioteca actualizarBiblioteca(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    @Override
    @Transactional
    public void eliminarBiblioteca(Long id) {
        bibliotecaRepository.deleteById(id);
    }
}
