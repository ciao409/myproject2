package Score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Hank", "Jack", "Karen", "Elva", "Benny"};
        int[] english = {90, 80, 60, 50, 40};
        int[] math = {88, 75, 64, 56, 48};
        for (int i = 0; i < 5; i++) {
            if (i != 3) {
                System.out.println(names[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i] + math[i]) / 2);
            }
        }
    }
}
