public class Book {
    private String name;
    private String genre;

    public Book(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public String getName(){
        return this.name;
    }

    public String getGenre(){
        return this.genre;
    }
}
