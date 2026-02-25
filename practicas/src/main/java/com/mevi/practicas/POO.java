package com.mevi.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Instancia de la clase Casa
 */
public class POO {
    public static void main(String[] args) {
        Casa miCasa = new Casa("independencia", 'd', (short) 34, 2000000, 1772047204028L,
                3.5f, 320.12312314, false);

        System.out.println(miCasa);

        //diferentes formas de instanciar un objeto con el constructor
        Casa naryCasa = new Casa("Reforma", (short) 543, 3500000, true);
        Casa claudaCasa = new Casa("Roma", (short) 12, 1200000, false);

        System.out.println(naryCasa);
        System.out.println(claudaCasa);

        Casa casaVacia = new Casa();

        System.out.println(casaVacia);

        Main.nuevoTema("Listas");
        List<Casa> casaList = new ArrayList<>();
        casaList.add(miCasa);
        casaList.add(naryCasa);
        casaList.add(claudaCasa);
        casaList.add(casaVacia);

        for (Casa casa : casaList) {
            System.out.println(casa);
        }

        Main.nuevoTema("Diccionarios");
        Map<String, Casa> casaMap = new HashMap<>();
        casaMap.put("casa1", miCasa);
        casaMap.put("casa2", naryCasa);
        casaMap.put("casa3", claudaCasa);
        casaMap.put("casa4", casaVacia);

        for (Map.Entry<String, Casa> entry : casaMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(casaMap.get("casa1"));
    }
}
