package com.ejemplo1.sample1.Servicio;

import com.ejemplo1.sample1.entidades.Libro;
import com.ejemplo1.sample1.repositorio.LibroRepositorioInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicioImpl implements LibroServicioInterface {

    private LibroRepositorioInterface lr;
    @Autowired
    public LibroServicioImpl(LibroRepositorioInterface lr){
        this.lr=lr;
    }
    @Override
    public List<Libro> getLibro() {
        List<Libro> libros = lr.findAll();
        return libros;
    }
}
