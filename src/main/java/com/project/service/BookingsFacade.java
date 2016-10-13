
package com.project.service;

/**
 * Class to provide a single API for the database interaction with the controllers
 * @author Vivek Mittal
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.project.model.BookingsVO;
@Service("bookingsFacade")
public class BookingsFacade {

	@Autowired
	private BookingsService bookingsService;
	
	@Autowired
	private ApplicationContext context;	//To get the beans
	
	
	/**
	 * To get the list of pending bookings
	 * @return List of bookings having status = pending
	 */
	public List<BookingsVO> pendingBookingsList() {
		return bookingsService.pendingBookingsList();
	}
}
