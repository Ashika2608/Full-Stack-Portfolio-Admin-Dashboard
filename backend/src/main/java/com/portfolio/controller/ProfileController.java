package com.portfolio.controller;

import com.portfolio.UserProfile;
import com.portfolio.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin(origins = "*")
public class ProfileController {

    @Autowired
    private UserProfileRepository profileRepository;

    @GetMapping
    public ResponseEntity<UserProfile> getProfile() {
        // Idhula sariya 1L nu fix panniyachu pa!
        Optional<UserProfile> profile = profileRepository.findById(1L);
        return profile.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/save")
    public ResponseEntity<UserProfile> saveProfile(@RequestBody UserProfile userProfile) {
        // Idhulaiyum 1L nu fix panniyachu!
        userProfile.setId(1L);
        
        if (userProfile.getSkills() != null) {
            userProfile.getSkills().forEach(skill -> skill.setUserProfile(userProfile));
        }
        if (userProfile.getProjects() != null) {
            userProfile.getProjects().forEach(project -> project.setUserProfile(userProfile));
        }

        UserProfile savedProfile = profileRepository.save(userProfile);
        return ResponseEntity.ok(savedProfile);
    }
}