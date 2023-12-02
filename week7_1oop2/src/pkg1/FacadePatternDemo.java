
package pkg1;


public class FacadePatternDemo {
    public static void main(String[] args) {
        Facade_ShapeMaker shapeMaker = new Facade_ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        
    }
}
