package br.com.dh.IntegradoraVII.services;

import java.util.List;

// IDao é uma interface que vai centralizar os métodos do CRUD. Depois é só criar usuarioService, pacienteService...
public interface IDao<T> {

    T salvar(T t);
    List<T> buscarTodos();
    String excluir(Integer id);


}
