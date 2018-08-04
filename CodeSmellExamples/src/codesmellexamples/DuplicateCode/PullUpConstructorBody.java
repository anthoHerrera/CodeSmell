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
public class PullUpConstructorBody {
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
            this.id = id;
            this.nombre = nombre;
            this.grado = grado;
        }
    }
    
    /* Sus subclases tienen constructores con código que es principalmente idéntico.*/
}
