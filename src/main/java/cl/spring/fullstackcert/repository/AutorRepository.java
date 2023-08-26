package cl.spring.fullstackcert.repository;


import cl.spring.fullstackcert.model.Autor;
import cl.spring.fullstackcert.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
@EnableJpaRepositories
public interface AutorRepository extends JpaRepository<Autor, Long> {

    Autor findByNombre (String nombre);

    //Set<Autor> findByLibro (Set<Libro> libro); No aplica

}
