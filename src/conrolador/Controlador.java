/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conrolador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.VISTA;

/**
 *
 * @author l03m07
 */
public class Controlador implements ActionListener {
   
    private VISTA view; //FRAME
    private Modelo model; //CLASE
    
    public Controlador(VISTA view,Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnmulti.addActionListener(this);
        
       
    }
   
    public void Iniciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
        
    }
    
    public void actionPerformed (ActionEvent e){
        model.setNum1(Integer.parseInt(view.txt1.getText()));
        model.setNum2(Integer.parseInt(view.txt2.getText()));
        model.Multiplicar();
        
        view.txtresu.setText(String.valueOf(model.getResu()));
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        model.setNum1(Integer.parseInt(view.txt1.getText()));
//        model.setNum2(Integer.parseInt(view.txt2.getText()));
//        model.Multiplicar();
//        
//        view.txtresu.setText(String.valueOf(model.getResu()));
//    }
}
