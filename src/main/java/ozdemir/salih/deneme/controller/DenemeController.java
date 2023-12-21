package ozdemir.salih.deneme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DenemeController {

    @GetMapping()
    public ResponseEntity<String> getDeneme(){
        return ResponseEntity.ok("Deneme Working");
    }
}
