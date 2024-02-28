package no.nntu.booking;

public class MovieTicketServer {
  private String movie;
  private int availableSeats;

  public MovieTicketServer(String movie, int availableSeats) {
    this.movie = movie;
    this.availableSeats = availableSeats;
  }

  public synchronized void bookTicket(String customerName, int numberOfSeats ) {
    System.out.println("Hi, " + customerName + " "
        + availableSeats + " Seats available for " + movie);
    if((availableSeats - numberOfSeats) < 0) {
      System.out.println("Hi," + customerName + " : Number of seats "
          + numberOfSeats + " ordered is not available for " + movie);
    } else {
      availableSeats -= numberOfSeats;
      System.out.println("Hi," + customerName + " " + numberOfSeats
          + " Seats booked successfully for " + movie);
    }
  }

}

