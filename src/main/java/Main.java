import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        // napisz swój program tutaj. Do wczytywania danych użyj przekazanego w parametrze scannera

        loadNumbers(scanner);
        if (numbers.isEmpty()) {
            System.out.println("Lista jest pusta. Nie można wyświetlić wyniku");
            return;
        }

        printList();
        calculateAndPrintSum();
        printMinValue();
        printMaxValue();

    }

    private void loadNumbers(Scanner scanner) {
        while (true) {
            System.out.println("Podaj liczbę dodatnią");
            int number = scanner.nextInt();
            if (number <= 0) {
                return;
            }
            numbers.add(number);
        }
    }

    private void printList() {
        for (int i = 0; i < numbers.size(); i++) {
            if (i < numbers.size() - 1) {
                System.out.print(numbers.get(numbers.size() - i - 1));
                System.out.print(", ");
            } else {
                System.out.print(numbers.get(numbers.size() - i - 1));
            }
        }
    }

    private void calculateAndPrintSum() {
        int sum = 0;
        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (i < numbers.size() - 1) {
                System.out.print(numbers.get(i) + " + ");
            } else {
                System.out.println(numbers.get(i) + " = " + sum);
            }
        }
    }

    private void printMaxValue() {
        Integer biggestValue = numbers.get(0);
        for (Integer number : numbers) {
            if (number > biggestValue) {
                biggestValue = number;
            }
        }
        System.out.println("Największa liczba w liście to " + biggestValue);
    }

    private void printMinValue() {
        Integer minValue = numbers.get(0);
        for (Integer integer : numbers) {
            if (integer < minValue) {
                minValue = integer;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + minValue);
    }
}
