import java.util.Date;
import java.util.ArrayList;

public class TicketDeVenta {
private String fechaDeCompra;
private ArrayList<Muebles> objetosComprados;
private double valorDeVenta;
private String metodoDePago;

    public TicketDeVenta(String fechaDeCompra, String metodoDePago) {
        this.setFechaDeCompra(fechaDeCompra);
        this.setObjetosComprados(new ArrayList<Muebles>(0));
        this.setValorDeVenta(0);
        this.setMetodoDePago(metodoDePago);
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public ArrayList<Muebles> getObjetosComprados() {
        return objetosComprados;
    }

    public void setObjetosComprados(ArrayList<Muebles> objetosComprados) {
        this.objetosComprados = objetosComprados;
    }

    public double getValorDeVenta() {
        return valorDeVenta;
    }

    public void setValorDeVenta(double valorDeVenta) {
        this.valorDeVenta = valorDeVenta;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
public void agregarProductos(Muebles objetosComprados){
    getObjetosComprados().add(objetosComprados);
    System.out.println("su objeto fue agregado a la compra");
    }
    public void removerProductos(Muebles objetosComprados){
        getObjetosComprados().add(objetosComprados);
    }
    public void fijarPrecio(double valorDeVenta){
        this.valorDeVenta = 0;
        for(int i=0;i<objetosComprados.size();i++){
            valorDeVenta = valorDeVenta + objetosComprados.get(i).getPrecio();
        }
        System.out.println("su precio ha sido fijado :"+ valorDeVenta);

    }
}
