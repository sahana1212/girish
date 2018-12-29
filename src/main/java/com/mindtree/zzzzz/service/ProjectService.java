package com.mindtree.zzzzz.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.zzzzz.entity.Project;


public interface ProjectService {
	
	public String addProject(Project project);
	
	public Optional<Project> getByProjectId(int projectId);
	
	public List<Project> allProject();
	
	public String updateProject(Project project);
	
	public String deleteProject(int projectId);
}
