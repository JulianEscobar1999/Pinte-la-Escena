package ejerciciopoo;
import ch.aplu.turtle.Turtle;
public class POO {
   private  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void dibujar(){
      joe.forward(60);
   } 
    public static void main(String[] args) {
       Figuras tri = new Figuras();
       tri.triangulo(60);
       tri.cuadrado(50);
       tri.pentagono(70);

    }
    
}
