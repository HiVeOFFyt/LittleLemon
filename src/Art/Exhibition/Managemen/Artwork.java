package Art.Exhibition.Managemen;

public class Artwork {
    private String title;
    private int year;
    private Artist artist;

    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getYear() { return year; }
    public void setYear(int year) { this.year= year; }

    public void comparison(Artwork another_one) {
        if (this.year > another_one.year) {
            System.out.println(this.title + " "+"older than " + another_one.title);
        } else if (this.year < another_one.year) {
            System.out.println(this.title + " younger than " + another_one.title);
        } else {
            System.out.println("they made in one year");
        }
    }

    public String toString() {
        return "Artwork:"+" "+title+" " + " was made in "+" "+ year +" "+ "by" +" "+ artist;
    }
}
