package ozdemir.salih.deneme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
This is Comment File Another Users...!
*/
@RestController
@RequestMapping("/api")
public class DenemeController {

    @GetMapping()
    public ResponseEntity<String> getDeneme(){
        return ResponseEntity.ok("Deneme Working");
    }

    @PostMapping("/save")
    public ResponseEntity<String> setDeneme(){
        return ResponseEntity.ok("Save Working");
    }
}
