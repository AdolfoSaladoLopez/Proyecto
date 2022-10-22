package Principal;

import Controlador.PedidoDAOMySQL;

public class Main {

    public static PedidoDAOMySQL dao = new PedidoDAOMySQL();

    public static void main(String[] args) {
       dao.mostrarMenu();


       

    }
}