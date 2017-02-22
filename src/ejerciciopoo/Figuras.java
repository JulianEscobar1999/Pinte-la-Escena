package ejerciciopoo;
import ch.aplu.turtle.Turtle;

public class Figuras {
    public Turtle tortuga;
    
    public Figuras(){
      tortuga = new Turtle();
    }
    public void triangulo(int tam){
      tortuga.setY(100);
      tortuga.setX(-100);
      tortuga.speed(700);
      tortuga.left(30);
      for(int i=0; i<3;i++){
          tortuga.fd(tam);
          tortuga.left(120);
          
      }
    }
    public void cuadrado(int tam){
       
       tortuga.setY(10);
       tortuga.setX(70);
       tortuga.right(30);
       for(int i=0; i<4;i++){
       tortuga.fd(tam);
       tortuga.left(90);
    }
    }
    public void pentagono(int tam){
       tortuga.setY(-70);
       tortuga.setX(-10);
       for(int i=0; i<5;i++){
       tortuga.fd(tam);
       tortuga.left(72);
    } 
    }
}
