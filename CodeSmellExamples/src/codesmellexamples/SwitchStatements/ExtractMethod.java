/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmellexamples.SwitchStatements;

/**
 *
 * @author Anthony777
 */
public class ExtractMethod {
    public class Persona {
        private String nombre;
        private String id;
        private String estado_civil;
        private String sueldo;
        private String direccion;

        public void MostrarInfo() {
            System.out.println("Nombre: "  + nombre);
            System.out.println("Identificacion: "  + id);
            System.out.println("Estado civil: "  + estado_civil);
            System.out.println("Domicilio: "  + direccion);
            System.out.println("Salario: "  + sueldo);
        }
        /* Tienes un fragmento de código que se puede agrupar.*/
    }
    
}
