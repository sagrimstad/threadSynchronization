# Report threadSynchronization

When running the program. Every ticket buyer get information that 10 tickets are available for the movie. After 
that every user books tickets only 3 of them got the tickets. That means we have a problem, we are providing false 
information to the user.  

To resolve this issue we add the keyword synchronized in front of "void bookTicket". The problem is now solved, the user
aren't getting false information about the availability for the tickets anymore. The last user purchasing tickets get 
information about the available tickets and that there isn't enough. 

