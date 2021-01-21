package com.backyard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.backyard.beans.BackyardResponseBean;
import com.backyard.entity.Activity;
import com.backyard.service.ActivitiesService;

@RestController
public class ActivitiesController {
		
	@Autowired
	public ActivitiesService activitiesService;
	
	@GetMapping("/activities")
	@ResponseStatus(HttpStatus.OK)
	public BackyardResponseBean getActivities() {
		return BackyardResponseBean.builder().activities(activitiesService.getAllActivities()).build();
	}
	
	@GetMapping("/activity/{activityId}")
	@ResponseStatus(HttpStatus.OK)
	public BackyardResponseBean getActivity(@PathVariable Long activityId) {
		return BackyardResponseBean.builder().activity(activitiesService.getActivity(activityId)).build();
	}
	
	@PostMapping("/activity")
	@ResponseStatus(HttpStatus.CREATED)
	public BackyardResponseBean createActivities(@RequestBody Activity activity) {
		activitiesService.saveActivity(activity);
		return BackyardResponseBean.builder().statusMessage("Activity created successfully").build();	
	}
	
	@PatchMapping("/activity/{activityId}")
	public BackyardResponseBean updateActivities(@PathVariable Long activityId,@RequestBody Activity activity) {
		activity.setId(activityId);
		activitiesService.saveActivity(activity);
		return BackyardResponseBean.builder().statusMessage("Activity updated successfully").build();
		
	}
	
	@DeleteMapping("/activity/{activityId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteActivities(@PathVariable Long activityId) {
		activitiesService.deleteActivity(activityId);
		
	}

}
