import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class TicketDeReserva {
    private String fechaDeReserva;
    private String fechaDeExpiracion;
    private ArrayList objetosReservados;
    private double valorDeReserva;
    private String metodoDePago;

    public TicketDeReserva(String fechaDeReserva, String metodoDePago,String fechaDeExpiracion) {
        this.setFechaDeReserva(fechaDeReserva);
        this.setFechaDeExpiracion(fechaDeExpiracion);
        this.setObjetosReservados(new ArrayList<Muebles>(0));
        this.setValorDeReserva(0);
        this.setMetodoDePago(metodoDePago);
    }

    public String getFechaDeReserva() {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(String fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }

    public String getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }

    public void setFechaDeExpiracion(String fechaDeExpiracion) {
        this.fechaDeExpiracion = fechaDeExpiracion;
    }

    public ArrayList<Muebles> getObjetosReservados() {
        return objetosReservados;
    }

    public void setObjetosReservados(ArrayList<Muebles> objetosReservados) {
        this.objetosReservados = objetosReservados;
    }

    public double getValorDeReserva() {
        return valorDeReserva;
    }

    public void setValorDeReserva(double valorDeReserva) {
        this.valorDeReserva = valorDeReserva;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
    public void agregarProductosReservados(Muebles objetosReservados){
        getObjetosReservados().add(objetosReservados);
        System.out.println("su objeto fue agregado a la reserva");
    }
    public void removerProductosReservados(Muebles objetosReservados){
        getObjetosReservados().add(objetosReservados);
    }
    public void fijarPrecioReserva(double valorDeReserva){
        this.valorDeReserva = 0;
        for(int i=0;i<objetosReservados.size();i++){
            valorDeReserva = valorDeReserva + objetosReservados.get(i).getPrecio();
        }
        this.valorDeReserva = valorDeReserva;
        System.out.println("su precio ha sido fijado :"+ valorDeReserva);

    }
    public void generarTicketReserva(){
        JOptionPane.showMessageDialog(null,"La venta ha finalizado" +
                "\n*** Resumen ***"+
                "\nFecha de compra: "+this.getFechaDeReserva()+
                "\nValor de venta: "+this.getValorDeReserva()+
                "\nMetodo de pago: "+this.getMetodoDePago()

        );
        System.out.println("La venta ha finalizado" +
                "\n*** Resumen ***"+
                "\nFecha de reserva: "+this.getFechaDeReserva()+
                "\nFecha de expiración: "+this.getFechaDeExpiracion()+
                "\nValor de reserva: "+this.getValorDeReserva()+
                "\nMetodo de pago: "+this.getMetodoDePago());
    }
}
