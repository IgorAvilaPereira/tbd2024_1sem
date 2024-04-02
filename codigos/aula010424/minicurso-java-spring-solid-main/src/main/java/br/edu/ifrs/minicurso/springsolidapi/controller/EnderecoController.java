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
import br.edu.ifrs.minicurso.springsolidapi.model.Aluno;
import br.edu.ifrs.minicurso.springsolidapi.model.Endereco;
import br.edu.ifrs.minicurso.springsolidapi.repository.AlunoRepository;
import br.edu.ifrs.minicurso.springsolidapi.repository.EnderecoRepository;
import br.edu.ifrs.minicurso.springsolidapi.service.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    // @Autowired
    // private AlunoService alunoService;

    @Autowired
    private EnderecoRepository enderecoAlunoRepository;

   
    @PostMapping
    public ResponseEntity<Endereco> save(@RequestBody Endereco endereco) {
        Endereco endereco2 = this.enderecoAlunoRepository.save(endereco);
        return ResponseEntity.ok().body(endereco2);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<Aluno> update(@PathVariable int id, @RequestBody AlunoDTO alunoDto) {
    //     Aluno aluno = alunoService.update(id, alunoDto);
    //     return ResponseEntity.ok().body(aluno);
        
    // }
    
    // @DeleteMapping("/{id}")
    // public ResponseEntity<Boolean> delete(@PathVariable int id) {
    //     boolean deletado = alunoService.delete(id);        
    //     if (deletado) {
    //         return new ResponseEntity<Boolean>(deletado, HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<Boolean>(deletado, HttpStatus.NOT_FOUND);
    //     }
    // }
}