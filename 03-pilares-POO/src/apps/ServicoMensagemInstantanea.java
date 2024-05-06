package apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    // Modificado protected só fica disponível para as classes filhas.
    protected void validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet.");
    }
}
