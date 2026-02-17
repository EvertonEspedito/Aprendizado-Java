package com.everton.first.controller;

import com.everton.first.model.Usuario;
import com.everton.first.security.JwtUtil;
import com.everton.first.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> request){
        // Make sure you get "password" from the request map, not a hardcoded string
        Usuario usuario = usuarioService.registrarUsuario(
                request.get("username"),
                request.get("password")
        );
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request){
        Optional<Usuario> usuarioOpt = usuarioService.buscarPorUsername(request.get("username"));

        // Changed .ifPresent() to .isPresent()
        if (usuarioOpt.isPresent() && usuarioOpt.get().getPassword().equals(request.get("password"))){
            String token = JwtUtil.generateToken(usuarioOpt.get().getUsername());
            return ResponseEntity.ok(Map.of("token", token));
        }

        return ResponseEntity.status(401).body("Credenciais Inválidas");
    }
}
