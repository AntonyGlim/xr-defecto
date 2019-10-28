package ru.asterra.xrdefecto.dto;

import ru.asterra.xrdefecto.entities.XRayMachine;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

public class XRayMachineDTO implements Serializable {

    private static final long serialVersionUID = -839752539582400364L;

    private Integer id;

    private String title;

    private Double focalHeel; //Фокусное пяткно

    private Double minVoltage; //Минимальное напряжение

    private Double maxVoltage; //Максимальное напряжение

    private Double minCurrent; //Минимальный ток

    private Double maxCurrent; //Максимальный ток

    private Double sourceWindowDistance; //Расстояние источник-окно

    private String image;

    private List allParameters;

    public XRayMachineDTO(XRayMachine xRayMachine) {
        allParameters.add(this.title = xRayMachine.getTitle());
        allParameters.add(this.focalHeel = xRayMachine.getFocalHeel());
        allParameters.add(this.minVoltage = xRayMachine.getMinVoltage());
        allParameters.add(this.maxVoltage = xRayMachine.getMaxVoltage());
        allParameters.add(this.minCurrent = xRayMachine.getMinCurrent());
        allParameters.add(this.maxCurrent = xRayMachine.getMaxCurrent());
        allParameters.add(this.sourceWindowDistance = xRayMachine.getSourceWindowDistance());
        allParameters.add(this.image = xRayMachine.getImage());
    }
}
