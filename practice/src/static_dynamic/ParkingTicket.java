package static_dynamic;

public class ParkingTicket 
{
	
	int ticketAmount;
	static int ticketsIssued = 0;
	
	public ParkingTicket(int ticketAmount){
		this.ticketAmount = ticketAmount;
		ticketsIssued++;
	}
	
	public static int getTicketsIssued(){
		return ticketsIssued;
	}
	

}
//class poops out instances
//static - don't know anything about instances , need a non-static method to call methods of an instance
//classname.staticvar  classname.staticmethod
//instances share behavior but not state
