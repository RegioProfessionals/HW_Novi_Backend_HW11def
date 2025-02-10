package nl.regioprofessionals.hwles11techiteasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tv")
public class TelevisionController {

    List<String> televisionDataBase = new ArrayList<>();

    //    Get-request all tv's
    @GetMapping
    public ResponseEntity<Object> getAllTelevisions(PathVariable long id) {
        return ResponseEntity.ok("television");
    }

    //    Get-request 1 tv
    @GetMapping("/{id}")
    public ResponseEntity<Object> getTelevision(PathVariable long id) {
        return ResponseEntity.ok("television");
    }

    //    Post-request 1 tv (toevoegen)
    @PostMapping("/{id}")
    public ResponseEntity<Object> addTelevision(RequestBody String televisionProductName) {
        String brand = "Philips";
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{brand}").buildAndExpand(brand).toUri();
        return ResponseEntity.created(null).build();
    }

    //  Put-request voor 1 tv (hele item aanpassen, gedeelte aanpassen via PatchMapping)
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateTelevision(PathVariable x, RequestBody String refreshRateTelevision) {
        return ResponseEntity.noContent(null);
    }


    //  DELETE-request voor 1 tv
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTelevision(PathVariable x) {
        return ResponseEntity.noContent(null);
    }
}
