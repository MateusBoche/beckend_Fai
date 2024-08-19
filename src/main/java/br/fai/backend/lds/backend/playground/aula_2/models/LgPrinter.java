package br.fai.backend.lds.backend.playground.aula_2.models;

public class LgPrinter implements SecondPrinter{
    @Override
    public <T> void print(T data) {
        if(data instanceof String){
            System.out.println(data);
        }else if(data instanceof Integer){
            System.out.println("imprimindo int: " + data);
        }else {
            System.out.println("funcionalidade incompleta");
        }
    }

//    @Override
//    public <T> T getData() {
//        return null;
//    }
}
