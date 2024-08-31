package io.ppmtoolproject.demo.services;

import io.ppmtoolproject.demo.domain.Project;
import io.ppmtoolproject.demo.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        //Logic

        return projectRepository.save(project);
    }
}
