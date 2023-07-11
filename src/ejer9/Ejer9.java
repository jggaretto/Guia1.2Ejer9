
package ejer9;


public class Ejer9 {

  
    public static void main(String[] args) {
        
     // Crear dos objetos de tipo Fecha
        Fecha fecha1 = new Fecha(1, 1, 2020);
        Fecha fecha2 = new Fecha(31, 12, 2022);

        // Mostrar si la primera fecha y la segunda corresponden a años bisiestos
        System.out.println("¿La primera fecha es bisiesta? " + fecha1.esBisiesto());
        System.out.println("¿La segunda fecha es bisiesta? " + fecha2.esBisiesto());

        // Mostrar la cantidad de años transcurridos entre la primera fecha y la segunda
        int aniosTranscurridos = fecha1.calcularAnios(fecha2);
        System.out.println("La cantidad de años transcurridos entre la primera fecha y la segunda es: " + aniosTranscurridos);
    }
    
}
