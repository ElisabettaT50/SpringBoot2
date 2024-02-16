package SpringBoot2.SpringBoot2;

import org.springframework.web.bind.annotation.*;

/*
Scrivi una applicazione web Spring Boot che alla endpoint GET
v2/ciao/Lombardia?nome=Giuseppe risponde con un oggetto JSON formato cosi:

{
    "nome": "Giuseppe",
    "provincia": "Lombardia",
    "saluto": "Ciao Giuseppe, com'è il tempo in Lombardia?"
}
 */
@RestController
@RequestMapping("/v2")
public class HomeController {
    @GetMapping("/ciao/{provincia}")
    public User question(
            @PathVariable String provincia,
            @RequestParam String nome) {
        return new User(nome, provincia, "Ciao " + nome + ", com'è il tempo in " + provincia + "?");
    }
    @PostMapping("/casa")
    public String casa(@RequestParam User user) {
        return user.toString();
    }
}
// localhost:8080/v2/ciao/Lombardia?nome=Giuseppe
