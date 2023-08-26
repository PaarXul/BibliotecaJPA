package cl.spring.fullstackcert.services;

import cl.spring.fullstackcert.model.Libro;

public interface LibroService {

    Libro obtenerLibroPorId(Long id);

    Libro obtenerLibroPorNombre(String nombre);

    Libro guardarLibro(Libro libro);

    Libro actualizarLibro(Libro libro);

    void eliminarLibro(Long id);
}
