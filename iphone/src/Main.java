import impl.AparelhoTelefonicoImpl;
import service.AparelhoTelefonico;

public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico ap = new AparelhoTelefonicoImpl();

        System.out.println(ap.atender());
    }
}