import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            // read the meat information for this test case
            Meat[] meats = new Meat[n];
            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                int daysToExpiration = scanner.nextInt();
                meats[i] = new Meat(name, daysToExpiration);
            }

            // sort the meat by their expiration dates in ascending order
            Arrays.sort(meats, Comparator.comparing(Meat::getDaysToExpiration));

            // output the names of the meat in the desired sequence
            StringBuilder sb = new StringBuilder();
            for (Meat meat : meats) {
                sb.append(meat.getName()).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    static class Meat {
        private final String name;
        private final int daysToExpiration;

        public Meat(String name, int daysToExpiration) {
            this.name = name;
            this.daysToExpiration = daysToExpiration;
        }

        public String getName() {
            return name;
        }

        public int getDaysToExpiration() {
            return daysToExpiration;
        }
    }
}
