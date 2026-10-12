class StaticDemo{
    public static void main(String[] args)
    {
        System.out.println("Current Total UserCount: " + TotalUser);

        UserAccount obj=new UserAccount("Shail");
        UserAccount obj1=new UserAccount("Ujjval");
        UserAccount obj2=new UserAccount("Yash");

        System.out.println("UserName one is : " +  obj.getUserName());
        System.out.println("UserName Two  is : " +  obj1.getUserName());
        System.out.println("UserName Three is : " +  obj2.getUserName());

        System.out.println("After the Incriment User Count : " + TotalUser);

        

    }
}