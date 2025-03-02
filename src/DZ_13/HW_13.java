package DZ_13;

public class HW_13 {
    public static void main(String[] args) {
        Author authorLevTolstoy = new Author("Лев", "Толстой");
        Author authorEdgarPoe = new Author("Эдгар", "По");
        Book bookWarAndPeace = new Book("Война и мир", authorLevTolstoy, 1991);
        Book bookCrow = new Book("Ворон", authorEdgarPoe, 1999);
        bookWarAndPeace.setYear(1891);
        System.out.println("bookCrow.getName() = " + bookCrow.getName());
        System.out.println("bookCrow.getAuthor().getName() = " + bookCrow.getAuthor().getName());
        System.out.println("bookCrow.getAuthor().getLastName() = " + bookCrow.getAuthor().getLastName());
        System.out.println("bookCrow.getYear() = " + bookCrow.getYear());
        System.out.println("bookWarAndPeace.getName() = " + bookWarAndPeace.getName());
        System.out.println("bookWarAndPeace.getAuthor().getName() = " + bookWarAndPeace.getAuthor().getName());
        System.out.println("bookWarAndPeace.getAuthor().getLastName() = " + bookWarAndPeace.getAuthor().getLastName());
        System.out.println("bookWarAndPeace.getYear() = " + bookWarAndPeace.getYear());
    }
}
