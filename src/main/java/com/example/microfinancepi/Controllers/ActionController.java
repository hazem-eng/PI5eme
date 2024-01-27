package com.example.microfinancepi.Controllers;
import com.example.microfinancepi.entities.Action;
import com.example.microfinancepi.services.ActionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/FinnancialInstrument")
public class ActionController {


    private ActionService actionService;



    @PostMapping("/ajouterAction")
        Action ajouterAction (@RequestBody Action action){
        return actionService.AjouterAction(action);
    }
    @GetMapping("/AfficherAction")
    List<Action> afficherAction (){
        return actionService.AfiiferAction();
    }

    @DeleteMapping("/delete/{id}")
    void deleteAction(@PathVariable("id") Integer id_action){
        actionService.DeleteAction(id_action);

    }
    @PutMapping("/updateAction")
    Action updateAction(@RequestBody Action action){
        return actionService.UpdateAction(action);
    }

    @GetMapping("/{id}/statistiques")
    public ResponseEntity<Map<String, Object>> calculerStatistiquesOrdres(@PathVariable Integer id) {
        Action action = actionService.findById(id);
        if (action == null) {
            return new ResponseEntity<>(Collections.singletonMap("error", "Action non trouvée"), HttpStatus.NOT_FOUND);
        }

        Map<String, Object> statistiques = actionService.calculerStatistiquesOrdres(action);
        return new ResponseEntity<>(statistiques, HttpStatus.OK);
    }
}
