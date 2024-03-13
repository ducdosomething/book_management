public class FictionBook extends Book {
    private String category;

    public FictionBook() {

    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "BookCode = '" + getBookCode() + '\'' +
                ", Name = '" + getName() + '\'' +
                ", Price = '" + getPrice() + '\'' +
                ", Author = '" + getAuthor() + '\'' +
                ", Category='" + category + '\'' +
                '}';
    }

    @Override
    public double getAmount() {
        return getPrice() * 70 / 100;
    }

    public static int countByCategory(FictionBook... fictionBookArr) {
        int count = 0;
        for (FictionBook fictionBook : fictionBookArr) {
            if (fictionBook.category.equals("Vien tuong 1")) {
                count++;
            }
        }
        return count;
    }

    public static int countByPrice(FictionBook... fictionBookArr) {
        int count = 0;
        for (FictionBook fictionBook : fictionBookArr) {
            if (fictionBook.getPrice() < 100) {
                count++;
            }
        }
        return count;
    }
}
