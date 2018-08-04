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
public class ReplaceInheritancewithDelegationSolution {
    public class Operador {
        private boolean disponible;

        public boolean isDisponible() {
            return disponible;
        }
        
    }
    
    public class administradorOperadores {
        private Operador operador;
        
        public boolean disponible() {
            return this.operador.isDisponible();
        }
    }
    /*Cree un campo y coloque un objeto de superclase, delegue métodos al objeto
    de superclase y elimine la herencia.*/
}
