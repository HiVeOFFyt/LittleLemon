package Art.Exhibition.Managemen;

public class Gallery {
    private String galleryName;
    private String Gallerylocation;

    public Gallery(String galleryName, String location) {
        this.galleryName = galleryName;
        this.Gallerylocation = location;
    }

    public String getGalleryName() { return galleryName; }
    public void setGalleryName(String galleryName) { this.galleryName = galleryName; }

    public void displayshow(Artwork art) {
        System.out.println("Presenting at " + galleryName + ": " + art.getTitle());
    }
}
