public class Main {
    public static void main(String[] args) {
        ImageInterface image = new ImageProxy("/images/image.png");
        image.display();
    }
}
