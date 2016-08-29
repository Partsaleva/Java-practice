package h1Java_Advanced_Stacks_and_Queues;

public class Porblem8RecursiveFibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(21));

      }

      public static int fibonacci(int number){
          if (number==0 || number == 1) {
              return 1;
          }
          return fibonacci(number-1) + fibonacci(number-2);        
      }

}
