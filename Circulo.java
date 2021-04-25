public class Circulo
{

    private double radio;
     
     public Circulo(){
         this.radio=1;
     }
    
    
     public Circulo(double rad){
         this.radio=rad;
     }
    
    
     public void setRadio(double radio){
         this.radio = radio;
     }
    
     public double getRadio(){
         return this.radio;
     }
        
     public double getPerimetro(){
         return 2 * this.radio * Math.PI;
     }
}
