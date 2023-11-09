package com.ejemplo1.sample1.Controladores;

import com.ejemplo1.sample1.Servicio.LibroServicioInterface;
import com.ejemplo1.sample1.entidades.Libro;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@Controller
public class LibroControlador {

    private final LibroServicioInterface ls;
    @Autowired
    public LibroControlador(LibroServicioInterface ls1){

        this.ls = ls1;

    }
    @GetMapping("/libros")
    public ResponseEntity<String> obtenerLibros(){
        List<Libro> libros = ls.getLibro();

        Libro libro = libros.get(0);
        System.out.println(libro.getNombre());
        return new ResponseEntity<>(libro.getNombre(), HttpStatus.OK);
    }


}
