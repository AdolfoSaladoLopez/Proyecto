package Controlador;

import Modelo.*;

import java.util.ArrayList;

public interface PedidoDAO {
    void insertarNuevoPedido();
    Boolean cambiarEstadoARecogido(Integer id);
    void eliminarPedido(Pedido pedido);
    ArrayList<Pedido> verPedidosPendientesHoy();
    ArrayList<Pedido> verPedidosUsuarioConcreto(String nombre);
    ArrayList<String> verClientes();
    void mostrarListadoPedidos();
    Pedido obtenerPedidoPorId(Integer id_pedido);
    ArrayList<Pedido> traerPedidosPendientes();

}
