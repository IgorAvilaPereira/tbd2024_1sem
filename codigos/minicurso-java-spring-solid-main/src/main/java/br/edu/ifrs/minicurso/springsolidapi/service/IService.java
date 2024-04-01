package br.edu.ifrs.minicurso.springsolidapi.service;

import java.util.List;

public interface IService<T, DTO> {
    List<T> getAll();

    T getById(int id);

    T save(DTO dto);

    T update(int id, DTO dto);

    boolean delete(int id);
}
