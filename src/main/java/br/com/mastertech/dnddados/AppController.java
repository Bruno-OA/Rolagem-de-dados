package br.com.mastertech.dnddados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String mostrarHome(){
        return "<h1>Boas vindas!</h1> <a href=\"iniciar\">iniciar</a>" ;
    }

    @GetMapping("/iniciar")
    public String paginaInicial(){
        return "<h1>Página de produtos</h1>  " +
                "<form action=\"resultado\">" +
                "<input type=\"text\" placeholder=\"Lados\" name=\"lados\">\n" +
                "<input type=\"text\" placeholder=\"Vezes\" name=\"vezes\">\n" +
                "<button>Jogar</button>" +
                "</form>";
    }

    @GetMapping("/resultado")
    public String paginaResultado(){
        return "<h1>O resultado é 100</h1>";
    }
}
