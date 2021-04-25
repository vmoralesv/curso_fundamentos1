public class Principal
{
   public static void main(String[] args) {
     
     Circulo circulo1 = new Circulo();
     circulo1.setRadio(5);
     double peric1 = circulo1.getPerimetro();
     System.out.println("El perímetro del círculo 1 es: " + peric1);
     
     
     Circulo circulo2 = new Circulo();
     circulo2.setRadio(10);
     System.out.println("El perímetro del círculo 2 es: " + circulo2.getPerimetro());
    
     
     Circulo circulo3 = new Circulo();
     circulo3.setRadio(13);
     System.out.println("El perímetro del círculo 3 es: " + circulo3.getPerimetro());
     
     
     Circulo circulo4 = new Circulo();
     circulo4.setRadio(27);
     System.out.println("El perímetro del círculo 4 es: " + circulo4.getPerimetro());
     
     
     System.out.println("Fin");
     
     
    }  
}