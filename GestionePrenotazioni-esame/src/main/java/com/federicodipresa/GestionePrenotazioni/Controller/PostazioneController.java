package com.federicodipresa.GestionePrenotazioni.Controller;

import com.federicodipresa.GestionePrenotazioni.entities.Postazione;
import com.federicodipresa.GestionePrenotazioni.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postazioni")
public class PostazioneController {

    @Autowired
    private PostazioneService postazioneService;

    @GetMapping
    public List<Postazione> getPostazioni(@RequestParam String tipo, @RequestParam String citta) {
        return PostazioneService.trovaPostazioni(tipo, citta);
    }
}
