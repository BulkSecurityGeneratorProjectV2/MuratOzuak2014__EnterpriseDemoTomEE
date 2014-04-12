/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.dao;

import com.bilisimegitim.model.MusteriArama;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class MusteriAramaFacade extends AbstractFacade<MusteriArama> {
    @PersistenceContext(unitName = "coursePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MusteriAramaFacade() {
        super(MusteriArama.class);
    }
    
}
