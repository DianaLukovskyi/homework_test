package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    @Test

    public void totalSquare_test(){

        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(8.0,12.0);

        Shape[] shapes = {circle,rectangle};

        ShapeCalculator shapeCalculator = new ShapeCalculator();


        assertEquals(174.5,shapeCalculator.totalSquare(shapes));




    }



}