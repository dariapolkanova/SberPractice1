public class BookDriver {
    public static void main(String[] args) {
        Author author = new Author("А. С. Пушкин", "м", "pushkin@mail.ru");
        Book book = new Book("Евгений Онегин", author, 1833);

        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Автор: " + author.getName());
        System.out.println("Пол автора: " + author.getSex());
        System.out.println("Email автора: " + author.getEmail());
        System.out.println("Год выхода книги: " + book.getYear());

        System.out.println();

        System.out.println(book);
        System.out.println(author);

        System.out.println();

        book.setTitle("Смерть на Ниле");
        author.setName("Агата Кристи");
        author.setSex("ж");
        author.setEmail("christie@gmail.com");
        book.setYear(1937);

        System.out.println(book);
        System.out.println(author);
    }
}
