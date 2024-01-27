package com.example.microfinancepi.Controllers;
import com.example.microfinancepi.entities.Ordre;
import com.example.microfinancepi.services.OrdreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/Ordre")
public class OrdreController {
    private OrdreService ordreService;

    @PostMapping("/ajouterOrdre")
    Ordre ajouterOrdre(@RequestBody Ordre ordre){
        return ordreService.AjouterOrdre(ordre);
    }


    @DeleteMapping("/deletOrdre/{id_ordre}")
    void DeleteOrdre(@PathVariable ("id_ordre") Integer id_ordre){
        ordreService.DeleteOrdre(id_ordre);
    }

    @PutMapping("/ModifierOrdre")
    Ordre UpdateOrdre(@RequestBody Ordre ordre){
        return ordreService.UpdateOrdre(ordre);
    }

    @PutMapping("/assignerOrderToAction/{id_ordre}/{id_action}")
     public Ordre Assigner(@PathVariable("id_ordre") Integer id_ordre,@PathVariable("id_action") Integer id_action){
        return ordreService.AffecterOrdreToRequest(id_ordre,id_action) ;
    }


}
