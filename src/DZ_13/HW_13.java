package DZ_13;

public class HW_13 {
    public static void main(String[] args) {
        Author authorLevTolstoy = new Author("Лев", "Толстой");
        Author authorEdgarPoe = new Author("Эдгар", "По");
        Book bookWarAndPeace = new Book("Война и мир", authorLevTolstoy, 1991);
        Book bookCrow = new Book("Ворон", authorEdgarPoe, 1999);
        bookWarAndPeace.setYear(1891);
        System.out.println("bookCrow = " + bookCrow);
        System.out.println("bookWarAndPeace = " + bookWarAndPeace);
    }
}
