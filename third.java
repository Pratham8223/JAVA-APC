import java.util.*;
public class third {
    public static void main(String[] args) {
//direct initialize into forloop
        // for(int counter = 0; counter<5 ; counter = counter + 1) {
        //     System.out.println("this is loop no :" +counter  );
        // }
//prior variable declaration
        // int a;
        // for(a=0;a<5;a++) {
        //     System.out.println("this is " + a + " iteration");
        // }
//forloop value input from user
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // for(int b=0; b<a ; b++) {
        //     System.out.println(b+" ");
        // }

//while loop
        //  int i = 0;
        //  while(i < 10) {
        //     System.out.println(i);
        //     i++;
        //  }

//do while loops
        // int i = 0;
        // do {
        //         System.out.println(i);
        //         i++;

        // } while(i<11);

        // }

//sum of first n natural numbers
        // Scanner sc = new Scanner(System.in);
        // //int num = sc.nextInt();
        // int n = sc.nextInt();
        // int sum = 0;

        // for(int num = 1; num <= n; num++) {
        //         sum = sum + num;
        // }

        // System.out.println(sum);

//print table
        // Scanner sc = new Scanner(System.in);
        // int table = sc.nextInt();
        // for(int i=0 ; i<11; i++) {
        //         System.out.println(table + " x " +i+ "=" +(i*table));
        // }

//HW- all even num till n

        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++) {
        //         if(i%2==0) {
        //                 System.out.println(i);
        //         }
               
        // }

//hw 2
//         for( ; ; ) {
//                 System.out.println("hello");
//         }

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter option 1 or 0");
        int option = sc.nextInt();
        if(option==1) {
        do{
                System.out.println("please enter marks out of 100");
                int marks = sc.nextInt();
                if(marks>=90){
                        System.out.println("you are good");
                } else if (marks>=60 && marks<90) {
                        System.out.println("you are average");
                } else if (marks>=50 && marks<60) {
                        System.out.println("you are poor at studies");
                } else{
                        System.out.println("you are failed");
                }

        } while(option == 1);
} else if(option==0) {
System.out.println("you have exited the pole");
         
}
}
}

