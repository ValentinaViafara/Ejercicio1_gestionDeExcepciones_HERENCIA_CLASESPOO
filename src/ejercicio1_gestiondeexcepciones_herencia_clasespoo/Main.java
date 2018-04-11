
package ejercicio1_gestiondeexcepciones_herencia_clasespoo;


public class Main {
    public static void main(String []arg){
        
        
        
        //new Test1();  //Error sin excepciones

       // new Test2();  //Error usando un excepton
       
       
       
       /*  USANDO THROWN, LANZAR EXCEPCIONES
       double result=0;
       Test4 test= new Test4();
       try{
           result= test.areaOfRectangle(-1, 10);
       }catch(IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
        System.out.println(result);
     */   
    
/* USO THROWS Y FOR POR FUERA DEL TRY
    double result=0;
    Test5 test= new Test5();
    for(int i=0; i<10;i++){
    try{
      result= test.areaOgRectangle(-1, 10);
    }catch(CustomException e){
        
        System.out.println(e.getMessage());
    }
    
        System.out.println(result);
    
    }
   
    
    */


/* USO THROWS Y FOR DENTRO DEL TRY
double result=0;
    Test5 test= new Test5();
    
    try{
        for(int i=0; i<10;i++){
      result= test.areaOgRectangle(-1, 10);
        }
    }catch(CustomException e){
        
        System.out.println(e.getMessage());
    }
    
        System.out.println(result);

*/
    
    }
    


}
