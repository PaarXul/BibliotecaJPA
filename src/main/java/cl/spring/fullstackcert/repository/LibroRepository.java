package cl.spring.fullstackcert.repository;

import cl.spring.fullstackcert.model.Autor;
import cl.spring.fullstackcert.model.Libro;
import jakarta.persistence.SecondaryTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@EnableJpaRepositories
public interface LibroRepository extends JpaRepository<Libro, Long> {

    Libro findByNombre(String nombre);

    Set<Libro> findByAutor(Autor autor);

}
