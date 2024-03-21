


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List <Usuario> usuarioList;
    private List <Item> itemList;
    private List <Prestamo> prestamoList;

    public Biblioteca() {
        this.usuarioList = new ArrayList<>();
        this.itemList = new ArrayList<>();
        this.prestamoList = new ArrayList<>();

    }
    public void crearUsuario(Usuario usuario){
       usuarioList.add(usuario);

    }
    public void  crearItem(Item item)
    {
     itemList.add(item);

    }
    public void prestarItem(Usuario usuario, Item item) {
        // Verificar si el usuario y el ítem existen
        if (!usuarioList.contains(usuario)) {
            System.out.println("Error: El usuario no está registrado en la biblioteca.");
            return;
        }
        if (!itemList.contains(item)) {
            System.out.println("Error: El ítem no está registrado en la biblioteca.");
            return;
        }

        // Verificar si el ítem está disponible
        if (!item.isDisponible()) {
            System.out.println("Error: El ítem no está disponible para ser prestado.");
            return;
        }

        // Crear un nuevo préstamo y agregarlo a la lista de préstamos
        Prestamo prestamo = new Prestamo(usuario, item);
        prestamoList.add(prestamo);

        // Marcar el ítem como prestado
        item.prestar();

        System.out.println("El ítem '" + item.getTitulo() + "' ha sido prestado a " + usuario.getNombre() + ".");
    }
}
