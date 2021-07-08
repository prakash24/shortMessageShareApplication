package com.prakash.interview.model;

public class Trip {

	enum TripStatus {
		INPROGRESS,
		COMPLETED
	}
	private int id;
	private DateTime startTime;
	private DateTime endTime;
	private TripStatus status;
}
