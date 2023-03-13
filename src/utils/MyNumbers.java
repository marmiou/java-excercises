package utils;

public class MyNumbers {
    public void fizzBuzzProblem(Integer number){
        for(int i=0; i<number; i++){
            if ((i%7==0) && (i%5==0)){
                System.out.println("FizzBuzz");
            }
            else if(i%7==0){
                System.out.println("Buzz");
            }
            else if(i%5==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public void fibonacci(Integer number) {
        int previousNumber = 0;
        int nextNumber =1;
        
        for(int i=0; i<number; i++){
            System.out.println(previousNumber);
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }

}
