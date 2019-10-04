package ru.asterra.xrdefecto.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.asterra.xrdefecto.entities.Material;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Tube implements Serializable {

    private static final long serialVersionUID = 8935706401914106017L;

    //Выяснить про маркировку труб
//    @Column(name = "title")
//    private String title;

    private Material material;
    private Double wallThickness;
    private Double diameter;

    public Tube(Material material, Double wallThickness, Double diameter) {
        this.material = material;
        this.wallThickness = wallThickness;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "material=" + material +
                ", wallThickness=" + wallThickness +
                ", diameter=" + diameter +
                '}';
    }
}
