package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PersistenceUnit;
import javax.persistence.Table;


@Entity
@PersistenceUnit
@Table(name = "COLLEGE_INFO", schema = "test")
public class College {
	
	 	@Id	
	    @GeneratedValue
	    @Column(name = "COLG_ID")
	    private int colg_id;
	 	
	 	@Column(name="S_ID")
		int sid;
		
		@Column(name = "UNIV_NM", nullable = true)
		private String univ_nm;
		
		@Column(name = "COLG_NM", nullable = true)
		private String colg_nm;

		/**
		 * @return the colg_id
		 */
		public int getColg_id() {
			return colg_id;
		}

		/**
		 * @param colg_id the colg_id to set
		 */
		public void setColg_id(int colg_id) {
			this.colg_id = colg_id;
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
		 * @return the univ_nm
		 */
		public String getUniv_nm() {
			return univ_nm;
		}

		/**
		 * @param univ_nm the univ_nm to set
		 */
		public void setUniv_nm(String univ_nm) {
			this.univ_nm = univ_nm;
		}

		/**
		 * @return the colg_nm
		 */
		public String getColg_nm() {
			return colg_nm;
		}

		/**
		 * @param colg_nm the colg_nm to set
		 */
		public void setColg_nm(String colg_nm) {
			this.colg_nm = colg_nm;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "College [colg_id=" + colg_id + ", sid=" + sid + ", univ_nm=" + univ_nm + ", colg_nm=" + colg_nm
					+ "]";
		} 
			
	
	}
	