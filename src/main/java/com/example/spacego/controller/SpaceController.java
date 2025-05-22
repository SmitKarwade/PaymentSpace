package com.example.spacego.controller;

import com.example.spacego.entity.SpaceData;
import com.example.spacego.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpaceController {

    @Autowired
    SpaceService spaceService;

    @GetMapping("/missions")
    public List<SpaceData> getData(){
        return  spaceService.getAll();
    }

    @GetMapping("/missions/organizations")
    public List<SpaceData> getOrgData(@RequestParam String organization) {
        return spaceService.getOrgWise(organization);
    }
}
