package com.example.springdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springmodels.Course;

@Repository
public interface courseDao extends JpaRepository<Course,Long>{}
