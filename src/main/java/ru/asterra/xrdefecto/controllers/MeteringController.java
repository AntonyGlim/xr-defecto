package ru.asterra.xrdefecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.asterra.xrdefecto.entities.XRayMachine;
import ru.asterra.xrdefecto.services.XRayMachineService;

@Controller
@RequestMapping("/metering")
public class MeteringController {

    private XRayMachineService xRayMachineService;

    @Autowired
    public void setxRayMachineService(XRayMachineService xRayMachineService) {
        this.xRayMachineService = xRayMachineService;
    }

    @GetMapping()
    public String showMetering(Model model){
        XRayMachine xRayMachine = xRayMachineService.findOneByTitle("RIX 300 VC2");
        model.addAttribute("xRayMachine", xRayMachine);
        return "metering";
    }
}
