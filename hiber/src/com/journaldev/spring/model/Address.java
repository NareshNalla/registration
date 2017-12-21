package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PersistenceUnit;
import javax.persistence.Table;
	 
	@Entity
	@PersistenceUnit
	@Table(name = "ADR_INFO", schema = "test")
	public class Address {
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "adr_id")
	    
	    private int adr_id;
	    
	    @Column(name = "S_ID", nullable = true)
	    private int sid;
	    
	    
	    @Column(name = "ADR_LN1", nullable = true)
	    private String adr_ln1;
	    
	    @Column(name = "ADR_LN2", nullable = true)
	    private String adr_ln2;
	    
	    
	    @Column(name = "VLGE", nullable = true)
	    private String vellage;
	    
	    @Column(name = "MNDL", nullable = true)
	    private String mandal;
	    
	    @Column(name = "DISTRICT", nullable = true)
	    private String district;
	    
	    @Column(name = "STATE", nullable = true)
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
		 * @return the sid
		 */
		public int getSid() {
			return sid;
		}

		/**
		 * @param sid the sid to set
		 */
		public void setSid(int sid) {
			this.sid = sid;
		}

		/**
		 * @return the adr_ln1
		 */
		public String getAdr_ln1() {
			return adr_ln1;
		}

		/**
		 * @param adr_ln1 the adr_ln1 to set
		 */
		public void setAdr_ln1(String adr_ln1) {
			this.adr_ln1 = adr_ln1;
		}

		/**
		 * @return the adr_ln2
		 */
		public String getAdr_ln2() {
			return adr_ln2;
		}

		/**
		 * @param adr_ln2 the adr_ln2 to set
		 */
		public void setAdr_ln2(String adr_ln2) {
			this.adr_ln2 = adr_ln2;
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

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Address [adr_id=" + adr_id + ", sid=" + sid + ", adr_ln1=" + adr_ln1 + ", adr_ln2=" + adr_ln2
					+ ", vellage=" + vellage + ", mandal=" + mandal + ", district=" + district + ", state=" + state
					+ "]";
		}
	    
	    
	    
	    
	   
	
	     
	}