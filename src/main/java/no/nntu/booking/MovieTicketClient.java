package no.nntu.booking;

public class MovieTicketClient extends Thread {
  private String customerName;
  private int numberOfTickets;
  private MovieTicketServer server;

  public MovieTicketClient(MovieTicketServer server, String customerName, int numberOfTickets) {
    this.server = server;
    this.customerName = customerName;
    this.numberOfTickets = numberOfTickets;
    //TODO: TBD
  }

  public void run() {
    //TODO: TBD
  }

}
