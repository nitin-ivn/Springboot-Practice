package com.nitin.JobApp.service;

import com.nitin.JobApp.model.JobPost;
import com.nitin.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void add(JobPost job){
        repo.addJob(job);
    }

    public List<JobPost> getJobs(){
        return repo.getAllJobs();
    }
}
