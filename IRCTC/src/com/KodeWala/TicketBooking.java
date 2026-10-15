package com.KodeWala;

public class TicketBooking {
		public static void main(String [] args) {
			System.out.println("start");
			String type = args[0];
			int noOftickets =Integer.parseInt(args[1]);
			CustomerType(type , noOftickets);
			
			System.out.println("end");
		}
		
		public static void retailBooking(int ticketCount) {
			if(ticketCount<=6) {
				System.out.println("successfully booked"+ticketCount+ "ticket");
			}
			else {
				System.out.println("you can only book maximum 6 tickets in a day");
			}
		}
		
		public static void agentBooking(int ticketCount) {
			System.out.println("successfully booked "+ticketCount+ "tickets");
		}
		
		public static void CustomerType(String type ,int noOftickets ) {
			
			switch (type) {
			case "retail":
				retailBooking(noOftickets);
				break;
			case "agent":
				 agentBooking(noOftickets);
				break;
			default:
				System.out.println("User type not supported");
				break;
			}
		}
}
