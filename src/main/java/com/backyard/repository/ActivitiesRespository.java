package com.backyard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backyard.entity.Activity;


public interface ActivitiesRespository extends JpaRepository<Activity, Long> {

}
