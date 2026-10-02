import java.util.HashMap;
import java.util.Map;

public class Corrida {
    Pontos pontos;



    public Pontos getPontos() {
        return pontos;
    }

    public void setPontos(Pontos pontos) {
        this.pontos = pontos;
    }


    public void Volta(){
        HashMap<String, Integer> piloto = new HashMap<>();

        piloto.put("Max", 33);
        piloto.put("Hamilton", 44);
        piloto.put("Leclerc", 55);

        for(String pilotos : piloto.keySet() ){
            System.out.println(pilotos);

        }
    }

    }

