/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmellexamples.RefusedBequest;

/**
 *
 * @author Anthony777
 */
public class ReplaceInheritancewithDelegation {
    public class Operador {
        private boolean disponible;

        public boolean isDisponible() {
            return disponible;
        }
        
    }
    
    public class administradorOperadores {
        public boolean disponible() {
            return true;
        }
    }
    /* Tienes una subclase que usa solo una parte de los métodos de su superclase 
    (o no es posible heredar datos de superclase).*/
}
