/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temperatura;

import temperatura.TemperaturaErradaExcepcion.* ;

public class ConversorTemperaturas {

    public ConversorTemperaturas() {
        }

    private final float temperatura = 80;
    
    public float centigradosAFharenheit(float temperatura){
        
        float x =  9 / 5 * temperatura + 32.4F;
        return x;
    }
            
    
}
