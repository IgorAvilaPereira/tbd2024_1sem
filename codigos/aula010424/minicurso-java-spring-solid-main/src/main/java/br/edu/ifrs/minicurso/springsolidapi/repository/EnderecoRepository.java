package br.edu.ifrs.minicurso.springsolidapi.repository;

import br.edu.ifrs.minicurso.springsolidapi.model.Aluno;
import br.edu.ifrs.minicurso.springsolidapi.model.Endereco;
import jakarta.persistence.NamedQuery;

import java.util.List;

import jakarta.persistence.NamedQuery;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

  




    // https://thorben-janssen.com/spring-data-jpa-named-queries/
    // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
    
    
}
