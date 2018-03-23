/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.secondaire;

import controller.Interface.ControleurInterface;
import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel_PCB
 */
public class NouvelleCommande implements ControleurInterface, Serializable {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        String page = "newCommServeur";
        return page;
    }
    
}
