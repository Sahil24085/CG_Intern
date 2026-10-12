abstract class shape{
private String colour;

 void setColor(String colour)
 {
    this.colour=colour;
 }

 //get Colour

void getColour()
{
    return colour;
}

abstract double calculteArea();

}

class circle extends colour{
    double radius;
    circle(double radius)
    {
        this.radius=radius;
    }

    @override
    double calculteArea()
    {
        return (3.14)*radius*radius;
    }

}

class Recatangle extends colour{
    double length;
    double breath;
    Recatangle(double length , double breath)
    {
        this.length=length;
        this.breath=breath;
    }
    @override
    void calculteArea()
    {
        return length*breath;
    }
}




