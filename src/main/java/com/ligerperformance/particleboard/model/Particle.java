/**
 * 
 */
package com.ligerperformance.particleboard.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author mayorcurley
 *
 */
@Entity
public class Particle implements Serializable {

    private static final long serialVersionUID = 7531796121771176808L;
    
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer particleId;
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private Double mass;
    @Column
    private String charge;
    @Column
    private String spin;
    
    public Particle() {
        
    }
    
    public Particle(Integer particleId, String name, String type, Double mass, String charge, String spin) {
        super();
        this.particleId = particleId;
        this.name = name;
        this.type = type;
        this.mass = mass;
        this.charge = charge;
        this.spin = spin;
    }
    
    public Integer getParticleId() {
        return particleId;
    }
    public void setParticleId(Integer particleId) {
        this.particleId = particleId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Double getMass() {
        return mass;
    }
    public void setMass(Double mass) {
        this.mass = mass;
    }
    public String getCharge() {
        return charge;
    }
    public void setCharge(String charge) {
        this.charge = charge;
    }
    public String getSpin() {
        return spin;
    }
    public void setSpin(String spin) {
        this.spin = spin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((charge == null) ? 0 : charge.hashCode());
        result = prime * result + ((mass == null) ? 0 : mass.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((particleId == null) ? 0 : particleId.hashCode());
        result = prime * result + ((spin == null) ? 0 : spin.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Particle other = (Particle) obj;
        if (charge == null) {
            if (other.charge != null)
                return false;
        } else if (!charge.equals(other.charge))
            return false;
        if (mass == null) {
            if (other.mass != null)
                return false;
        } else if (!mass.equals(other.mass))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (particleId == null) {
            if (other.particleId != null)
                return false;
        } else if (!particleId.equals(other.particleId))
            return false;
        if (spin == null) {
            if (other.spin != null)
                return false;
        } else if (!spin.equals(other.spin))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Particle [particleId=" + particleId + ", name=" + name + ", type=" + type + ", mass=" + mass
                + ", charge=" + charge + ", spin=" + spin + "]";
    }
    
}
