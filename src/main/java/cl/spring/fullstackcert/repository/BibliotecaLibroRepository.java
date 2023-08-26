package cl.spring.fullstackcert.repository;

import cl.spring.fullstackcert.model.Biblioteca;
import cl.spring.fullstackcert.model.BibliotecaLibro;
import cl.spring.fullstackcert.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
@EnableJpaRepositories
public interface BibliotecaLibroRepository extends JpaRepository<BibliotecaLibro, Long> {

    List<BibliotecaLibro> findByLibro (Libro libro);

    List<BibliotecaLibro> findByBiblioteca (Biblioteca biblioteca);

}
