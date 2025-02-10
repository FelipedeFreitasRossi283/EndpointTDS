package com.example.demo;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/hello")
public class FirstEndPoint {

    // Lista para simular um banco de dados em memória
    private Map<Long, Usuario> usuarios = new HashMap<>();
    private long contador = 1;

    // GET: Obter um usuário pelo ID
    @GetMapping("/{id}")
    public Usuario obterUsuario(@PathVariable Long id) {
        return usuarios.get(id);
    }

    // POST: Criar um novo usuário
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        usuario.setId(contador++);
        usuarios.put(usuario.getId(), usuario);
        return usuario;
    }

    // PUT: Atualizar um usuário
    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        if (usuarios.containsKey(id)) {
            usuario.setId(id); // Garantir que o ID não seja alterado
            usuarios.put(id, usuario);
            return usuario;
        } else {
            return null; // Usuário não encontrado
        }
    }

    // DELETE: Excluir um usuário
    @DeleteMapping("/{id}")
    public String excluirUsuario(@PathVariable Long id) {
        if (usuarios.remove(id) != null) {
            return "Usuário excluído com sucesso!";
        } else {
            return "Usuário não encontrado!";
        }
    }
}
