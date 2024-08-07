package br.fai.backend.lds.backend.playground.aula_1.dao;

import br.fai.backend.lds.backend.playground.aula_1.UserPlayground1;

public class PlaygroundDao {
    public UserPlayground1 fetchData(){
        UserPlayground1 user = new UserPlayground1();
        user.setId(10);
        user.setEmail("email.email.com");
        user.setName("First name");
        return user;

    }
}
