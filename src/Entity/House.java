package Entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class House {
    private Integer id;
    private String title;
    private String description;
    private Integer price;
    private Date pubdate;
    private Integer floorage;
    private String contact;
    private Users users;
    private Types types;
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
    @Column(name = "TITLE", nullable = true, length = 150)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 6000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "PRICE", nullable = true)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "PUBDATE", nullable = true)
    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    @Basic
    @Column(name = "FLOORAGE", nullable = true)
    public Integer getFloorage() {
        return floorage;
    }

    public void setFloorage(Integer floorage) {
        this.floorage = floorage;
    }

    @Basic
    @Column(name = "CONTACT", nullable = true, length = 300)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(id, house.id) &&
                Objects.equals(title, house.title) &&
                Objects.equals(description, house.description) &&
                Objects.equals(price, house.price) &&
                Objects.equals(pubdate, house.pubdate) &&
                Objects.equals(floorage, house.floorage) &&
                Objects.equals(contact, house.contact);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, description, price, pubdate, floorage, contact);
    }

    @ManyToOne
    @JoinColumn(name = "USERID", referencedColumnName = "id")

    public void setUsers(Users users) {
        this.users = users;
    }

    @ManyToOne
    @JoinColumn(name = "TYPEID", referencedColumnName = "ID")
    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    @ManyToOne
    @JoinColumn(name = "STREETID", referencedColumnName = "ID")
    public Street getStreets() {
        return streets;
    }

    public void setStreets(Street streets) {
        this.streets = streets;
    }
}
