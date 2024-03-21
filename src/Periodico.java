public class Periodico extends Item{

    private String editorial;

    public Periodico(String titulo, String editorial) {
        super(titulo);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return super.toString() +
                "editorial='" + editorial + '\'' +
                '}';
    }
}
