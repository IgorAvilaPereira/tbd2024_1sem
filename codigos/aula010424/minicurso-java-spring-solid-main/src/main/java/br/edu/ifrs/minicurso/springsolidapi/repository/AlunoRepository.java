package br.edu.ifrs.minicurso.springsolidapi.repository;

import br.edu.ifrs.minicurso.springsolidapi.model.Aluno;
import jakarta.persistence.NamedQuery;

import java.util.List;

import jakarta.persistence.NamedQuery;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    @Query("SELECT CASE WHEN COUNT(a) > 0 THEN true ELSE false END FROM Aluno a WHERE a.matricula = :matricula")
    boolean existsByMatricula(@Param("matricula") String matricula);


    List<Aluno> findByEmail(String emailAddress);



    @Query("select u from Aluno u where u.email = ?1")
    Aluno findByEmailAddress(String emailAddress);

    @Query("SELECT a FROM Aluno a")
    List<Aluno> listar();



    // https://thorben-janssen.com/spring-data-jpa-named-queries/
    // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
    
    
}
