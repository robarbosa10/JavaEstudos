//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Contratos contratos = new Contratos();

    contratos.ferrari.addPilotos(contratos.hamilton);
    contratos.ferrari.addPilotos(contratos.leclerc);
    System.out.println(contratos.leclerc.getEquipe());

    }
}