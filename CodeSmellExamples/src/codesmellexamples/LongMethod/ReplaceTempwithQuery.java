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
public class ReplaceTempwithQuery {
    private double tamaño;
    private double precio_regular;
    
    /*Coloca el resultado de una expresión en una variable local para 
    su uso posterior en su código.*/
    public double calcularRenta() {
        double renta = tamaño * precio_regular;
        if(renta > 500) {
            return renta * 0.80;            
        }else {
            return renta * 0.90;
        }
    }
    
}
