public class ComputadorPedrinho {
    public static void main(String[] args) {
        // abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();
        FacebookMessenger fcb = new FacebookMessenger();
        System.out.println("\nFACEBOOK");
        fcb.enviarMensagem();
        fcb.receberMensagem();
        Telegram tlg = new Telegram();
        System.out.println("\nTELEGRAM");
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}