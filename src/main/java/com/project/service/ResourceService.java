package com.project.service;

/**
 * Class To implement the service layer for the Users
 * @author Pratap Singh Ranawat and Vivek Mittal
 */

import java.util.List;

import javax.transaction.Transactional;

//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;



//import com.project.model.ResourcesModel;
import com.project.model.ResourcesVO;

@Service("resourceService")
@Transactional
public class ResourceService {

	@Autowired
	private ResourceDAO resourceDAO;
	
	//To get the beans
	@Autowired
	private ApplicationContext context;
	
	/**
	 * To validate the custom login credentials
	 * @param resourcesVO - The User VO containing the credentials for login
	 * @return - True if the credentials are correct else false
	 */
	public List<ResourcesVO> allResourceList() {
		return resourceDAO.allResourceList();
			
	}
}