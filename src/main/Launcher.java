package main;

public class Launcher {
    private static int steps = 0;
    
    public static void main(String[] args) {
        long number = 0;
        
        for(int i = 1; i <= 1000000; i++) {
            if(i % 50000 == 0) {
                System.out.println(i + " sequences processed.");
            }
            number = i;
            while(number != 1) {
                steps++;

                if(number % 2 == 0) {
                    number = (number / 2);
                } else {
                    number = (number * 3) + 1;
                }
            }
        }
        System.out.println("Steps Total: " + steps);
    }
}