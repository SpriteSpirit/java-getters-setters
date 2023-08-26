public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Anton", "Chekhov");
        Book book1 = new Book("The Cherry Orchard", author1, 1904);
        System.out.println(book1);

        Author author2 = new Author("Alexandr", "Pushkin");
        Book book2 = new Book("The Gold Fish", author2, 1833);
        book2.setPublishedYear(1835);
        System.out.println(book2);

        Author author3 = new Author("Alexandr", "Pushkin");
        Book book3 = new Book("The Gold Fish", author2, 1835);
        System.out.println(book2);

        /** =======================EQUALS=========================== **/
        System.out.println("Are books (1&2) equal? " + book1.equals(book2));
        System.out.println("Are books (1&3) equal? " + book1.equals(book3));
        System.out.println("Are books (2&3) equal? " + book2.equals(book3));

        /** ====================HASH CODE=========================== **/
        System.out.println("Hash code of book1: " + book1.hashCode());
        System.out.println("Hash code of book2: " + book2.hashCode());
        System.out.println("Hash code of book3: " + book3.hashCode());
    }
}