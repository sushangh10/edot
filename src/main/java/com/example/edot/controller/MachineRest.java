package com.example.edot.controller;

import com.example.edot.bean.Machine;
import com.example.edot.repo.MachineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.Mac;

/**
 * @Author sushanghai
 * @Date 2021/8/19
 */
@RestController
@RequestMapping(path = "/api/v1/machine")
public class MachineRest {

    @Autowired
    private MachineRepo machineRepo;

    @GetMapping("/findAll")
    public @ResponseBody Iterable<Machine> getAllMachines() {
        return machineRepo.findAll();
    }

}
