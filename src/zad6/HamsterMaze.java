package zad6;

import java.util.*;

class Hamster implements Comparable<Hamster> {
    private int hamsterNumber;
    public String name;
    Hamster(int i) { hamsterNumber = i; }
    public void setName(String name){
        this.name = name;
    }
    // need to check if HamsterNumber > 0 in class HamsterMaze
    public int getHamsterNumber(){
        return this.hamsterNumber;
    }
    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }

    @Override
    public int compareTo(Hamster hamster) {
        return 0;
    }
}

class Printer {
    // ostatnie polecenie mowi, ze printAll ma wyswietlac z mapy po kluczach, wiec modyfikuje funkcje - teraz
    // jako argument przyjmuje mape
    static void printAll(List<Hamster> hl) {

        Iterator<Hamster> hlIterator = hl.listIterator();
        while (hlIterator.hasNext()){
            System.out.println(hlIterator.next());
        }
    }
}

public class HamsterMaze {
    public static Map<String, Hamster> hamstersMap = new HashMap<>();

    public static void hamsterRemover(List<Hamster> hl){
        Iterator<Hamster> hlIterator = hl.listIterator();
        while (hlIterator.hasNext()){
            //bug
            System.out.println(" Do you want to remove hamster " + hlIterator.next() + "? Enter 1 if yes, 0 if no.");
            Scanner scanner = new Scanner(System.in);
            int remove = scanner.nextInt();
            // zrobilam jakis warunek usuwania, zeby nie usunac wszystkich.
            if (remove == 1) {
                hlIterator.remove();
            }
        }
    }
    public static void main(String[] args) {
        List<Hamster> v = new ArrayList<Hamster>();

        boolean success = false;
        while (!success) {
            try {
                System.out.println("Enter name of a hamster: ");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.next();
                System.out.println("Enter hamster number: ");
                int hamsterNumber = scanner.nextInt();
                Hamster hamster1 = new Hamster(hamsterNumber);
                hamster1.name = name;
                if (hamster1.getHamsterNumber() < 0) {
                    throw new IllegalArgumentException();
                }
                success = true;
                hamstersMap.put(hamster1.name, hamster1);
            } catch (Exception exeption) {
                System.out.println("Wrong hamster number, try again: ");

            }
        }


        for(int i = 0; i < 3; i++)
            v.add(new Hamster(i));

        Printer.printAll(v);
        HamsterMaze.hamsterRemover(v);
        System.out.println("After removing: ");
        Printer.printAll(v);

        Collections.sort(v);
        System.out.println("Sorted: ");
        Printer.printAll(v);
    }
}
