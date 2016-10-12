package com.project.service;

/**
 * Class to provide a single API for the database interaction with the controllers
 * @author Pratap Singh Ranawat and Vivek Mittal
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.project.model.ResourcesVO;

@Service("resourceFacade")
public class ResourceFacade {

	@Autowired
	private ResourceService resourceService;
	
	@Autowired
	private ApplicationContext context;	//To get the beans
	
	/**
	 * To validate the custom login user credentials
	 * @param userVO - The User VO containing the credentials
	 * @return - True if the credentials are right else false
	 */
	public List<ResourcesVO> allResourceList() {
		return resourceService.allResourceList();
	}
	
}