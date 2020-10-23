/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.dominio.Correo;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class CorreoDAOMemory implements CorreoDAO{

    private List<Correo> bandeja;

    public CorreoDAOMemory() {
        bandeja = new LinkedList<>();
    }
    
    @Override
    public void add(Correo correo) {
        bandeja.add(correo);
    }

    @Override
    public List<Correo> findByAsunto(String criterio) {
        List<Correo> lst = new LinkedList<>();
        
        for (Correo correo : bandeja) {
            if(correo.getAsunto().contains(criterio.toUpperCase()))
                lst.add(correo);
        }
        
        return lst;
    }
}
