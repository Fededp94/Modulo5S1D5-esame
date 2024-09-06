package com.federicodipresa.GestionePrenotazioni.Controller;

import com.federicodipresa.GestionePrenotazioni.entities.Prenotazione;
import com.federicodipresa.GestionePrenotazioni.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {

    @Autowired
    private PrenotazioneService prenotazioneService;

    @PostMapping
    public Prenotazione creaPrenotazione(@RequestBody Prenotazione prenotazione) {
        return prenotazioneService.salvaPrenotazione(prenotazione);
    }
}
