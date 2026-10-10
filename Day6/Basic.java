package Day6;

 class Animal {

    void eat()
    {
        System.out.println("This is animal eat Foot");
    }
    
}

 class Cat extends Animal{
    void run()
    {
        System.out.println("This Cat is Runining the Rode");
    }
    
}

 class Basic {

        public static void  main(String[] args)
        {
         Cat myCat = new Cat();
         myCat.eat();
         myCat.run();
        }
}
