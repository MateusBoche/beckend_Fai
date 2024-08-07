package br.fai.backend.lds.backend.playground.aula_1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController // Expoe a classe ao mundo externo
public class SimpleRestController {

    // Spring boot, solicita permissão firewall, para habilitar porta de uso, com o uso dele não precisa se preocupar com o servidor ou porta.


    // Get - obter dados
    @GetMapping("listar") //abri a comunicação do método para a clase, se da classe ao mundo externo
    public ResponseEntity<UserPlayground1> get(){

        UserPlayground1 user = new UserPlayground1();

        user.setId(10);
        user.setEmail("email.email.com");
        user.setName("First name");


        return ResponseEntity.ok().body(user);
    }

    @PostMapping("enviar")
    public ResponseEntity<String > post(@RequestBody UserPlayground1 user){
        System.out.println("id:" + user.getId());
        System.out.println("name:" + user.getName());
        System.out.println("email:" + user.getEmail());


        final URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(user.getId()).toUri();


            return ResponseEntity.created(uri).build();
    }

    @PutMapping("atualizar/{id}")
    public ResponseEntity<String> put(@PathVariable int id, @RequestBody UserPlayground1 user){
        System.out.println("id vindo da url: " + id);
        System.out.println("id para atualizar:" + user.getId());
        System.out.println("name para atualizar:" + user.getName());
        System.out.println("email para atualizar:" + user.getEmail());


        return ResponseEntity.ok().body("dados atualizados");
    }

    @DeleteMapping("deletar/{id}")
    public  ResponseEntity<String> delete(@PathVariable int id){
        System.out.println("id a ser removido: " + id);

        return ResponseEntity.noContent().build();
    }
}
