package com.example.microfinancepi.services;

import com.example.microfinancepi.entities.Ordre;

import java.util.List;

public interface OrdreService  {

    Ordre AjouterOrdre(Ordre ordre);

    void DeleteOrdre(Integer id_ordre);
    Ordre UpdateOrdre (Ordre ordre);
    Ordre AffecterOrdreToRequest(Integer id_ordre,Integer id_action);
}
