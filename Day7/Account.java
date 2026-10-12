class UserAccount {
    private String UserName;
    private static int TotalUser = 0;

    UserAccount(String UserName) {
        this.UserName = UserName;
        TotalUser++;
    }

    // Get Username
    public String getUserName() {
        return UserName;
    }

    // Get Total User Count
    public static int getTotalUser() {
        return TotalUser;
    }
}

class Account {
    public static void main(String[] args) {

        System.out.println("Current Total UserCount: " + UserAccount.getTotalUser());

        UserAccount obj = new UserAccount("Shail");
        UserAccount obj1 = new UserAccount("Ujjval");
        UserAccount obj2 = new UserAccount("Yash");

        System.out.println("UserName one is: " + obj.getUserName());
        System.out.println("UserName Two is: " + obj1.getUserName());
        System.out.println("UserName Three is: " + obj2.getUserName());

        System.out.println("After the Increment User Count: " + UserAccount.getTotalUser());
    }
}