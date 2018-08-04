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
public class ExtractMethodSolution {
    public class Persona {
        private String nombre;
        private String id;
        private String estado_civil;
        private String sueldo;
        private String direccion;

        public void MostrarInfo() {
            infoPersonal();
            System.out.println("Salario: "  + sueldo);
        }
        
        public void infoPersonal() {
             System.out.println("Nombre: "  + nombre);
            System.out.println("Identificacion: "  + id);
            System.out.println("Estado civil: "  + estado_civil);
            System.out.println("Domicilio: "  + direccion);
        }
        /*Mueva este código a un nuevo método (o función) diferente y reemplace 
        el código anterior con una llamada al método.*/
    }
}
