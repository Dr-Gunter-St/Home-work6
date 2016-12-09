package Home_Work6;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();
        int[] array = new int[10];
        boolean positive = false;

        for (int i = 0; i < 10; i++){
            positive = randomNumberGenerator.nextBoolean();
            if (positive) array[i] = randomNumberGenerator.nextInt(1000);
            else array[i] = -randomNumberGenerator.nextInt(1000);

        }

        System.out.println("array:");
        System.out.println(Arrays.toString(array));
        System.out.println("sum:");
        System.out.println(ArrayUtils.sum(array));
        System.out.println("max:");
        System.out.println(ArrayUtils.max(array));
        System.out.println("min:");
        System.out.println(ArrayUtils.min(array));
        System.out.println("max positive:");
        System.out.println(ArrayUtils.maxPositive(array));
        System.out.println("multiplication:");
        System.out.println(ArrayUtils.multiplication(array));
        System.out.println("modulus:");
        System.out.println(ArrayUtils.modulus(array));
        System.out.println("second largest (array sorts):");
        System.out.println(ArrayUtils.secondLargest(array));
        System.out.println("reverse (sorted):");
        System.out.println(Arrays.toString(ArrayUtils.reverse(array)));
        System.out.println("even elements:");
        System.out.println(Arrays.toString(ArrayUtils.findEvenElements(array)));

        User[] users = new User[5];

        users[0] = new User(3463453245243l, "Jon", "Doe", 10000, 15000);
        users[1] = new User(3463453245243l, "Jon", "Doe", 10000, 15000);
        users[2] = new User(6543353243543l, "Donny", "Darko", 15000, 30000);
        users[3] = null;
        users[4] = new User(5879831254321l, "Ellochka", "Shchukina", 3000, 5000);

        System.out.println(Arrays.toString(users));
        System.out.println("deleting empty:");
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
        System.out.println("getting ids: ");
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println("getting unique:");
        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println("paying salary:");
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println("with balance 5000:");
        System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(users, 5000)));
        System.out.println("ater paying salary balance updated so looking for balance = 8000:");
        System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(users, 8000)));
    }
}
