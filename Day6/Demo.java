package Day6;
// Mutilevel Inharitance
// Class1 
class Device {
    void brand()
    {
        System.out.println("This is Device Class");
    }
}

// Class 2 

class keypardPhone extends Device {
    void phone()
    {
        System.out.println("This is the Noraml Phone: ");
    }
}

// class 3 
class Smartphone extends  keypardPhone{
    void smarthPhone()
    {
        System.out.println("This is the Smart Phone: ");
    }
}

/**
 * Demo
 */
public class Demo {

    public  static  void main(String[] args)
    {
       Smartphone obj=new Smartphone();
        obj.brand();
        obj.phone();
        obj.smarthPhone();

    }
}
