package cl.spring.fullstackcert.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String isbn;
    private Integer anio;
    private Integer paginas;

    @ManyToOne(fetch = FetchType.EAGER)
    private Autor autor;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "libro")
    @JsonIgnore
    private Set<BibliotecaLibro> bibliotecasLibros = new HashSet<>();


}
