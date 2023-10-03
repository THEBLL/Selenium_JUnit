package utulities;

public class ReusableMethods {

    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*15);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
