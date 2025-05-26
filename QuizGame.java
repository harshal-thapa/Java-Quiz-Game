import java.util.Scanner; // Import the Scanner class to get user input

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        int score = 0; // Initialize the player's score

        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("Answer the following multiple-choice questions by typing the letter (a, b, c, or d).");
        System.out.println("--------------------------------------------------");

        // Question 1
        System.out.println("\nQuestion 1: Which of the following is a German Car Company");
        System.out.println("a) Ford Motor");
        System.out.println("b) MG Hector");
        System.out.println("c) BMW"); // Correct answer (String is a class, not a keyword in lowercase)
        System.out.println("d) GM");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine(); // Read the user's answer
        if (answer1.equalsIgnoreCase("c")) { // Compare the answer (case-insensitive)
            System.out.println("Correct!");
            score++; // Increment score if correct
        } else {
            System.out.println("Incorrect. The correct answer was c) string.");
        }

        // Question 2
        System.out.println("\nQuestion 2: What is the capital of France?");
        System.out.println("a) Berlin");
        System.out.println("b) Madrid");
        System.out.println("c) Rome");
        System.out.println("d) Paris"); // Correct answer
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("d")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer was d) Paris.");
        }

        // Question 3
        System.out.println("\nQuestion 3: Which data type is used to store single characters in Java?");
        System.out.println("a) int");
        System.out.println("b) char"); // Correct answer
        System.out.println("c) boolean");
        System.out.println("d) double");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer was b) char.");
        }

        // Question 4
        System.out.println("\nQuestion 4: What is the output of 'System.out.println(10 / 3);' in Java?");
        System.out.println("a) 3.333...");
        System.out.println("b) 3"); // Correct answer (integer division)
        System.out.println("c) 4");
        System.out.println("d) Error");
        System.out.print("Your answer: ");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer was b) 3.");
        }

        // Question 5
        System.out.println("\nQuestion 5: Which keyword is used to define a constant in Java?");
        System.out.println("a) static");
        System.out.println("b) final"); // Correct answer
        System.out.println("c) const");
        System.out.println("d) abstract");
        System.out.print("Your answer: ");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer was b) final.");
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("Quiz finished!");
        System.out.println("Your final score is: " + score + " out of 5");
        System.out.println("Thank you for playing!");

        scanner.close(); // Close the scanner to release system resources
    }
}