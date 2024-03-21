public class Prestamo {
    private Usuario usuario;
    private Item item;

    public Prestamo(Usuario usuario, Item item) {
        this.usuario = usuario;
        this.item = item;
        item.prestar(item);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Item getItem() {
        return item;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "usuario=" + usuario +
                ", item=" + item +
                '}';
    }
}
