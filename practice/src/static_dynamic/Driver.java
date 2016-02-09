package static_dynamic;

public class Driver 
{

	public static void main(String[] args) 
	{
	
		new ParkingTicket(50);
		new ParkingTicket(50);
		new ParkingTicket(50);
		new ParkingTicket(50);
		new ParkingTicket(50);
		
		int totalTickets = ParkingTicket.ticketsIssued;
		System.out.println(totalTickets);
	}

}
