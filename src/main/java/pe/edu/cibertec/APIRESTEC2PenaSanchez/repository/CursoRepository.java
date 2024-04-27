package pe.edu.cibertec.APIRESTEC2PenaSanchez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.APIRESTEC2PenaSanchez.model.bd.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
