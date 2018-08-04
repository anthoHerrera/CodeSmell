/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmellexamples.DuplicateCode;

/**
 *
 * @author Anthony777
 */
public class PullUpConstructorBodySolution {
    public class Empleado {
        String nombre;
        String id;

        public Empleado(String nombre, String id) {
            this.nombre = nombre;
            this.id = id;
        }
        
    }
    
    public class Gerente extends Empleado{
        private String grado;

        public Gerente(String nombre, String id, String grado) {
            super(nombre, id);
            this.grado = grado;
        }

    }

    /*Cree un constructor de superclase y mueva el código que es el mismo en las
    subclases a él. Llame al constructor de la superclase en los constructores 
    de la subclase. */ 

}
