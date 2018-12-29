package com.mindtree.zzzzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.zzzzz.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
