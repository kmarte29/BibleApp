import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bible_Explorer {

    // HashMap to store the books and their specific chapters
    private static HashMap<String, ArrayList<String>> books;
    private static ArrayList<String> bookNames;

    public static void main(String[] args) {
        // Initialize books data using the BibleData class
        books = BibleData.initializeBooks();

        // Create an ArrayList of New Testament book names
        bookNames = new ArrayList<>();
        bookNames.add("MATTHEW");
        bookNames.add("MARK");
        bookNames.add("LUKE");
        bookNames.add("JOHN");
        bookNames.add("ACTS");
        bookNames.add("ROMANS");
        bookNames.add("1 CORINTHIANS");
        bookNames.add("2 CORINTHIANS");
        bookNames.add("GALATIANS");
        bookNames.add("EPHESIANS");
        bookNames.add("PHILIPPIANS");
        bookNames.add("COLOSSIANS");
        bookNames.add("1 THESSALONIANS");
        bookNames.add("2 THESSALONIANS");
        bookNames.add("1 TIMOTHY");
        bookNames.add("2 TIMOTHY");
        bookNames.add("TITUS");
        bookNames.add("PHILEMON");
        bookNames.add("HEBREWS");
        bookNames.add("JAMES");
        bookNames.add("1 PETER");
        bookNames.add("2 PETER");
        bookNames.add("1 JOHN");
        bookNames.add("2 JOHN");
        bookNames.add("3 JOHN");
        bookNames.add("JUDE");
        bookNames.add("REVELATION");

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bible App!");
        System.out.println("This app runs on the New King James Version translation.");
        System.out.println("This app currently focuses on the New Testament, which includes 27 books. More updates coming soon!");
        System.out.println();

        boolean running = true; // Keep the program running until the user exits

        while (running) {
            // Present the main menu options
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Pick a book and read a chapter");
            System.out.println("Enter 'exit' to quit the program.");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("Goodbye! Thank you for using the Bible App.");
                continue;
            }

            switch (choice) {
                case "1": // Pick a book and read a chapter
                    System.out.println("\nPlease choose a book from the New Testament:");
                    for (int i = 0; i < bookNames.size(); i++) {
                        System.out.println((i + 1) + ". " + bookNames.get(i));
                    }
                    System.out.println("Enter 'back' to return to the main menu.");
                    System.out.print("Enter the name of the book or the corresponding number: ");
                    String userInput = scanner.nextLine().trim();

                    if (userInput.equalsIgnoreCase("back")) {
                        continue;
                    }

                    String chosenBook;
                    try {
                        int bookNumber = Integer.parseInt(userInput);
                        if (bookNumber > 0 && bookNumber <= bookNames.size()) {
                            chosenBook = bookNames.get(bookNumber - 1);
                        } else {
                            System.out.println("Invalid number selection. Please try again.");
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        chosenBook = userInput.toUpperCase();
                    }

                    if (books.containsKey(chosenBook)) {
                        listChapters(chosenBook, scanner);
                    } else {
                        System.out.println("Invalid book selection. Please try again.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 or 'exit'.");
            }
        }

        scanner.close();
    }

    // Method to list chapters and get user selection
    public static void listChapters(String chosenBook, Scanner scanner) {
        ArrayList<String> chapters = books.get(chosenBook);
        System.out.println("You chose the book: " + chosenBook);
        System.out.println("Available chapters:");
        System.out.println();

        // Display all chapters of the chosen book
        for (int i = 0; i < chapters.size(); i++) {
            System.out.println("Chapter " + (i + 1) + ". " + chapters.get(i));
        }

        System.out.println();

        boolean reading = true; // Keep the user in this loop until they want to exit or go back

        while (reading) {
            System.out.print("Enter the chapter number you want to read (or 'back' to return to the main menu): ");
            String userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("back")) {
                reading = false; // Exit the loop and return to the main menu
                continue;
            }

            try {
                int chapterNumber = Integer.parseInt(userInput);

                // Check if the chapter number is valid
                if (chapterNumber > 0 && chapterNumber <= chapters.size()) {
                    // Dynamically construct file path and read content
                    String filePath = "/Users/krismarte/Documents/CPSC2231 Workshop/BibleApp Project/" + chosenBook + " Chapters/" + chosenBook + chapterNumber + ".txt";
                    String chapterContent = readChapterContent(filePath);
                    if (chapterContent != null) {
                        System.out.println("\nChapter " + chapterNumber + " content:");
                        System.out.println(chapterContent);
                    } else {
                        System.out.println("Error reading chapter content. File might be missing.");
                    }
                } else {
                    System.out.println("Invalid chapter selection. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid chapter number.");
            }
        }
    }


    // Method to read chapter content from a text file
    public static String readChapterContent(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                content.append(fileScanner.nextLine()).append("\n");
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            return null;
        }
        return content.toString();
    }
}
