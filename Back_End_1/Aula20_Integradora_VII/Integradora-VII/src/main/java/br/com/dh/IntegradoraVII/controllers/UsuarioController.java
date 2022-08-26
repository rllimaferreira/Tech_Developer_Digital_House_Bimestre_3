package br.com.dh.IntegradoraVII.controllers;

import br.com.dh.IntegradoraVII.entities.Usuario;
import br.com.dh.IntegradoraVII.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public Usuario salvar(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "nome") String nome,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "senha") String senha,
            @RequestParam(value = "nivelacesso") Integer nivelacesso)
    {
        return service.salvar(new Usuario(id, nome, email, senha, nivelacesso));
    }

    @GetMapping("/buscar")
    public List<Usuario> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public String excluir(@PathVariable Integer id) {
        return service.excluir(id);
    }

}
