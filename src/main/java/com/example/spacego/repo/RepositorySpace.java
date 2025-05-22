package com.example.spacego.repo;

import com.example.spacego.entity.SpaceData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorySpace extends JpaRepository<SpaceData, Integer> {
    List<SpaceData> findByOrganizationContainingIgnoreCase(String organisationName);
}
