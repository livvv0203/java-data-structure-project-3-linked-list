package com.jieqing;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class TextbookManagement {
    // Read info from textbook_into.txt
    // Stores the textbooks in Java's LinkedList
    private static LinkedList<String> ReadFromFile(String fileName) {
        // Declare and Initialize the Linked List
        LinkedList<String> listOfLines = new LinkedList<String>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;

            // Add all lines from file to Linked List
            while (( line = bufferedReader.readLine()) != null) {
                listOfLines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Finally
        return listOfLines;
    }

    public static void runTextbookManagement() {
        // Print all textbooks
        LinkedList<String> r = ReadFromFile("" +
                "textbook_info.txt");
        LinkedList<Textbook> textbooks = new LinkedList<Textbook>();

        Textbook cheapestTextBook = null;
        Person youngestAuthor = null;
        Textbook youngestAuthorsBook = null;

        // Split the String into pieces
        for ( int i = 0; i < r.size(); i++) {
            String[] split = r.get(i).split(",");
            // Split should have 5 tuples
            Person p = new Person(
                    split[2].trim(), // Author
                    Integer.parseInt(split[3].trim()) // Age
            );
            double price = Double.parseDouble(split[4].trim());
            Textbook t = new Textbook(
                    split[0].trim(),    // Use trim() to remove front and end spaces of the text
                    split[1].trim(),    // Title
                    p,  // Person p
                    price
            );
            textbooks.add(t);
            System.out.println(t);

            if ( cheapestTextBook == null || cheapestTextBook.getPrice() > t.getPrice() ) {
                cheapestTextBook = t;
            }

            if ( youngestAuthor == null || youngestAuthor.getAge() > p.getAge()) {
                youngestAuthor = p;
                youngestAuthorsBook = t;
            }
        } // End of for loop

        System.out.println("\nCheapest book: " + cheapestTextBook);
        System.out.println("\nBook by youngest author: " + youngestAuthorsBook);
    } // End of method
}
















