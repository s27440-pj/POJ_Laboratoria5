import java.util.*;

public class Zad3 {
    Map<String, Integer> words = new TreeMap<>();

    public void enetrWords(){
        System.out.println("Enetr words or characters: ");
        Scanner scanner = new Scanner(System.in);
        String wordsInLine = scanner.nextLine();

        String[] wordsInTable = wordsInLine.split(" ");

        for (String word : wordsInTable) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word)+1);
            } else {
                words.put(word, 1);
            }
        }
        scanner.close();
    }

    public void printMap(){
        Iterator<Map.Entry<String, Integer>> iterator = words.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}
