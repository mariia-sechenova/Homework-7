public class Main {
    public static void main(String[] args) {

        //Homework 1, Task 1
        System.out.println("Homework 1 \nTask 1:" + "\n" + "Amount of months to save 2'459'000 if you put away 15'000 per month");
        int initialSum = 0;
        double savingsPerMonth = 15_000 * (1 + 0.01);
        double sum = 0;
        int i = 0;
        while (sum <= 2_459_000) {
            sum = sum + savingsPerMonth;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        //Task 2
        System.out.println("\n" + "Task 2:" + "\n" + "Cycle while 1-10, for 10-1");
        int j = 0;
        while (j < 10) {
            j = j + 1;
            System.out.printf("%d ", j);
        }
        System.out.printf("\n");
        for (int k = 10; k >= 1; k--) {
            System.out.printf("%d ", k);
        }

        //Task 3
        System.out.println("\n \n" + "Task 3:" + "\n" + "Population");
        double population = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double deathRate = (double) 8 / 1000;
        int year = 0;
        population = population + (birthRate - deathRate) * population;
        while (year < 10) {
            year += 1;
            population = population + (birthRate - deathRate) * population;
            System.out.printf("Год %d, численность населения составляет %.9f\n", year, population);
        }
        //Homework 2, Task 1
        System.out.println("\nHomework 2 \nTask 1:" + "\n" + "Savings: 7% per month");

        double summa = 15_000;
        double monthRate = 0.07;
        int monthNumber = 0;
        double summa2 = summa;
        while (summa2 < 12_000_000) {
            summa2 = summa2 * (1 + monthRate);
            monthNumber += 1;
            System.out.printf("Месяц %d, сумма накоплений %.9f\n", monthNumber, summa2);
        }

        //Homework 2, Task 2
        System.out.println("\nHomework 2 \nTask 2:" + "\n" + "Savings: 7% per month, show every 6th month");
        summa = 15_000;
        monthRate = 0.07;
        monthNumber = 0;
        summa2 = summa;
        while (summa2 < 12_000_000) {
            summa2 = summa2 * (1 + monthRate);
            monthNumber += 1;
            if (monthNumber % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %.2f\n", monthNumber, summa2);
            }
        }

        //Homework 2, Task 3
        System.out.println("\nHomework 2 \nTask 3:" + "\n" + "Savings: 9 years");
        int monthsTotal = 0;
        double initialSumma = 15000;
        double interestRatePerMonth = 0.07;
        double summaTotal = initialSumma;
        int months = 0;
        while (monthsTotal < 9 * 12) {
            summaTotal = summaTotal * (1 + interestRatePerMonth);
            monthsTotal += 1;
            if (monthsTotal % 6 ==0) {
                System.out.printf("Месяц %d, сумма накоплений %.2f\n", monthsTotal, summaTotal);
            }
        }

        //Homework 2, Task 4
        System.out.println("\nHomework 2 \nTask 4:" + "\n" + "Friday Report");
        int firstFriday = 7;
        int friday = firstFriday;
        while ( friday < 24) {
            friday = friday + 7;
            System.out.printf("Сегодня пятница, " + friday + "-ое число. Необходимо подготовить отчёт. \n");
        }

        //Homework 3, Task 1
        System.out.println("\nHomework 3 \nTask 1:" + "\n" + "Comets");
        int currentYear = 2022;
        int initialYear = currentYear - 200;
        int finalYear = currentYear + 100;
        int cometYear = initialYear;
        do {
            cometYear = cometYear + 1;
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);
            }
        }
                while (cometYear < finalYear);


        //Homework 3, Task 2
        System.out.println("\nHomework 3 \nTask 2:" + "\n" + "Multiplication Table");
        int number = 2;
        int x = 0;
        int finalNumber = number * x;
        do {
            x += 1;
            finalNumber = number * x;

            System.out.println(number + "*" + x + "=" + finalNumber);

        }
        while (x < 10);

        }
    }
