public class TestScores {
    private int[] table;

    public TestScores(int[] table){
        for (int score : table) {
            if (score > 100 || score < 0) {
                throw new IllegalArgumentException();
            }
        }
        this.table = table;
    }

    public void mean(){
        int mean = 0;
        for (int score : table) {
            mean += score;
        }
        mean = mean / table.length;
        System.out.println("Mean of this scores is " + mean);
    }
}
