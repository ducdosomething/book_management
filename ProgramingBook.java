public class ProgramingBook extends Book {
    private String language;
    private String framework;

    public ProgramingBook() {

    }

    public ProgramingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgramingBook(int bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgramingBook{" +
                "BookCode = '" + getBookCode() + '\'' +
                ", Name = '" + getName() + '\'' +
                ", Price = '" + getPrice() + '\'' +
                ", Author = '" + getAuthor() + '\'' +
                ", Language='" + language + '\'' +
                ", Framework='" + framework + '\'' +
                '}';
    }

    @Override
    public double getAmount() {
        return getPrice() * 50 / 100;
    }
}