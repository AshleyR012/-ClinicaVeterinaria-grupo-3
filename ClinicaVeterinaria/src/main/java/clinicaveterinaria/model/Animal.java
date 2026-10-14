package clinicaveterinaria.model;


import java.util.Objects;


public class Animal{
    private int id;
    private String nombre;
    

    public Animal(int id, String nombre, TipoAnimal tipo) {
        this.id = id;
        this.nombre = nombre;
        
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
