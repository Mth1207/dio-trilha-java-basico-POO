package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    // pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
    }

    // pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    // pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
