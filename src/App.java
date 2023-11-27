import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(50000, 1, 0, 1, 99, 2, 3, 4, 4, 5, 5, 66, 6, 7, 98, 11, 15, 16, 1000, 16, 999));
        List<String> words = new ArrayList<>(List.of("привет", "Добрый день", "Здравствуйте", "Привет", "Hello, World", "привет", "Добрый день", "Здравствуйте", "Hello, World", "Привет", "Hello, World", "привет", "Добрый день"));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три","три", "три"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        System.out.println("task1");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        System.out.println("task2");
        Set<Integer> numsSet = new HashSet<>(nums);
        List<Integer> numsSort = new ArrayList<>(numsSet);
        Collections.sort(numsSort);
        for (Integer integer : numsSort) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    public static void task3(List<String> words) {
        System.out.println("task3");
        Set<String> wordsSet = new HashSet<>(words);
        System.out.println(wordsSet);
    }

    public static void task4(List<String> strings) {
        System.out.println("task4|");
        Map <String, Integer> stringMap = new HashMap<>();
        for (String string : strings) {
            if (stringMap.containsKey(string)) {
                stringMap.put(string, stringMap.get(string) + 1);
            } else {
                stringMap.put(string, 1);
            }
        }
        System.out.println(stringMap.values());
        System.out.println(stringMap);
    }
}

