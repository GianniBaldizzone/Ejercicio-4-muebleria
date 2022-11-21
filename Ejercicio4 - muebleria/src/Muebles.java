public class Muebles {
    private double precio;
    private String nombre;
    private int cantidadDeCuotas;

    private TicketDeReserva reserva;

    public Muebles(double precio, String nombre, int cantidadDeCuotas) {
        this.setPrecio(precio);
        this.setNombre(nombre);
        this.setCantidadDeCuotas(cantidadDeCuotas);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public TicketDeReserva getReserva() {
        return reserva;
    }

    public void setReserva(TicketDeReserva reserva) {
        this.reserva = reserva;
    }
}
