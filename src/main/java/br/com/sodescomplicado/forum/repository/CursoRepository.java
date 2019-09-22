package br.com.sodescomplicado.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sodescomplicado.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);
	
	

}
