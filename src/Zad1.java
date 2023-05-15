import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad1 {
    Set<Integer> setOfIntegers = new HashSet<>();

    public void enterIntegers(){
        System.out.println("Eneter as many integers as you like. When you're done enter something that is not a" +
                "integer.");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            setOfIntegers.add(number);
        }
        scanner.close();
    }

//    alternative method
//    public void enterIntegers(){
//        System.out.println("Plesae enter how many integers do you want to imput: ");
//        Scanner scanner = new Scanner(System.in);
//        int numberOfIntegers = scanner.nextInt();
//        System.out.println("Enter your integers: ");
//
//        for (int i = 0; i < numberOfIntegers; i++){
//            int number = scanner.nextInt();
//            setOfIntegers.add(number);
//        }
//        scanner.close();
//    }

    public void printIntegers(){
        for (Integer number : setOfIntegers){
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
