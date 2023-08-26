package cl.spring.fullstackcert.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "bibliotecas_libros")
public class BibliotecaLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.EAGER)
    private Biblioteca biblioteca;

    @ManyToOne(fetch = FetchType.EAGER)
    private Libro libro;


}
