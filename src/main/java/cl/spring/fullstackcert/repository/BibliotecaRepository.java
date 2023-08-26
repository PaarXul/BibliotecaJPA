package cl.spring.fullstackcert.repository;

import cl.spring.fullstackcert.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface BibliotecaRepository  extends JpaRepository<Biblioteca, Long> {
        Biblioteca findByNombre(String nombre);

}
