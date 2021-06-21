public class Music extends ServiceCommunicator {

    public static void main(String[] args) {
        System.out.println(
                new Music("Aretha-Franklin").get());
    }

    Music(String songTitleOrArtistName) {
        super("https://itunes.apple.com/search?term="
                + songTitleOrArtistName + "&limit=1");
    }
}
