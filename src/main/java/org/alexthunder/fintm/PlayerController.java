package org.alexthunder.fintm;

import org.alexthunder.fintm.team.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @GetMapping("/players")
    public Player[] players(@RequestParam(value = "name", defaultValue = "") String name) {
        // TODO (Alex): use name to return exact player details later.
        Player[] response = new Player[1];
        response[0] = new Player(1, "Reberto Carlos");
        return response;
    }
}
