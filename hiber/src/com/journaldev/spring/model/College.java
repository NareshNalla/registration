package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COLLEGE_INFO")
public class College {
	
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "COLG_ID")
	    private int adr_id;
	    
	    @Column(name = "VLGE", nullable = false)
	    private String vellage;
	    
	    @Column(name = "MNDL", nullable = false)
	    private String mandal;
	    
	    @Column(name = "DISTRICT", nullable = false)
	    private String district;
	    
		
	    
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

		
	
	}
	