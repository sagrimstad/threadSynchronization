package no.nntu;

import no.nntu.booking.MovieTicketClient;
import no.nntu.booking.MovieTicketServer;

public class Main {

  public static void main(String[] args) {
    MovieTicketServer server = new MovieTicketServer("Troll", 10);

    Thread t1 = new MovieTicketClient(server, "Bernt", 3);
    Thread t2 = new MovieTicketClient(server, "Kåre", 2);
    Thread t3 = new MovieTicketClient(server, "Kjell", 3);
    Thread t4 = new MovieTicketClient(server, "Magne", 4);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}