package pe.edu.cibertec.APIRESTEC2PenaSanchez.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2PenaSanchez.model.bd.Curso;
import pe.edu.cibertec.APIRESTEC2PenaSanchez.repository.CursoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class CursoService implements ICursoService{

    private CursoRepository cursoRepository;
    @Override
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }
}
