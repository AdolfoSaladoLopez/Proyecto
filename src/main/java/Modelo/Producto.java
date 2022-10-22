package Modelo;

public class Producto {

    private Integer idProducto;
    private String nombreProducto;
    private String tipoProducto;
    private Float precioProducto;
    private Boolean disponibilidadProducto;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Boolean getDisponibilidadProducto() {
        return disponibilidadProducto;
    }

    public void setDisponibilidadProducto(Boolean disponibilidadProducto) {
        this.disponibilidadProducto = disponibilidadProducto;
    }

    @Override
    public String toString() {
        return "Producto: \n" +
                "\t- ID del producto: " + this.idProducto +
                "\n\t- Nombre del producto: " + this.nombreProducto +
                "\n\t- Tipo de producto: " + this.tipoProducto +
                "\n\t- Precio del producto: " + this.precioProducto +
                "\n\t- Disponibilidad: " + (getDisponibilidadProducto() ? "Disponible" : "No disponible");
    }
}
