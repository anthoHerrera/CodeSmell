/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmellexamples.LongMethod;

/**
 *
 * @author Anthony777
 */
public class ReplaceTempwithQuerySolution {
    private double tamaño;
    private double precio_regular;
    
    /*Mueva la expresión completa a un método diferente y devuelva el resultado. 
    Consulta el método en lugar de usar una variable. 
    Incorpore el nuevo método en otros métodos, si es necesario.*/
    public double calcularRenta() {
        
        if(renta() > 500) {
            return renta() * 0.80;            
        }else {
            return renta() * 0.90;
        }
    }
    
    private double renta() {
        return tamaño * precio_regular;
    }
}
