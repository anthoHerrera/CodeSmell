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
public class ReplaceDelegationwithInheritance {
    public class Persona {
        private String name;

        public String getName() {
            return name;
        }
        
    }
    
    public class Empleado {
        private Persona persona;

        public String getName() {
            return this.persona.getName();
        }
    
    }
    /* Una clase contiene muchos métodos simples que delegan a todos los métodos
    de otra clase. */
    
}
