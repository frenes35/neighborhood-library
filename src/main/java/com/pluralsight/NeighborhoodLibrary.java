package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private Book[] books = new Book[20];
    public NeighborhoodLibrary() {
        books[0] = new Book(1, "370-15458", "Atomic Habits");
        books[1] = new Book(2, "370-15459", "The Power of Habit");
        books[2] = new Book(3, "370-15460", "Mindset: The New Psychology of Success");
        books[3] = new Book(4, "370-15461", "Deep Work");
        books[4] = new Book(5, "370-15462", "The 7 Habits of Highly Effective People");
        books[5] = new Book(6, "370-15463", "How to Win Friends and Influence People");
        books[6] = new Book(7, "370-15464", "Atomic Habits - Workbook");
        books[7] = new Book(8, "370-15465", "Thinking, Fast and Slow");
        books[8] = new Book(9, "370-15466", "The Subtle Art of Not Giving a F*ck");
        books[9] = new Book(10, "370-15467", "Drive: The Surprising Truth About What Motivates Us");
        books[10] = new Book(11, "370-15468", "Grit: The Power of Passion and Perseverance");
        books[11] = new Book(12, "370-15469", "Essentialism: The Disciplined Pursuit of Less");
        books[12] = new Book(13, "370-15470", "The Lean Startup");
        books[13] = new Book(14, "370-15471", "Start with Why");
        books[14] = new Book(15, "370-15472", "The Four Agreements");
        books[15] = new Book(16, "370-15473", "You Are a Badass");
        books[16] = new Book(17, "370-15474", "Awaken the Giant Within");
        books[17] = new Book(18, "370-15475", "The Miracle Morning");
        books[18] = new Book(19, "370-15476", "The Alchemist");
        books[19] = new Book(20, "370-15477", "The Untethered Soul");
    }

    public void showAvailableBooks() {
        System.out.println("These are the available books ");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println("Id:  " + book.getId() + "Title:  " + book.getTitle() + "Isbn:  " + book.getIsbn());
            }
        }
    }
    public void showCheckOutBooks() {
        System.out.println("These books are checked out");
        for (Book book : books) {
            if (book.isCheckedOut())
            System.out.println("Id: " + book.getId() + " ,Title: " + book.getTitle() + " ,Reserved for: "+ book.getCheckedOutTo());


        }
    }
    public void checkOutBooks(int bookId, String userName) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.checkOut(userName);
                return;
            }
        }
        System.out.println("Book not founded");
    }
    public void checkInBooks(int bookId){
        for (Book book : books) {
            if (book.getId()  == bookId) {
                book.checkin();
                return;
            }
        }
        System.out.println("Book not founded");
    }

    public static void main(String[] args) {
        NeighborhoodLibrary library = new NeighborhoodLibrary();
        Scanner scanner = new Scanner(System.in);

        boolean loop = false;

        while (!loop){
            System.out.println("Welcome to the Neighborhood Library!");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Check Out a Book");
            System.out.println("4. Check In a Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    library.showAvailableBooks();
                    break;
                case 2:
                    library.showCheckOutBooks();
                    break;
                case 3:
                    System.out.print("Enter the book ID to check out: ");
                    int checkOutId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();
                    library.checkOutBooks(checkOutId, userName);
                    break;
                case 4:
                    System.out.print("Enter the book ID to check in: ");
                    int checkInId = scanner.nextInt();
                    library.checkInBooks(checkInId);
                    break;
                case 5:
                   loop = true;
                    System.out.println("Have a good one!");
                    break;
                default:
                    System.out.println("Invalid input");


            }

        }
        scanner.close();

    }
}
