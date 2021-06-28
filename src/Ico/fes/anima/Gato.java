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
public class Gato extends Animal{
    
    private String raza;

    public Gato() {
    }

    public Gato(String raza) {
        this.raza = raza;
    }
    
    public Gato(String raza,int numeroPatas) {
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
        return super.toString() + "Gato{" + "raza=" + raza + '}';
    }
    
    
    @Override
    public void hablar(){
        System.out.println("Maullar");
        super.hablar();
    }
    
}
