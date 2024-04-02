package br.edu.ifrs.minicurso.springsolidapi.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifrs.minicurso.springsolidapi.dto.AlunoDTO;
import br.edu.ifrs.minicurso.springsolidapi.dto.AlunoEnderecoDTO;
import br.edu.ifrs.minicurso.springsolidapi.model.Aluno;
import br.edu.ifrs.minicurso.springsolidapi.repository.AlunoRepository;
import br.edu.ifrs.minicurso.springsolidapi.service.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;

    @Autowired
    private AlunoRepository alunoaAlunoRepository;

    @GetMapping
    public ResponseEntity<List<Aluno>> getAll() {
        List<Aluno> alunos = alunoService.getAll();
        // List<Aluno> alunos = this.alunoaAlunoRepository.findByEmail("string.string@aluno.riogrande.ifrs.edu.br");
        // Aluno aluno = this.alunoaAlunoRepository.findByEmailAddress("ooiioioi");
        
        // List<Aluno> alunos = new ArrayList<>();
        // alunos.add(aluno);
        return ResponseEntity.ok().body(alunos);
    }


    // http://localhost:8080/aluno/teste
    @SuppressWarnings("rawtypes")
    @GetMapping("/teste")
    public ModelAndView index() {
        @SuppressWarnings("unchecked")
        Map<String, Object> template = new HashMap();
        template.put("vetAluno", this.alunoaAlunoRepository.listar());
        // template.put("vetAluno", this.alunoaAlunoRepository.findByEmail("string.string@aluno.riogrande.ifrs.edu.br"));
        return new ModelAndView("teste", template);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getById(@PathVariable int id) {
        Aluno aluno = alunoService.getById(id);
        return ResponseEntity.ok().body(aluno);
    }

    @PostMapping("/saveAluno")
    public ResponseEntity<Aluno> saveAluno(@RequestBody Aluno aluno) {
        Aluno aluno2 = alunoService.save(aluno);
        return ResponseEntity.ok().body(aluno2);
    }

    @PostMapping
    public ResponseEntity<Aluno> save(@RequestBody AlunoDTO alunoDto) {
        Aluno aluno = alunoService.save(alunoDto);
        return ResponseEntity.ok().body(aluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> update(@PathVariable int id, @RequestBody AlunoDTO alunoDto) {
        Aluno aluno = alunoService.update(id, alunoDto);
        return ResponseEntity.ok().body(aluno);
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable int id) {
        boolean deletado = alunoService.delete(id);        
        if (deletado) {
            return new ResponseEntity<Boolean>(deletado, HttpStatus.OK);
        } else {
            return new ResponseEntity<Boolean>(deletado, HttpStatus.NOT_FOUND);
        }
    }
}