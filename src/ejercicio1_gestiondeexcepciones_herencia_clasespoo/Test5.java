/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_gestiondeexcepciones_herencia_clasespoo;

/**
 *
 * @author Estudiante
 */
public class Test5 {

    public Test5() {
    }
    
    
    
    public double areaOgRectangle(double height, double width) throws CustomException{
        if(width<0 || height<0){
            throw new CustomException("Sides must hace positive length.");
        }
        double area;
        area = width*height;
        return area;
        }
        
    }
}
