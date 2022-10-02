package org.pawelgalus.javacourse2022;

import java.util.*;

/**
 * Course: Java Programming for Beginners - Full Course
 */

public class App {

    public static void main(String[] args) {
        App app = new App();

        //app.dataTypes();
        //app.Operators();
        //app.Operators2();
        //app.Operators3();
        //app.Strings1();
        //app.Strings2();
        //app.userInputs();
        //app.conditionalStatements();
        //app.switchCases();
        //app.Arrays1();
        //app.Arrays2();
        //app.loops();
        //app.arrayList();
        //app.hashMaps();
        app.objectOrientedProgramming();
    }

    public void dataTypes() {
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32768 to 32767
        int anInteger = 2147483647; // -214748348 to 2147483647
        long aLargeNumber = 922337203685477807L; // -9223372036854775808 to 9223372036854775807

        // decimal types
        double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38

        // booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        // characters
        char copyrightSymbol = '\u00A9';
        char percentSymbol = '%';

        System.out.println("This is the copyright symbol: " + copyrightSymbol);
        System.out.println("This is the percent symbol: " + percentSymbol);
    }

    public void Operators() {
        int number1 = 12;
        int number2 = 6;
        int number3 = 5;
        double number4 = 5;

        // addition
        System.out.println(number1 + number2); // 18

        // subtraction
        System.out.println(number1 - number2); // 6
        System.out.println(number2 - number1); // -6

        // multiplication
        System.out.println(number1 * number2); // 72

        // division
        System.out.println(number1 / number2); // 2
        System.out.println(number1 / number3); // 2
        System.out.println(number1 / number4); // 2.4

        // remainder (modulo/modulos
        System.out.println(number1 % number2); // 0
        System.out.println(number1 % number3); // 2
    }

    public void Operators2() {
        int number1 = 12;
        int number2 = 15;

        // is equal to
        System.out.println(number1 == number2);

        // is not equal to
        System.out.println(number1 != number2);

        // is greater than
        System.out.println(number1 > number2);

        // is less than
        System.out.println(number1 < number2);

        // is greater than or equal to
        System.out.println(number1 >= number2);

        // is less than or equal to
        System.out.println(number1 <= number2);
    }

    public void Operators3() {
        int age = 25;
        int score = 0;
        int turns = 10;
        int number = 55;

        boolean isStudent = false;
        boolean isLibraryMember = true;

        System.out.println(age >= 18 && age <= 40); // AND
        System.out.println(isStudent || isLibraryMember); // OR
        System.out.println(!isStudent); // NOT

        score++; // incremental
        turns--; // decremental

        System.out.println(score);
        System.out.println(turns);

        System.out.println(number++); // 55
        System.out.println(number); // 56
        System.out.println(++number); //57
    }

    public void Strings1() {
        String name1 = "Paweł Marek Galus";
        String name2 = new String("Paweł Marek Galus");

        String literalString1 = "abc";
        String literalString2 = "abc";
        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");
        String objectString3 = new String("XYZ");

        System.out.println(name1);
        System.out.println(name2);

        System.out.println(literalString1 == literalString2); // true
        System.out.println(objectString1 == objectString2); // false
        System.out.println(objectString1.equals(objectString2)); //true
        System.out.println(objectString1.equalsIgnoreCase(objectString3)); //true
    }

    public void Strings2() {
        String name = "Paweł Marek Galus"; // %s
        String country = "Poland";
        int age = 30; // %d
        double gpa = 3.8; // %f
        char percentSign = '%'; // %c
        boolean amITellingTheTruth = false; // %b

        String formattedString = String.format("Hello World! I am %s. I am from %s and I am %d years old.", name, country, age);

        String string = "The sky is blue.";

        System.out.println("Hello World! I am Paweł Marek Galus. I am from Poland and I am 30 years old.");
        System.out.println("Hello World! I am " + name + ". I am from " + country + " and I am " + age + " years old.");
        System.out.println(formattedString);

        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(string.replace("blue", "red"));
        System.out.println(string.contains("sky"));
    }

    public void userInputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How old are you? " ,name);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d is an excellent age to start programming. What language do you prefer? ", age);
        String language = scanner.nextLine();

        System.out.printf("%s is a very popular programming language.", language);

        scanner.close();
    }

    public void conditionalStatements() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double number2 = Double.parseDouble(scanner.nextLine());

        System.out.print("What operation do you want to perform? ");
        String operation = scanner.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        }
        else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        }
        else if (operation.equals("mul")) {
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        }
        else if (operation.equals("div")) {
            if (number2 == 0) {
                System.out.println("Can not divide by zero!");
            }
            else {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
        }
        else {
            System.out.printf("%s is not supported operation.", operation);
        }

        scanner.close();
    }

    public void switchCases() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double number2 = Double.parseDouble(scanner.nextLine());

        System.out.print("What operation do you want to perform? ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "div":
                if (number2 == 0) {
                    System.out.println("Can not divide by zero!");
                }
                else {
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                }
                break;
            default:
                System.out.printf("%s is not supported operation.", operation);
        }

        scanner.close();
    }

    public void Arrays1() {
        char vowels[] = new char[5];
        char vowels2[] = {'e', 'u', 'a', 'o', 'i'};
        char vowels3[] = {'e', 'u', 'a', 'o', 'i'};

        // a e i o u
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        char key = 'o';

        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(vowels2));
        System.out.println(vowels.length);

        Arrays.sort(vowels2);
        int foundItemIndex = Arrays.binarySearch(vowels2, key);

        System.out.println(Arrays.toString(vowels2));
        System.out.println(foundItemIndex);

        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.sort(vowels3, startingIndex, endingIndex);
        foundItemIndex = Arrays.binarySearch(vowels3, startingIndex, endingIndex, key);
        System.out.println(Arrays.toString(vowels3));
        System.out.println(foundItemIndex);

        Arrays.fill(vowels, 'x');
        System.out.println(Arrays.toString(vowels));

        Arrays.fill(vowels2, startingIndex, endingIndex, 'x');
        System.out.println(Arrays.toString(vowels2));
    }

    public void Arrays2() {
        int numbers[] = {1, 2, 3, 4, 5};

        int startingIndex = 1;
        int endingIndex = 4;

        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
        int copyOfNumbers2[] = Arrays.copyOf(numbers, 10);
        int copyOfNumbers3[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

        //Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println(Arrays.toString(copyOfNumbers2));
        System.out.println(Arrays.toString(copyOfNumbers3));

        System.out.println(Arrays.equals(numbers, copyOfNumbers));
    }

    public void loops() {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int number = 5;
        int multi = 1;

        for(int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }

        System.out.println(sum);

        for (int multiplier = 1; multiplier < 10; multiplier++) {
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
        }

        for (int num = 1; num <= 10; num++) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%d X %d = %d \n", num, multiplier, num * multiplier);
            }
        }

        for (int num = 1; num <= 50; num++) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

        for (int num : numbers) {
            System.out.println(num);
        }

        while (multi <= 10) {
            System.out.printf("%d X %d = %d \n", number, multi, number * multi);
            multi++;
        }

        multi = 1;

        do {
            System.out.printf("%d X %d = %d \n", number, multi, number * multi);
            multi++;
        }
        while(multi <= 10);
    }

    public void arrayList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();

        numbers.add(1); // index 0
        numbers.add(2); // index 1
        numbers.add(3); // index 2
        numbers.add(4); // index 3
        numbers.add(5); // index 4

        System.out.println(numbers.toString());
        System.out.println(numbers.get(2));

        numbers.remove(2);
        System.out.println(numbers.toString());

        numbers.remove(Integer.valueOf(4));
        System.out.println(numbers.toString());

        numbers.set(2, Integer.valueOf(30));
        System.out.println(numbers.toString());

        numbers.clear();
        System.out.println(numbers.toString());
        System.out.println(numbers.isEmpty());

        numbers2.add(5);
        numbers2.add(3);
        numbers2.add(1);
        numbers2.add(4);
        numbers2.add(2);

        numbers2.sort(Comparator.naturalOrder());
        System.out.println(numbers2.toString());

        numbers2.sort(Comparator.reverseOrder());
        System.out.println(numbers2.toString());

        System.out.println(numbers2.size());
        System.out.println(numbers2.contains(Integer.valueOf(1)));
        System.out.println(numbers2.isEmpty());

        System.out.println("Before: " + numbers2.toString());

        numbers2.forEach(number -> {
            numbers2.set(numbers2.indexOf(number), number * 2);
        });

        System.out.println("After: " + numbers2.toString());
    }

    public void hashMaps() {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Bengali", 100);
        examScores.put("Computer Programming", 100);

        examScores.putIfAbsent("Math", 70);
        examScores.replace("Math", 70);

        examScores.remove("Sociology");

        System.out.println(examScores.toString());
        System.out.println(examScores.size());
        System.out.println(examScores.get("English"));
        System.out.println(examScores.get("Religion"));
        System.out.println(examScores.getOrDefault("Religion", -1));
        System.out.println(examScores.containsKey("Math"));
        System.out.println(examScores.containsValue(100));
        System.out.println(examScores.containsValue(Integer.valueOf(100)));
        System.out.println(examScores.isEmpty());

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });
        System.out.println(examScores.toString());

        examScores.clear();
        System.out.println(examScores.toString());
    }

    public void objectOrientedProgramming() {
        User youngerUser = new User("Paweł Galus", "1992-03-23");
        User olderUser = new User("Jerzy Galus", "1961-04-11");

        System.out.printf("%s was born back in %s and he is now %d years old. \n", youngerUser.getName(), youngerUser.getBirthDay(), youngerUser.age());
        System.out.printf("%s was born back in %s and he is now %d years old. \n", olderUser.getName(), olderUser.getBirthDay(), olderUser.age());

        Book book = new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook audioBook = new AudioBook("Dracula", "Bram Stoker", 30000);
        Ebook ebook = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 280, "PDF");

        youngerUser.borrow(book);

        System.out.printf("%s has borrowed these books: %s \n", youngerUser.getName(), youngerUser.borrowedBooks());

        System.out.println(audioBook.toString());
        System.out.println(ebook.toString());
    }

}