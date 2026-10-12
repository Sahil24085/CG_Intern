class Address{
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode){
        this.city=city;
        this.state=state;
        this.pincode=pincode;

    }
    void displayAddress(){
        System.out.println(city+","+state+","+pincode);
    }

    
}

class student{
    String name;
    int rollNumber;
    Address address;

    Student(String name, int rollNumber, Address address){
        this.name=name;
        this.rollNumber=rollNumber;
        this.address=address;
    }
}


class student{
    String name;
    static String collegename='IIT Bombay';
    Student(String name){
        this.name=name;
    }
    void stucol(){
        System.out.println(name+"studied in"+collegename)
    }
    int rollNumber;
    Address address;

    Student(String name, int rollNumber, Address address){
        this.name=name;
        this.rollNumber=rollNumber;
        this.address=address;
    }
}