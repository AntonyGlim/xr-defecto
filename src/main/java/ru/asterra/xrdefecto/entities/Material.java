package ru.asterra.xrdefecto.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "materials")
@Data
@NoArgsConstructor
public class Material implements Serializable {

    private static final long serialVersionUID = 2915675358710833720L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "max_allowable_voltage")
    private Double maxAllowableVoltage;

    public Material(String title, Double maxAllowableVoltage) {
        this.title = title;
        this.maxAllowableVoltage = maxAllowableVoltage;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", maxAllowableVoltage=" + maxAllowableVoltage +
                '}';
    }
}
