/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber.poo;

/**
 *
 * @author Usuario
 */
public class Suma {
    private double sumando1,sumando2;

    Suma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSumando1() {
        return sumando1;
    }

    public void setSumando1(double sumando1) {
        this.sumando1 = sumando1;
    }

    public double getSumando2() {
        return sumando2;
    }

    public void setSumando2(double sumando2) {
        this.sumando2 = sumando2;
    }

    public Suma(double sumando1, double sumando2) {
        this.sumando1 = sumando1;
        this.sumando2 = sumando2;
    }

    public double suma(){
        return sumando1+sumando2;
    }

       
}
