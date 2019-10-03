package ru.asterra.xrdefecto.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "x_ray_machines")
@Data
@NoArgsConstructor
public class XRayMachine implements Serializable {

    private static final long serialVersionUID = 5688674053386137466L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "focal_heel")
    private Double focalHeel; //Фокусное пяткно

    @Column(name = "min_voltage")
    private Double minVoltage; //Минимальное напряжение

    @Column(name = "max_voltage")
    private Double maxVoltage; //Максимальное напряжение

    @Column(name = "min_current")
    private Double minCurrent; //Минимальный ток

    @Column(name = "max_current")
    private Double maxCurrent; //Максимальный ток

    @Column(name = "source_window_distance")
    private Double sourceWindowDistance; //Расстояние источник-окно

    @Column(name = "image")
    private String image;

    public XRayMachine(String title, Double focalHeel, Double minVoltage, Double maxVoltage, Double minCurrent, Double maxCurrent, Double sourceWindowDistance, String image) {
        this.title = title;
        this.focalHeel = focalHeel;
        this.minVoltage = minVoltage;
        this.maxVoltage = maxVoltage;
        this.minCurrent = minCurrent;
        this.maxCurrent = maxCurrent;
        this.sourceWindowDistance = sourceWindowDistance;
        this.image = image;
    }

    @Override
    public String toString() {
        return "XRayMachine{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", focalHeel=" + focalHeel +
                ", minVoltage=" + minVoltage +
                ", maxVoltage=" + maxVoltage +
                ", minCurrent=" + minCurrent +
                ", maxCurrent=" + maxCurrent +
                ", sourceWindowDistance=" + sourceWindowDistance +
                '}';
    }
}
