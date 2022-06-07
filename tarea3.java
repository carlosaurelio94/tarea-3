/*Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades
 edad, nombre y telefono, por último muéstralas por consola.
**/
package com.example.demo1;

public class tarea3 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //edad
        persona.setEdad(22);

        int edad = persona.getEdad();
        System.out.println(edad);
        //nombre
        persona.setNombre("Pedro Perez");
        System.out.println(persona.getNombre());
        //telefono
        persona.setTelefono(1123456789);
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    //edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    //nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    //telefono
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
