package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class District {
    private Integer id;
    private String name;
    private Street streets;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 150)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(id, district.id) &&
                Objects.equals(name, district.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    @OneToOne(mappedBy = "districts")
    public Street getStreets() {
        return streets;
    }

    public void setStreets(Street streets) {
        this.streets = streets;
    }
}
