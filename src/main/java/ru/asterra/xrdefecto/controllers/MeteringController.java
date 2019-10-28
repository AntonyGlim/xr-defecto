package ru.asterra.xrdefecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.asterra.xrdefecto.dto.XRayMachineDTO;
import ru.asterra.xrdefecto.entities.Material;
import ru.asterra.xrdefecto.entities.XRayMachine;
import ru.asterra.xrdefecto.services.MaterialService;
import ru.asterra.xrdefecto.services.XRayMachineService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/metering")
public class MeteringController {

    private XRayMachineService xRayMachineService;
    private MaterialService materialService;

    @Autowired
    public void setXRayMachineService(XRayMachineService xRayMachineService) {
        this.xRayMachineService = xRayMachineService;
    }

    @Autowired
    public void setMaterialService(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping()
    public String showMetering(Model model){
        XRayMachine xRayMachine = xRayMachineService.findOneByTitle("RIX 300 VC2");
        List<XRayMachine> xRayMachines = xRayMachineService.findAll();
        List<XRayMachineDTO> xRayMachinesDTO = new ArrayList<>();
        for (XRayMachine xrm : xRayMachines) {
            xRayMachinesDTO.add(new XRayMachineDTO(xrm));
        }
        List<Material> materials = materialService.findAll();
        model.addAttribute("xRayMachines", xRayMachinesDTO);
        model.addAttribute("xRayMachine", xRayMachine);
        model.addAttribute("materials", materials);
        return "metering";
    }
}
