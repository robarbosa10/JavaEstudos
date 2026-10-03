import java.util.Arrays;

public class FIA {
    public void configurarEquipes(){
        EquipesF1.FERRARI.addPiloto(Piloto.HAMILTON);
        EquipesF1.FERRARI.addPiloto(Piloto.LECLERC);
        EquipesF1.MERCEDES.addPiloto(Piloto.RUSSEL);
        EquipesF1.MERCEDES.addPiloto(Piloto.KIMI);
        EquipesF1.RED_BULL.addPiloto(Piloto.MAX);
        EquipesF1.RED_BULL.addPiloto(Piloto.HADJAR);
    }

    public void mostrarEquipe(){
        for(EquipesF1 equipe : EquipesF1.values()){
            System.out.println("Equipe: " + equipe.getNome());
            for (Piloto e : Piloto.values()){
                if (e.getEquipe() == equipe){
                    System.out.println(e.getNome());
                }
            }

        }
    }
}
