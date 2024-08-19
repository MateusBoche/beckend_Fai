package br.fai.backend.lds.backend.playground.aula_2;

import br.fai.backend.lds.backend.playground.aula_2.models.LgPrinter;
import br.fai.backend.lds.backend.playground.aula_2.models.Printer;
import br.fai.backend.lds.backend.playground.aula_2.models.SamsungPrinter;
import br.fai.backend.lds.backend.playground.aula_2.models.SecondPrinter;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class GenericsRestController {

    @GetMapping("/testar")
    public ResponseEntity<String> test(){


        Printer<String> stringPrinter= new SamsungPrinter();
//        printer.printString("lalala");
//        printer.printInt(111);
        stringPrinter.print("lalala");

        SecondPrinter secondPrinter = new LgPrinter();
        secondPrinter.print("texto");
        secondPrinter.print(2);
        secondPrinter.print(true);
        secondPrinter.print(44.55);



        return ResponseEntity.ok().body("teste de generics");
    }
}
