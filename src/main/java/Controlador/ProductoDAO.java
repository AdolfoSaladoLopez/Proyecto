package Controlador;

import Modelo.*;

import java.io.Serializable;
import java.util.ArrayList;

public interface ProductoDAO extends Serializable {
    ArrayList<Producto> obtenerProductosCarta();
    Producto obtenerProductoPorId(Integer id);
    ArrayList<Producto> obtenerProductosDisponibles();
    ArrayList<Producto> obtenerProductosNoDisponible();
    Boolean insertarNuevoProducto(Producto producto);
    Boolean cambiarDisponibilidadProducto(Integer idProducto, Boolean disponibilidad);
    ArrayList<Producto> obtenerProductosPedido(Integer id_pedido);
    void traerTipoProductos();
    void traerProductosCaros();
    void traerProductosBaratos();
}
