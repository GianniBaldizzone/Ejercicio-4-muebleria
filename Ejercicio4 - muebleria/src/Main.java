public class Main {
    public static void main(String[] args) {

        Muebles televisor = new Muebles(30000,
                "Televisor HD 4K",
                12);
        Muebles silla = new Muebles(10000,
                "Silla Gamer",
                3);
        Muebles ventilador = new Muebles(40000,
                "Ventilador",
                3);
        Muebles cama = new Muebles(1000000,
                "Cama de diamantes",18
                );

        TicketDeVenta ticket = new TicketDeVenta("03-06-2022",
                "Efectivo");
        ticket.agregarProductos(televisor);
        ticket.agregarProductos(silla);
        ticket.agregarProductos(ventilador);
        ticket.fijarPrecio(ticket.getValorDeVenta());
        ticket.generarTicket();

        TicketDeReserva ticketReserva = new TicketDeReserva("03-06-2022",
                "Efectivo","03-07-2022");
        ticketReserva.agregarProductosReservados(televisor);
        ticketReserva.agregarProductosReservados(silla);
        ticketReserva.agregarProductosReservados(cama);
        ticketReserva.fijarPrecioReserva(ticketReserva.getValorDeReserva());
        ticketReserva.generarTicketReserva();
    }
}
