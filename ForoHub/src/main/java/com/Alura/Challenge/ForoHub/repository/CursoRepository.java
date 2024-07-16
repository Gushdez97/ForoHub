package com.Alura.Challenge.ForoHub.repository;

import com.Alura.Challenge.ForoHub.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
