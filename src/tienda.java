class tienda extends videojuegos {
    String nombretienda;
    double precio;

    public tienda(String nombre, String genero, int dificultad, String nombretienda, double precio) {
        super(nombre, genero, dificultad);
        this.nombretienda = nombretienda;
        this.precio = precio;
    }

    public String getNombretienda() {
        return nombretienda;
    }

    public void setNombretienda(String nombretienda) {
        this.nombretienda = nombretienda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
