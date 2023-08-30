package com.assignment2.app;

public class SeatReservation {

	String[] arrTrainId = new String[] { "T101", "T102", "T103", "T104", "T105" };
	String[] arrTrainName = new String[] { "Ananthapuri Express",
			"Guruvayur Express", "TVM-Trichy Intercity Express",
			"Kanyakumari Express", "Mumbai Express" };

	String passengerName;
	String trainName;
	String trainId;
	String out;

	SeatReservation(String pName, String tName) {
		this.passengerName = pName;
		this.trainName = tName;
	}

	public String checkReservation() {
		for (int i = 0; i <= arrTrainName.length - 1; i++) {
			if (this.trainName.contains(arrTrainName[i])) {
				this.trainId = arrTrainId[i];
				this.out = "TrainId: "+this.trainId+", TrainName: "+this.trainName+", PassengerName: "+this.passengerName+", Status: Seat Confirmed";
				return this.out;
			}
		}
		return "Status: Seat Not Confirmed";

	}

}
