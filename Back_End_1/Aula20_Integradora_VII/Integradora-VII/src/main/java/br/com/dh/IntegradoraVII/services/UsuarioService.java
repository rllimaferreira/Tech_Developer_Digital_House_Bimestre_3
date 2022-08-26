package br.com.dh.IntegradoraVII.services;

import br.com.dh.IntegradoraVII.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioService implements IDao<Usuario> {

    // Como a gente não vai usar Banco de Dados neste exercício, mas vamos simular aqui:
    private static Map<Integer, Usuario> usuarios = new HashMap<>();

    @Override
    public Usuario salvar(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
        return usuario;
    }

    @Override
    public List<Usuario> buscarTodos() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public String excluir(Integer id) {
        usuarios.remove(id);
        return "O registro foi removido.";
    }
}
