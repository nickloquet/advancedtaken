package be.vdab.advancedtaken.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "gemeenten")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Gemeente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private short postcode;
    private String naam;

    public long getId() {
        return id;
    }
    public short getPostcode() {
        return postcode;
    }
    public String getNaam() {
        return naam;
    }
}
