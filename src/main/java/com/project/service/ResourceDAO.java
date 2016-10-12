package com.project.service;

/**
 *  To perform database interaction for only users
 * @author Pratap Singh Ranawat and Vivek Mittal
 */

import javax.transaction.Transactional;

//import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.ResourcesModel;

import com.project.model.ResourcesVO;

import java.util.List;
@Repository("resourceDAO")
@Transactional
public class ResourceDAO {

	
	//To create a session for the database operation
		@Autowired
		private SessionFactory sessionFactory;

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		
		
		@SuppressWarnings("unchecked")
		public List<ResourcesVO> allResourceList(){
			
		 Session session = sessionFactory.openSession();
			
			
			//Getting the result
			return session.createCriteria(ResourcesModel.class).list();
		}
		
		/*public ResourcesVO getResourceById(){
			
			 Session session = sessionFactory.openSession();
				
				
				//Getting the result 
				return session.createCriteria(ResourcesModel.class).list(); //working on it
			}*/
}