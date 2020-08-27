public class BugsIn {


    public static void main(String[] args) {
        int sum = 0;

        for (int i = 8; i > 0; i -= 2) { //Sum = 20
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
