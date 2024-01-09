class plataforma extends tienda{
    String nombre;

    public plataforma(String nombre, String genero, int dificultad, String nombre1, double precio, String nombre2) {
        super(nombre, genero, dificultad, nombre1, precio);
        this.nombre = nombre2;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
