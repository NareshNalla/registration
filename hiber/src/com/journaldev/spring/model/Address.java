package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
	 
	@Entity
	@Table(name = "ADR_INFO")
	public class Address {
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "adr_id")
	    private int adr_id;
	    
	    @Column(name = "vellage", nullable = false)
	    private String vellage;
	    
	    @Column(name = "mandal", nullable = false)
	    private String mandal;
	    
	    @Column(name = "district", nullable = false)
	    private String district;
	    
	    @Column(name = "state", nullable = false)
	    private String state;
		
	    
	    
	    /**
		 * @return the adr_id
		 */
		public int getAdr_id() {
			return adr_id;
		}
		/**
		 * @param adr_id the adr_id to set
		 */
		public void setAdr_id(int adr_id) {
			this.adr_id = adr_id;
		}
		/**
		 * @return the vellage
		 */
		public String getVellage() {
			return vellage;
		}
		/**
		 * @param vellage the vellage to set
		 */
		public void setVellage(String vellage) {
			this.vellage = vellage;
		}
		/**
		 * @return the mandal
		 */
		public String getMandal() {
			return mandal;
		}
		/**
		 * @param mandal the mandal to set
		 */
		public void setMandal(String mandal) {
			this.mandal = mandal;
		}
		/**
		 * @return the district
		 */
		public String getDistrict() {
			return district;
		}
		/**
		 * @param district the district to set
		 */
		public void setDistrict(String district) {
			this.district = district;
		}
		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}
		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}
	 
	 /* @Id
	    @GeneratedValue
	    @Column(name = "adr_id")
	    public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    @Column(name = "NAME", nullable = false)
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }*/
	 
	       
	     
	}