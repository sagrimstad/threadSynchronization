
package no.nntu.booking;

public class MovieTicketClient extends Thread {
  private String customerName;
  private int numberOfTickets;
  private MovieTicketServer server;

  public MovieTicketClient(MovieTicketServer server, String customerName, int numberOfTickets) {
    this.customerName = customerName;
    this.numberOfTickets = numberOfTickets;
    this.server = server;
    //TODO: TBD
  }

  public void run() {
    server.bookTicket(customerName, numberOfTickets);
    //TODO: TBD
  }

}
