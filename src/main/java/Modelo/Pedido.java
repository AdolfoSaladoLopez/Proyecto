package Modelo;

import java.sql.Date;
import java.util.ArrayList;

import Controlador.PedidoDAOMySQL;

public class Pedido {
    private Integer idPedido;
    private Integer idMismoPedido;
    private Date fechaPedido;
    private String nombreCliente;
    private String estadoPedido;
    private ArrayList<Producto> listaProductos;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdMismoPedido() {
        return idMismoPedido;
    }

    public void setIdMismoPedido(Integer idMismoPedido) {
        this.idMismoPedido = idMismoPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String recorrerListadoProductos(ArrayList<Producto> listaProductos) {
         listaProductos.forEach(
                Producto -> System.out.println(Producto)
        );
        return null;
    }

    @Override
    public String toString() {
        String[] arrayFechas = new String[3];
        arrayFechas = this.fechaPedido.toString().split("-");
        String año = arrayFechas[0];
        String mes = arrayFechas[1];
        String dia = arrayFechas[2];



        return ("Pedido: \n" +
                "\t- ID del pedido: " + this.idPedido +
                "\n\t- Fecha del pedido: " + dia + " / " + mes + " / " + año +
                "\n\t- Nombre del cliente: " + this.nombreCliente +
                "\n\t- Estado del pedido: " + this.estadoPedido + "\n") +
                this.getListaProductos();

               
    };
    
}
