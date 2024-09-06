package com.federicodipresa.GestionePrenotazioni.service;


import com.federicodipresa.GestionePrenotazioni.entities.Postazione;
import com.federicodipresa.GestionePrenotazioni.Repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;

    public List<Postazione> trovaPostazioni(String tipo, String citta) {
        return postazioneRepository.findByTipoAndEdificio_Citta(tipo, citta);
    }
}

