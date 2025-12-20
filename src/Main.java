import Art.Exhibition.Managemen.Artist;
import Art.Exhibition.Managemen.Artwork;
import Art.Exhibition.Managemen.Gallery;

public class Main {
    public static void main(String[] args) {
        Artist Malybekov = new Artist("Zhandarbek Malybekov"+" ", "Socialist realism");
        Artist Kasteev = new Artist("Abilkhan Kasteev", "neosymbolism");

        Artwork Turk_Sib = new Artwork("Turk-Sib", 1969, Kasteev);
        Artwork Kazakhstan_Flag= new Artwork("Kazakhstan Flag", 1991, Malybekov);

        Gallery Kazakhstan_National_Museum = new Gallery("Kazakhstan National Museum", "Astana");

        System.out.println("Museum Object Details.");
        System.out.println(Turk_Sib.toString());
        System.out.println(Kazakhstan_Flag.toString());

        Kazakhstan_National_Museum.displayshow(Turk_Sib);
        System.out.println("Year Comparison");
        Kazakhstan_Flag.comparison(Turk_Sib);
    }
}