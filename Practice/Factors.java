public class Factors {
    public static void main(String [] args)
 {
    fact(20000);
 }
 
 public static void fact(int n) {
    
    for(int i = 1;i<=n;i++) {
        if(n%i==0) {
            System.out.println(i);
        }
    }
 }
 
 } 

// class Factors
// {
//     public static void main(String args[])
//     {
//         fact(12);
//     }

//     public static void fact(int n)
//     {
//         for(int i = 1; i <= n; i++)
//         {
//             if(n % i == 0)
//             {
//                 System.out.println(i);
//             }
//         }
//     }
// }