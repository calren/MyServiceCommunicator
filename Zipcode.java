public class Zipcode extends ServiceCommunicator {

    public static void main(String[] args){
        System.out.println(new Zipcode("94107").get());
    }

    Zipcode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);
    }
}
