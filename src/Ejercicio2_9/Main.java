package Ejercicio2_9;

public class Main {
    public static void main(String[] args) {
        ConvertirMetros convertidor = new ConvertirMetros(3.5);
        System.out.println("Metros : " + convertidor.metros);
        System.out.println("-------------------------");
        System.out.println("Metros a Centimetros : " + convertidor.convertidorMaCM());
        System.out.println("Metros a Milimetros : " + convertidor.ConvertidorMaMILM());
        System.out.println("Metros a Pulgadas : " + convertidor.ConvertidorMapulgadas());
        System.out.println("Metros a Pies : " + convertidor.ConvertidorMaPies());
        System.out.println("Metros a Yardas : " + convertidor.ConvertidorMaYardas());
        System.out.println("-------------------------");
        convertir_M2 conver = new convertir_M2(3.5);
        System.out.println("Metros cuadrados :" + conver.Metros2);
        System.out.println("------------------------------");
        System.out.println("Metros cuadrados a area :" + conver.ConversorMaA());
        System.out.println("Metros cuadrados a hectareas :" + conver.ConversoMaH());
        System.out.println("Metros cuadrados a kilometros :" + conver.ConversorMaKM());
        System.out.println("Metros cuadrados a Fanegas :" + conver.ConversoMaFanegas());
        System.out.println("Metros cuadrados a Acres :" + conver.ConversoMaAcres());
        System.out.println("-------------------------------");
        ConvertirVolumen conv = new ConvertirVolumen(3.5);
        System.out.println("Litros : " + conv.litros);
        System.out.println("------------------------------");
        System.out.println("Litros a Galones :" + conv.ConversoAGalones());
        System.out.println("Litros a Pintas :" + conv.ConversoAPinta());
        System.out.println("Litros a Barriles :" + conv.ConversoABarril());
        System.out.println("Litros a Metros cubicos :" + conv.ConversoAMetros_cubicos());
        System.out.println("Litros a hectrolitros :" + conv.ConversoAHectrolitros());
    }


    }
