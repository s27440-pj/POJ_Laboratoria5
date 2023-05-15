import java.sql.Array;
import java.util.*;

public class Zad2 {
    Set<Integer> setOfIntegers1 = new HashSet<>();
    Set<Integer> setOfIntegers2 = new HashSet<>();
    Set<Integer> setSum = new HashSet<>();
    public void enterIntegers(){
        System.out.println("Enter first set in one line, and second set in another line: ");
        Scanner scanner = new Scanner(System.in);
        String setInLine1 = scanner.nextLine();
        String setInLine2 = scanner.nextLine();

        String[] set1 = setInLine1.split(" ");
        String[] set2 = setInLine2.split(" ");

        for (String word : set1){
            int number = Integer.parseInt(word);
            setOfIntegers1.add(number);
        }
        for (String word : set2){
            int number = Integer.parseInt(word);
            setOfIntegers2.add(number);
        }
        scanner.close();
    }

    public void setCalculations(){
        // I left that commented to remember my first way of thinking. Later I realised, that I do not nedd
        // those 2 sets, one final set is enough.

//        Set <Integer> setAminusB = new HashSet<>();
//        Set <Integer> setBminusA = new HashSet<>();

        for (Integer number1 : setOfIntegers1){
            for (Integer number2 : setOfIntegers2){
                if (number1.equals(number2)){
                    this.setSum.remove(number1);
                    break;
                }
                //setAminusB.add(number1);
                this.setSum.add(number1);
            }
        }

        for (Integer number2 : setOfIntegers2){
            for (Integer number1 : setOfIntegers1){
                if (number2.equals(number1)){
                    this.setSum.remove(number2);
                    break;
                }
                //setBminusA.add(number2);
                this.setSum.add(number2);
            }
        }
    }

    public void printIntegers(){
        // sorting to make it looks better
        List<Integer> sortedSetAsList = new ArrayList(setSum);
        Collections.sort(sortedSetAsList);
        for (Integer number : sortedSetAsList){
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
