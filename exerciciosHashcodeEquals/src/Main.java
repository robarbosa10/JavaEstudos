//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int voltas = 0;
        Integer contVoltas = 0;

        for(int i = 0 ; i < 10; i++){
            System.out.println("Variavel voltas : " + voltas);
            System.out.println("Variavel contVoltas : " + contVoltas);
            if(voltas == contVoltas){
                System.out.println("comparador ==");
            }if(contVoltas.equals(voltas)){
                System.out.println("Comparador equals");
            }
        voltas ++;
        contVoltas++;
        }

    }
}