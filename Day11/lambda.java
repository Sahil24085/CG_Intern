
import java.lang.reflect.Array;
import java.util.ArrayList;


// import java.util.Random;

//         Function<String,Integer> getLength=name -> name.length();
//         System.out.println(getLength.apply("Java"));
//         System.out.println(getLength.apply("Johnj"));
//     }
// }


// class lambda{
//     public static void main(String[] args) {
//         Function<Integer,Integer> square=n -> n*n;
//         System.out.println(square.apply(5));
//         System.out.println(square.apply(8));
//    }
// }



// class lambda{
//     public static void main(String[] args) {
//         Consumer<String> smsNotifier=mobNo -> {
//             System.out.println("Sending the OTP to the ph no.:"+mobNo);
//         };
//         smsNotifier.accept("+91 12345678");
//     }
// }

// class lambda{
// public static void main(String[] args){
//         Consumer<String> pr = message -> System.out.println(message);
//         pr.accept("Hello I love cricket");
//     }
// }

// import java.util.*;
// import java.util.function.*;
// class lambda{
//     public static void main(String[] args) {
//         Supplier<String> otpGen=() -> {
//             Random random=new Random();
//             int number=100000+random.nextInt(9000000);
//             return String.valueOf(number);
//         };
//         String userOtp=otpGen.get();
//         System.err.println("The OTP is:"+userOtp);
//     }

// }
import java.util.*;
class lambda{
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,5);
    };
        List<Integer> nums=new ArrayList<>();
        for(int n:nums){
            if(n%2==0){
                result.add(n*n);
            }
    }
    System.out.println(result);
}
}