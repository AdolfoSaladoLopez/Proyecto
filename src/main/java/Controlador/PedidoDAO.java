package Controlador;

import Modelo.*;

import java.util.ArrayList;

public interface PedidoDAO {
    public Boolean insertarNuevoPedido(Pedido nuevoPedido);
    public Boolean cambiarEstadoARecogido(Integer id);
    public void eliminarPedido(Pedido pedido);
    public ArrayList<Pedido> verPedidosPendientesHoy();
    public ArrayList<Pedido> verPedidosUsuarioConcreto(String nombre);
    public ArrayList<String> verClientes();
    public void mostrarListadoPedidos();
    public Pedido traerPedidoPorId(Integer id_pedido);
    public ArrayList<Pedido> traerPedidosPendientes();

}
