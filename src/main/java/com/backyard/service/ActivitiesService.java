package com.backyard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backyard.beans.ActivityBean;
import com.backyard.entity.Activity;
import com.backyard.repository.ActivitiesRespository;

@Service
public class ActivitiesService {
	
	@Autowired
	public ActivitiesRespository activitiesRespository;
	
	public List<ActivityBean> getAllActivities(){
		 List<ActivityBean> activityBeanList  = new ArrayList<ActivityBean>();
		 List<Activity> activityDAObeanList =  activitiesRespository.findAll();
		 
		 for (Activity activity : activityDAObeanList) {
			 ActivityBean activityBean = new ActivityBean();
			 BeanUtils.copyProperties(activity, activityBean);
			 activityBeanList.add(activityBean);
		}
		return activityBeanList;
	}
	
	public ActivityBean getActivity(Long activityId){
		 Activity activity =  activitiesRespository.findById(activityId).get();
		 ActivityBean activityBean = new ActivityBean();
		 BeanUtils.copyProperties(activity, activityBean);
		 return activityBean;
	}
	
	public Activity saveActivity(Activity activity){
		 return activitiesRespository.save(activity);
	}
	
	public void deleteActivity(Long activityId){
		 activitiesRespository.deleteById(activityId);
	}

}
