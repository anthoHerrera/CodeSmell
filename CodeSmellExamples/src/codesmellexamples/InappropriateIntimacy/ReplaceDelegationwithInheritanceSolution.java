/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmellexamples.InappropriateIntimacy;

/**
 *
 * @author Anthony777
 */
public class ReplaceDelegationwithInheritanceSolution {
    public class Persona {
        private String name;

        public String getName() {
            return name;
        }
        
    }
    
    public class Empleado extends Persona {

        public String getName() {
            return super.getName();
        }
    
    }
    
    /* Convierta la clase en un heredero delegado, lo que hace innecesarios los 
    métodos de delegación.*/
    
}
