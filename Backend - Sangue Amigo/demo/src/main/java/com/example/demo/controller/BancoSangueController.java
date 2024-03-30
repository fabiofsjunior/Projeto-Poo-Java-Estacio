package com.example.demo.controller;

import com.example.demo.model.BancoSangueEntity;
import com.example.demo.service.BancoSangueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class BancoSangueController {

    @Autowired
    private BancoSangueService bancoSangueService;

    @GetMapping("/api/bancosangue")
    public List<BancoSangueEntity> buscarBancoSangue() {
        return bancoSangueService.listarBancoSangue();
    }
}
