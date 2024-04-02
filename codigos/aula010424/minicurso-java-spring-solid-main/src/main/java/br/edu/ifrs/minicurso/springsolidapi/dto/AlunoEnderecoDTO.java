package br.edu.ifrs.minicurso.springsolidapi.dto;

import br.edu.ifrs.minicurso.springsolidapi.model.Endereco;

public record AlunoEnderecoDTO(String nome, String sobrenome, Endereco endereco) {
}