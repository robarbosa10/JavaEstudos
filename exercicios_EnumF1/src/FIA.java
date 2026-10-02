public class FIA {
    public void Contrato(){
        EquipesF1.FERRARI.addPiloto(Piloto.HAMILTON);
        EquipesF1.FERRARI.addPiloto(Piloto.LECLERC);
        EquipesF1.MERCEDES.addPiloto(Piloto.RUSSEL);
        EquipesF1.MERCEDES.addPiloto(Piloto.KIMI);
        EquipesF1.REDBUL.addPiloto(Piloto.MAX);
        EquipesF1.REDBUL.addPiloto(Piloto.HADJAR);
    }

    public void mostrarEquipe(){

        System.out.println("EQUIPES");
        for(int i = 0; i <  EquipesF1.values().length; i++){
            System.out.println();
            for(int j = 0; j < Piloto.values().length; j++){
                
            }
        }
    }
}
