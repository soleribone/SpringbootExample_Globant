package com.ejemplo1.sample1.repositorio;

import com.ejemplo1.sample1.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorioInterface extends JpaRepository<Libro,Long> {




}
