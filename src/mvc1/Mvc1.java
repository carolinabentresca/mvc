/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1;

import Controlador.usuarioController;
import Modelo.usuario;
import Modelo.usuarioDao;
import Vista.usuarioFrm;

/**
 *
 * @author EXO
 */
public class Mvc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       usuario model = new usuario();
       usuarioDao modelDao = new usuarioDao();
       usuarioFrm view = new usuarioFrm();
       usuarioController ctrl = new usuarioController(view,model,modelDao);
       ctrl.iniciar();
       view.setVisible(true);
    }
    
}
