/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;



import conrolador.Controlador;
import modelo.Modelo;
import vista.VISTA;

/**
 *
 * @author l03m07
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Modelo mod = new Modelo();
        VISTA view = new VISTA();
        
       Controlador ctrl = new Controlador(view, mod);
       ctrl.Iniciar();
       view.setVisible(true);
       
       
       
        
        
   
        
        
    }
    
}
