public class Primes {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[number + 1];
        int count = 0;

        for (int i = 2; i <= number; i++) {// איתחול כל המספרים ל-true
            isPrime[i] = true;

        }

        for (int i = 2; i * i <= number; i++) {// לולאה ראשית מ-2 עד שורש n
            if (isPrime[i]) {

                for (int j = i * 2; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }

        }

        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;

            }
        }
        double percent = (double) count / (number - 1) * 100;
        int percentInt = (int) percent;

        System.out.println(
                "There are " + count + " primes between 2 and " + number + " (" + percentInt + "% are primes)");

    }
}
