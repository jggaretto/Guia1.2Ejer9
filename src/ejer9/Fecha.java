/*
En un nuevo proyecto, crear una clase de nombre Fecha con los siguientes atributos: dia,
mes, año; un constructor que permita inicializar a todos sus atributos; los métodos getter y
setter para sus atributos y los siguientes métodos adicionales:
 esBisiesto(): Este método retornará true si el año de esta Fecha es bisiesto; caso contrario
retornará false.
 calcularAños(): Este método recibirá un objeto del tipo Fecha y retornará un entero que
será la cantidad de años transcurridos entre esta Fecha y la que recibe por parámetro.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear dos objetos de tipo fecha.
Utilizando sus métodos:
b) Mostrar por consola si la primera fecha y la segunda corresponden a años bisiestos.
c) Mostrar por consola, la cantidad de años transcurridos entre la primera fecha y la segunda.
 */
package ejer9;


public class Fecha {
     private int dia;
    private int mes;
    private int anio;

    // Constructor
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Getters y Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método para verificar si el año es bisiesto
   public boolean esBisiesto() {
    if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
        return true;
    } else {
        return false;
    }
}

    // Método para calcular la cantidad de años transcurridos entre dos fechas
   public int calcularAnios(Fecha fecha) {
    int aniosCompletos = fecha.getAnio() - this.anio;

    if (fecha.getMes() < this.mes || (fecha.getMes() == this.mes && fecha.getDia() < this.dia)) {
        aniosCompletos--;
    }

    return aniosCompletos;
}
}
