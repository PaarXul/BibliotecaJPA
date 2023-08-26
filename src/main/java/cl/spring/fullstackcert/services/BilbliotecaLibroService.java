package cl.spring.fullstackcert.services;

import cl.spring.fullstackcert.model.BibliotecaLibro;

public interface BilbliotecaLibroService {

    BibliotecaLibro obtenerBibliotecaLibroPorId(Long id);

    BibliotecaLibro obtenerBibliotecaLibroPorNombre(String nombre);

    BibliotecaLibro guardarBibliotecaLibro(BibliotecaLibro bibliotecaLibro);

    BibliotecaLibro actualizarBibliotecaLibro(BibliotecaLibro bibliotecaLibro);

    void eliminarBibliotecaLibro(Long id);

}
