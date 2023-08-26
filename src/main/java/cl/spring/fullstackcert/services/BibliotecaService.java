package cl.spring.fullstackcert.services;

import cl.spring.fullstackcert.model.Biblioteca;

public interface BibliotecaService {


    Biblioteca obtenerBibliotecaPorId(Long id);

    Biblioteca obtenerBibliotecaPorNombre(String nombre);

    Biblioteca guardarBiblioteca(Biblioteca biblioteca);

    Biblioteca actualizarBiblioteca(Biblioteca biblioteca);

    void eliminarBiblioteca(Long id);

}
