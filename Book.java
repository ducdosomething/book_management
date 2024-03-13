import java.util.Scanner;

public abstract class Book {
    private int bookCode;
    private String name;
    private double price;
    private String author;

    public Book() {

    }

    public Book(int bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode=" + bookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public static void inputBook(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter the information of the book number " + (i + 1));
            System.out.print("Book code: ");
            int bookCode = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            if (i < 5) {
                System.out.println("Language: ");
                String language = scanner.nextLine();
                System.out.println("Framework: ");
                String framework = scanner.nextLine();
                books[i] = new ProgramingBook(bookCode, name, price, author, language, framework);
            } else {
                System.out.println("Category: ");
                String category = scanner.nextLine();
                books[i] = new FictionBook(bookCode, name, price, author, category);
            }
        }
    }

    public static void displayBookArr(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public static int countJava(Book[] books){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgramingBook) {
                ProgramingBook programingBook = (ProgramingBook) books[i];
                if (programingBook.getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countByCategory(Book[] books){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) books[i];
                if (fictionBook.getCategory().equals("Vien tuong 1")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countByPrice(Book[] books){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) books[i];
                if (fictionBook.getPrice() < 100) {
                    count++;
                }
            }
        }
        return count;
    }

    public static double getTotalPrice(Book... books) {
        double totalPrice = 0.0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public abstract double getAmount();
}
