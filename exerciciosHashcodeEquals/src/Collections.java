import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Collections {
    public static void main(String[] args){
        Map<Integer, Integer> exemplo = new HashMap<>();

        exemplo.put(1, 25 );
        exemplo.put(2, 18);
        exemplo.put(3, 15);
        exemplo.put(4, 10);
        exemplo.put(5, 8);
        exemplo.put(6, 6);
        exemplo.put(7, 5);
        exemplo.put(8, 3);
        exemplo.put(9, 2);
        exemplo.put(10, 1);

        for(Integer e : exemplo.values()){
            System.out.println(exemplo.keySet());
        }/*
        while (Pontos.values().length < 3){
            if()
        }*/

        Corrida c = new Corrida();

        c.Volta();

    }
}
