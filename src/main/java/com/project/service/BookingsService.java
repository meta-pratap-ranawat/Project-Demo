package com.project.service;

/**
 * Class To implement the service layer for the Users
 * @author Vivek Mittal
 */

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import com.project.model.BookingsVO;

@Service("bookingsService")
@Transactional
public class BookingsService {

	@Autowired
	private BookingsDAO bookingsDAO;
	
	//To get the beans
	@Autowired
	private ApplicationContext context;
	
	/**
	 * To get the list of pending bookings
	 * @return List of bookings having status = pending
	 */
	public List<BookingsVO> pendingBookingsList() {
		return bookingsDAO.pendingBookingsList();	
	}
}
