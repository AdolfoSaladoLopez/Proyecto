package Controlador;

import Modelo.*;

import java.util.ArrayList;

public interface PedidoDAO {
    public Boolean insertarNuevoPedido(Pedido nuevoPedido);
    public Boolean cambiarEstadoARecogido(Pedido nuevoPedido);
    public ArrayList<Pedido> verPedidosPendientesHoy();
    public ArrayList<Pedido> verPedidosUsuarioConcreto(String nombre);
    public void mostrarListadoPedidos(Pedido pedido);

}
