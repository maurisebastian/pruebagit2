public class Libro extends Item {
    private String autor;

    public Libro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return
                super.toString() +"Libro{" +
                " \n autor='" + autor + '\'' +
                '}';
    }
}
