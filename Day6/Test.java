package Day6;
class shape{

    String color="Red";  
}

// child 1
 class circle extends  shape{
    void  drawcircle()
    {
        System.out.println(color);
    }
}

// child 2 


 class Rectangle extends circle {
    void drawRectangle()
    {
        System.out.println("Draw The Reachnage ");
    }
}


/**
 * Test
 */
public class Test {

    public  static  void  main()
    {
        circle obj1=new circle();
        Rectangle obj2=new Rectangle();
        obj1.drawcircle();
        obj2.drawRectangle();
    }
}
