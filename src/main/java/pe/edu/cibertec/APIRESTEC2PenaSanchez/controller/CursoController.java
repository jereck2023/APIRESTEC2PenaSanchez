package pe.edu.cibertec.APIRESTEC2PenaSanchez.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2PenaSanchez.model.bd.Curso;
import pe.edu.cibertec.APIRESTEC2PenaSanchez.service.ICursoService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/curso")
public class CursoController {

    @Autowired
    private ICursoService iCursoService;

    @GetMapping("")
    public List<Curso> listarCursos(){
        return iCursoService.listarCursos();
    }



}
