g.- ¿Qué son setters y getters?
Son métodos utilizados en POO que se utulizan en el caso de los getters para obtener el valor de un atributo d euna clase y los setter son utilizados
para modificar estos valores.
public class Main {
    public static void main (String [] args){
        estudiante E1 = new estudiante("Cristian",23);
    }
}
public class estudiante {
    String nombre;
    int edad;

    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

h.- Indique una secuencia de comandos en git que permitan clonar un repositorio, traer los últimos cambios y una vez realizados los cambios,
actualizar los cambios.
- git clone <URL_del_repositorio>
- git pull origin <nombre_de_la_rama>
- git push origin <nombre_de_la_rama>

i.- ¿Para qué se utiliza "try y catch" en java?
Estos comandos son utilizados para el manejo de excepciones en el código, se utiliza para que prevenir el cieere del códigos por una mal sintaxis en este, 
haciendo que se ejecute otra linea y este sea cerrado por el error.
public class Main {
    public static void main (String [] args){
        try{
         int [] numeros = {1,2,3};
            System.out.println(numeros[10]);
        }
        catch (Exception){
            System.out.println("Hubo un error corrígelo");
        }
    }
}

j.- Defina Programación Orientada a Objetos y el concepto de constructores. Muestre un ejemplo de los tipos de constructores que puede haber.
Nos permite la creación de diferentes clases u objetos con los que podemos asignarles atributos es decir las características y trabajar en ellas.
Los constructores son los métodos que se generan cuando se crea una instancia nos permiten definir nuestros atributos del objetos para trabajar en ellos.
public frutas(String nombre, String color, double precio)
  this.nombre = nombre
  this.color = color
  this.precio = precio
