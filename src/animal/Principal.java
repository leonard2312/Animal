/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import Ico.fes.anima.Gato;
import Ico.fes.anima.Perro;
import Ico.fes.anima.Animal;

/**
 *
 * @author leona
 */
public class Principal {
    
    public static void main(String[] args) {

        Gato g1 = new Gato("Persa",4);
        Perro p1 = new Perro("pitbull",2);

        System.out.println(g1);
        System.out.println(p1);
    }
}
