package com.federicodipresa.GestionePrenotazioni.service;

import com.federicodipresa.GestionePrenotazioni.entities.Prenotazione;
import com.federicodipresa.GestionePrenotazioni.Repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione salvaPrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }
}
