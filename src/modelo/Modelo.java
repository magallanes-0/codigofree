/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author l03m07
 */
public class Modelo {
    private int num1;
    private int num2;
    private int resu;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResu() {
        return resu;
    }

    public void setResu(int resu) {
        this.resu = resu;
    }
    
    public int Multiplicar()
    {
        this.resu=this.num1*this.num2;
        return this.resu;
    }
}
