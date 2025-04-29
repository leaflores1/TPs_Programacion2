public class Revista extends Publicacion {
    private int numero;
    private int volumen;

    public Revista(int numero, int volumen, String titulo, int anio, Genero genero) {
        super(titulo, anio, genero);
        this.numero = numero;
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public int getVolumen() {
        return volumen;
    }
}

