package Principal;

import Controlador.PedidoProductoDAOMySQL;

public class Main {

    public static PedidoProductoDAOMySQL dao = new PedidoProductoDAOMySQL();

    public static void main(String[] args) {
       dao.mostrarMenuPrincipal();


       

    }
}