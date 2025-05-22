package com.example.spacego.service;

import com.example.spacego.entity.SpaceData;
import com.example.spacego.repo.RepositorySpace;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceService {

    @Autowired
    RepositorySpace repositorySpace;

    String name = "NASA";

    public List<SpaceData> getAll(){
        return repositorySpace.findAll();
    }

    public List<SpaceData> getOrgWise(String orgName){
        name = orgName;
        return repositorySpace.findByOrganizationContainingIgnoreCase(orgName);
    }



    @PostConstruct
    public void testRepository() {
        List<SpaceData> missions = repositorySpace.findByOrganizationContainingIgnoreCase(name);
        System.out.println("Missions count: " + missions.size());
        for (SpaceData item:missions
             ) {
            System.out.println(item.getMissionName() + "   " + item.getOrganization());
        }
    }



}
