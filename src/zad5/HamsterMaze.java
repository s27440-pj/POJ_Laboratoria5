package zad5;

import java.util.*;

class Hamster {
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
}

class Printer {
    // ostatnie polecenie mowi, ze printAll ma wyswietlac z mapy po kluczach, wiec modyfikuje funkcje - teraz
    // jako argument przyjmuje mape
    static void printAll(Map<String, Hamster> hamstersMap) {
        for (String key : hamstersMap.keySet()){
            System.out.println(key + " : " + hamstersMap.get(key));
        }

        // ta metoda już byla i jako jeden z punktow bylo dodanie tu wyswietlania imienia
//        for (Hamster hamster : hl){
//            System.out.println(hamster.hamsterNumber() + " and its name is "+ hamster.name);
//        }
    }
}

public class HamsterMaze {
    public static Map<String, Hamster> hamstersMap = new HashMap<>();
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

        // pierwotnie dodawalo do listy, ale w zadaniu mamy przegladac po mapie, wiec zeby mapa zawierala wiecej niz
        // jeden element (zeby mozna bylo po czyms przegladac) dodaje stworzonym chomikom imiona (jest to klucz w mapie)
        // i dodaje je do mapy
        for(int i = 0; i < 3; i++)
            v.add(new Hamster(i));
        v.get(0).name = "Krysia";
        v.get(1).name = "Basia";
        v.get(2).name = "Milek";

        for (Hamster hamster : v){
            hamstersMap.put(hamster.name, hamster);
        }


        Printer.printAll(hamstersMap);
    }
}
