package com.example.springdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmodels.Course;

public interface courseDao extends JpaRepository<Course,Long>{}
