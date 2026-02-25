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

        casaList.remove(1);
        casaList.set(1, miCasa);

        for (Casa casa : casaList) {
            System.out.println(casa);
        }

        Main.nuevoTema("Diccionarios");
        Map<String, Casa> casaMap = new HashMap<>();
        casaMap.put("casa1", miCasa);
        casaMap.put("casa2", naryCasa);
        casaMap.put("casa3", claudaCasa);
        casaMap.put("casa4", casaVacia);

        System.out.println(casaMap.size());
        casaMap.remove("casa2");
        System.out.println(casaMap.size());

        for (Map.Entry<String, Casa> entry : casaMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        casaMap.put("casa1", miCasa);
        System.out.println(casaMap.get("casa1"));

        Main.nuevoTema("Herencia");
        Apartamento apartamentoPlaya = new Apartamento("Malecon", 'B', (short) 101,
                2600000, 177204720402L, 6.3f, 180.123124125, true, (short) 5);

        System.out.println(apartamentoPlaya);

        Main.nuevoTema("Polimorfismo");

        venderPropiedades(miCasa);
        venderPropiedades(apartamentoPlaya);
        Casa apartamentoCiudad = new Apartamento("Principal", 'A', (short) 10, 1500000, 177204720402L,
                6.3f, 180.123124125, false, (short) 5);
        venderPropiedades(apartamentoCiudad);

        Casa casaNueva = new Casa();
        casaNueva.setCalle("Cortez");
        casaNueva.setHipotecada(true);
        casaNueva.setImpuesto(2.0f);
        System.out.println(casaNueva);
        venderPropiedades(casaNueva);

        Main.nuevoTema("Equals y hashcode");

        Casa miSegundaCasa = new Casa("independencia", 'd', (short) 34, 2000000, 1772047204028L,
                3.5f, 320.12312314, false);

        System.out.println(miCasa.equals(miSegundaCasa));
        Casa miTerceraCasa = new Casa();
        System.out.println(casaMap.containsValue(claudaCasa));
    }

    private static void venderPropiedades(Casa casa) {
        if (casa.isHipotecada()) {
            System.out.println("Imposible vender!!");
        } else {
            System.out.println("Venta realizada");
        }
    }
}
