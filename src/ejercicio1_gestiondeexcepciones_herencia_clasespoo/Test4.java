
package ejercicio1_gestiondeexcepciones_herencia_clasespoo;


public class Test4 {
    
    
    public double areaOfRectangle(double height, double width){
        
        if(width<0 || height<0){
            
            throw new IllegalArgumentException(" Sides must have positive length");
     }
       double area;
       area= width* height;
       return area;
        
    }
}
