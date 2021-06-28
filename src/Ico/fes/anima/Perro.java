package Ico.fes.anima;

import Ico.fes.anima.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author leona
 */
public class Perro extends Animal{
    
    private String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }
    
    public Perro(String raza,int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
       return super.toString() + "Perro{" + "raza=" + raza + '}';
    }
    
    @Override
    public void hablar(){
        System.out.println("Ladrar");
        super.hablar();
    }
}
