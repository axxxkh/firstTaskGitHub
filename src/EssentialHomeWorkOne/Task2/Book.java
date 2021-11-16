package EssentialHomeWorkOne.Task2;

public class Book {


    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.author = "Jack London";
        title.title = "White fang";
        content.content = "About dog...";

        System.out.println("This book is ");
        author.show();
        title.show();
        content.show();

    }
}
