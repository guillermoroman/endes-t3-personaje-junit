package solucion;

public class Personaje {
    private String nombre;
    private int salud;
    private int experiencia;

    public Personaje(String nombre, int saludInicial) {
        this.nombre = nombre;
        this.salud = saludInicial;
        this.experiencia = 0;
    }

    public void recibirDaño(int daño) {
        if (daño < 0) {
            throw new IllegalArgumentException("El daño no puede ser negativo.");
        }
        this.salud -= daño;
        if (this.salud < 0) {
            this.salud = 0; // La salud no puede ser negativa.
        }
    }

    public void ganarExperiencia(int puntos) {
        if (puntos < 0) {
            throw new IllegalArgumentException("Los puntos de experiencia no pueden ser negativos.");
        }
        this.experiencia += puntos;
    }

    public int calcularNivel() {
        return (experiencia / 100) + 1; // Nivel basado en experiencia.
    }

    public boolean estaVivo() {
        return salud > 0;
    }

    public void imprimirNivel() {
        System.out.println("El nivel actual del personaje " + nombre + " es: " + calcularNivel());
    }
}