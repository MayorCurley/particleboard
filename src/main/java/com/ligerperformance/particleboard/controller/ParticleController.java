package com.ligerperformance.particleboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParticleController {
    @RequestMapping("/particle")
    public String home() {
        return "particle";
    }
}
