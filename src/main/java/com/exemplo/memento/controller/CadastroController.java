package com.exemplo.memento.controller;

import com.exemplo.memento.memento.*;
import com.exemplo.memento.model.Cadastro;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cadastro")
@CrossOrigin
public class CadastroController {

    private final CadastroOriginator originator = new CadastroOriginator();
    private final CadastroCareTaker caretaker = new CadastroCareTaker();

    @PostMapping("/enviar")
    public Cadastro enviar(@RequestBody Cadastro novoCadastro) {
        if (originator.getEstado() != null) {
            caretaker.salvarMemento(originator.salvarParaMemento());
        }
        originator.setEstado(novoCadastro);
        return novoCadastro;
    }

    @GetMapping("/restaurar")
    public Cadastro restaurar() {
        CadastroMemento ultimo = caretaker.getUltimoMemento();
        if (ultimo != null) {
            originator.restaurarDeMemento(ultimo);
        }
        return originator.getEstado();
    }
}

