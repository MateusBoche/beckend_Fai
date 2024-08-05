package br.fai.backend.lds.backend.playground.aula_1;

import org.springframework.web.bind.annotation.*;

@RestController // Expoe a classe ao mundo externo
public class SimpleRestController {

    // Spring boot, solicita permissão firewall, para habilitar porta de uso, com o uso dele não precisa se preocupar com o servidor ou porta.


    // Get - obter dados
    @GetMapping("listar") //abri a comunicação do métoo para a clase, se da classe ao mundo externo
    public String get(){
        return "Boa noite =D";
    }

    @PostMapping("enviar")
    public  String post(){
        return "dados enviados";
    }

    @PutMapping("atualizar")
    public String put(){
        return "dados atualizados";
    }

    @DeleteMapping("deletar")
    public  String delete(){
        return "dados deletados";
    }
}
