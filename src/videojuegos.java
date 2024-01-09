public class videojuegos {
    private String nombre;
    private String genero;
    private int dificultad;

    public videojuegos(String nombre, String genero, int dificultad) {
        this.nombre = nombre;
        this.genero = genero;
        try {
            setDificultad(dificultad);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en el constructor: " + e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDificultad(int dificultad) {
        try {
            if (dificultad < 1 || dificultad > 10) {
                throw new IllegalArgumentException("La dificultad debe estar en el rango de 1 a 10.");
            }
            this.dificultad = dificultad;
        } catch (IllegalArgumentException e) {
            System.out.println("Error en setDificultad: " + e.getMessage());
        }
    }

    public String juegos() {
        return nombre + " " + genero + " " + dificultad;
    }

    public static void main(String[] args) {

    }
}
