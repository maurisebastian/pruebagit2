public class Revista extends Item{

    private Integer nroEdicion;

    public Revista(String titulo, Integer nroEdicion) {
        super(titulo);
        this.nroEdicion = nroEdicion;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    @Override
    public String toString() {
        return super.toString() +
                " \n nroEdicion=" + nroEdicion +
                '}';
    }
}
