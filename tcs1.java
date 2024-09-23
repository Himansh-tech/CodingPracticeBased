

//Remeeber top level class can't be static so in below code do not think of making tcs1 class as Static



//In below code 
//We made class Solution inside class tcs1.
//And none of them is Static which means we have to first make an instance of tcs1 to call class Solutin
//and then we have to make Instance of Solution to call the methods present in Solution

// import java.util.*;
// public class tcs1 {
// class Solution{
//     double baseM = 5;
//     double costKg;
//     double costKm;

//     public double totalcost(double baseM, double Kg, double Km){
//         double costKg=2*Kg;
//         double costKm=0.05*Km;
//         return baseM+costKg+costKm;
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double costKg=sc.nextDouble();
//         double costKm=sc.nextDouble();
//         //if i don't make Solution class as static i have to do this 
//         tcs1 tcs = new tcs1();

//         tcs1.Solution solution = tcs.new Solution();

//         System.out.printf("%.2f",solution.totalcost(5,costKg,costKm));
//     }
// }





//what we can also do is make Solution class as Static and now we do not need to make the instance of tcs1
//Static helps us to access methods and varibles of class without making it's instance.

// import java.util.*;
// public class tcs1 {
// static class Solution{
//     double baseM = 5;
//     double costKg;
//     double costKm;

//     public double totalcost(double baseM, double Kg, double Km){
//         double costKg=2*Kg;
//         double costKm=0.05*Km;
//         return baseM+costKg+costKm;
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double costKg=sc.nextDouble();
//         double costKm=sc.nextDouble();
//         //if i don't make Solution class as static i have to do this 
        

//         Solution solution = new Solution();

//         System.out.printf("%.2f",solution.totalcost(5,costKg,costKm));
//     }
// }






//but still here i need to make the instance of solution to be able to access the methods of solution inside it 
//so to remove this what we can do is make the method itself static and then we can access it directly

// import java.util.*;
// public class tcs1 {
// static class Solution{
//     double baseM = 5;
//     double costKg;
//     double costKm;

//     public static double totalcost(double baseM, double Kg, double Km){
//         double costKg=2*Kg;
//         double costKm=0.05*Km;
//         return baseM+costKg+costKm;
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double costKg=sc.nextDouble();
//         double costKm=sc.nextDouble();
//         //if i don't make Solution class as static i have to do this 
    

//         System.out.printf("%.2f",Solution.totalcost(5,costKg,costKm));
//         //as our inner class Solution is static we do not need instance of super class tcs1
//         //also as out method "totalcost" is also static we do not need instance of Solution as well
//     }
// }





//even if we make this inner class "Solution" as non static we can still directly access it's function since it is declared as static



import java.util.*;
public class tcs1 {
class Solution{
    double baseM = 5;
    double costKg;
    double costKm;

    public static double totalcost(double baseM, double Kg, double Km){
        double costKg=2*Kg;
        double costKm=0.05*Km;
        return baseM+costKg+costKm;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costKg=sc.nextDouble();
        double costKm=sc.nextDouble();
        //if i don't make Solution class as static i have to do this 
    

        System.out.printf("%.2f",Solution.totalcost(5,costKg,costKm));
        //as our inner class Solution is static we do not need instance of super class tcs1
        //also as out method "totalcost" is also static we do not need instance of Solution as well
    }
}




//ALL ABOVE CODE AS WORKING WELL !!