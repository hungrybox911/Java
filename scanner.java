import java.util.Scanner;

public class scanner {

    int mw(String d, int e){
        System.out.println("Name : " +d);
        System.out.println("Number : " +e);


return 0;
    }

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Please enter your name ");
       String b = s.nextLine();
       System.out.println("please enter your number ");
       int a = s.nextInt();
      scanner ss = new scanner();//method made
      ss.mw(b, a); //method call and pass the value to the parameter

    }
}
