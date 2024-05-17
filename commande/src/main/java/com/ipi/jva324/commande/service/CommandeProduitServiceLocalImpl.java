package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CommandeProduitServiceLocalImpl implements CommandeProduitService {

    @Autowired
    public ProduitService produitService;

    @Override
    public ProduitEnStock getProduit(long produitId) {
        return produitService.getProduit(produitId);
    }
}