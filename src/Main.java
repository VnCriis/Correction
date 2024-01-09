public class Main {
    public static void main(String [] args) {
        // Crear objetos
        videojuegos V1 = new videojuegos("Juego","Pertenece",1-5);
        tienda T1 = new tienda("GTA V","ACCION",3,"EpicGames",9.99);
        plataforma P1 = new plataforma("San Adreas","ACCION",4,"Steam",15.00,"dad");
        // Almacenar en un array
        videojuegos[] arrayvideojuegos = { V1, T1, P1 };
        for (videojuegos print : arrayvideojuegos) {
            System.out.println(print.juegos());
        }
        videojuegos miVideojuego = new videojuegos("Ejemplo", "Aventura", 8);
        System.out.println(miVideojuego.juegos());

        // Intentando crear un Videojuego con una dificultad inválida
        videojuegos videojuegoInvalido = new videojuegos("Invalido", "Estrategia", 15);
        System.out.println(videojuegoInvalido.juegos());  // Debería imprimir el mensaje de error
    }
}