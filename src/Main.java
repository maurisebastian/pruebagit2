 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.ArrayList;
import java.util.List;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        Libro item = new Libro("el lobo","EPE");
        Item item2 = new Revista("LA Capital",42);
        Usuario nuevo = new Usuario("kiko");
        Prestamo uno = new Prestamo(nuevo,item);
        System.out.println(uno);









    }
}