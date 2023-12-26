public class ImageProxy implements ImageInterface {
    private Image image;
    private final String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (image == null) {
            image = new Image(filename);
        }
        image.display();
    }
}
