package Controlador;

import Modelo.*;

import java.io.Serializable;
import java.util.ArrayList;

public interface PedidoDAO extends Serializable {
    void insertarNuevoPedido();
    Boolean cambiarEstadoARecogido(Integer id);
    ArrayList<Pedido> verPedidosPendientesHoy();
    ArrayList<Pedido> verPedidosUsuarioConcreto(String nombre);
    ArrayList<String> verClientes();
    void mostrarListadoPedidos();
    Pedido obtenerPedidoPorId(Integer id_pedido);
    ArrayList<Pedido> traerPedidosPendientes();

}
