public class Usuario {
    private static int nextId = 1;
    private int id;
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
