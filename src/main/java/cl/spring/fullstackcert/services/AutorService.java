package cl.spring.fullstackcert.services;

import cl.spring.fullstackcert.model.Autor;

public interface AutorService {

    Autor obtenerAutorPorId(Long id);

    Autor obtenerAutorPorNombre(String nombre);

    Autor guardarAutor(Autor autor);

    Autor actualizarAutor(Autor autor);

    void eliminarAutor(Long id);

}
