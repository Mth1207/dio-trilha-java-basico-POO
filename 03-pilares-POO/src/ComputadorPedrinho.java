public class ComputadorPedrinho {
    public static void main(String[] args) {
        // abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("MSN\n");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();
        System.out.println("FACEBOOK\n");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        System.out.println("TELEGRAM\n");
    }
}