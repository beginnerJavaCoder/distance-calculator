package com.example.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "city")
public class City extends Model {

    private String name;
    @JsonIgnore
    private Double latitude;
    @JsonIgnore
    private Double longitude;
    @OneToMany(mappedBy = "from", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnore
    private List<Distance> fromCityDistances;
    @OneToMany(mappedBy = "to", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnore
    private List<Distance> toCityDistances;

    public City() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<Distance> getFromCityDistances() {
        return fromCityDistances;
    }

    public void setFromCityDistances(List<Distance> fromCityDistances) {
        this.fromCityDistances = fromCityDistances;
    }

    public List<Distance> getToCityDistances() {
        return toCityDistances;
    }

    public void setToCityDistances(List<Distance> toCityDistances) {
        this.toCityDistances = toCityDistances;
    }
}
