package com.project.service;

/**
 *  To perform database interaction for only users
 * @author Vivek Mittal
 */

import javax.transaction.Transactional;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.project.model.BookingsModel;
import com.project.model.BookingsVO;

@Repository("bookingsDAO")
@Transactional
public class BookingsDAO {

	// To create a session for the database operation
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Following function fires query to database to get the required result(i.e
	 * get all the pending bookings )
	 * 
	 * @return List of bookings having status = pending
	 */
	public List<BookingsVO> pendingBookingsList() {

		Session session = this.sessionFactory.getCurrentSession();

		Criteria cr = session.createCriteria(BookingsModel.class);
		cr.add(Restrictions.eq("status", "pending"));
		cr.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

		@SuppressWarnings("unchecked")
		List<BookingsVO> results = cr.list();
		System.out.println(results.size());
		// Getting the result
		return results;
	}
}
