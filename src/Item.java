public class Item {
    private boolean reservado;
    private boolean disponible;
    private String titulo;

    public Item(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
        this.reservado = false;
    }

    public boolean isReservado() {
        return reservado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Item " +
                " \n reservado= " + reservado +
                "\n disponible= " + disponible +
                "\n titulo= " + titulo + '\'' +
                '}';
    }
    public void prestar(Item item) {
        if (item.disponible) {
            item.disponible = false;
            System.out.println("El item '" + item.titulo + "' ha sido prestado.");
        } else {
            System.out.println("El item '" + item.titulo + "' no está disponible para prestar.");
        }
    }
    public void devolver(Item item) {
        if (!item.disponible) {
            item.disponible = true;
            System.out.println("El item '" + item.titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El item '" + item.titulo + "' no está prestado.");
        }
    }
    public void reservar() {
        if (disponible && !reservado) {
            reservado = true;
            System.out.println("El item '" + titulo + "' ha sido reservado.");
        } else {
            System.out.println("El item '" + titulo + "' no se puede reservar en este momento.");
        }
    }

}
