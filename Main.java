public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[10];

        Book.inputBook(books);

        Book.displayBookArr(books);

        System.out.println("--------------");

        double bookPrice = Book.getTotalPrice(books);
        System.out.println("The Total Price of book list is: " + bookPrice);

        System.out.println("--------------");

        int countJava = Book.countJava(books);
        System.out.println("The number of Programing Book have language is \"Java\" is: " + countJava);

        System.out.println("--------------");

        int countCategory = Book.countByCategory(books);
        System.out.println("The number of Fiction Book have category is \" Vien tuong 1\" is: " + countCategory);

        System.out.println("--------------");

        int countPrice = Book.countByPrice(books);
        System.out.println("The number of Fiction Book have price \" < 100\" is: " + countPrice);

    }


}
