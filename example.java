package Class12;

public class example {
    public static void main(String[] args) {


        String[][] Countries = {{"USA", "Mexico", "Canada", "Jamaica"}, {"Brazil", "Argentina", "Ecuador", "Colombia"},
                {"Italy", "Germany", "Spain", "France"}, {"China", "Japan", "Thailand", "India"}};

        int a = 0;

        for (int i = 0; i < Countries.length; i++) {
            for (int j = 0; j < Countries[i].length; j++) {
                if (Countries[i][j] == Countries[0][j]) {
                    System.out.println("Countries of south America are: " + Countries[i][j]);
                } else if (Countries[i][j] == Countries[1][j]) {
                    System.out.println("Countries of north America are: " + Countries[i][j]);
                } else if (Countries[i][j] == Countries[2][j]) {
                    System.out.println("Countries of Europe are: " + Countries[i][j]);
                } else if (Countries[i][j] == Countries[2][j]) {
                    System.out.println("Countries of Asia are: " + Countries[i][j]);
                }

            }

        }
    }
}

