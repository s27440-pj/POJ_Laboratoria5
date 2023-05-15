public class Testy {

    public static void main(String[] args) {
//        Zad1 example1_1 = new Zad1();
//        example1_1.enterIntegers();
//        example1_1.printIntegers();

//        Zad2 example2 = new Zad2();
//        example2.enterIntegers();
//        example2.setCalculations();
//        example2.printIntegers();

//        Zad3 example3 = new Zad3();
//        example3.enetrWords();
//        example3.printMap();

        TestScores scores = new TestScores(new int[]{39, 3, 82, 45});
        scores.mean();
        TestScores scores2 = new TestScores(new int[]{100, 3, -5, 45});
        scores2.mean();
    }
}
