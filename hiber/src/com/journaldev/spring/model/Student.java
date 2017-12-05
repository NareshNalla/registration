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
@Table(name = "STUDENT_INFO", schema = "test")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
	
/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", email_adr=" + email_adr + ", mobl_nm=" + mobl_nm + ", colg_nm=" + colg_nm + ", colg_join_year="
				+ colg_join_year + ", adr_ln1=";
	}
	/*	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "student_id_seq")
	@SequenceGenerator(name="student_id_seq",sequenceName="S_ID_SEQ")
	@Column(name = "S_ID", unique=true, nullable=false)*/
	@Id
	@Column(name="S_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	
	/*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "COLLEGE_INFO", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })
 */
	@Column(name = "FST_NM", nullable = true)
	private String firstName; 
	
	@Column(name = "LST_NM", nullable = true)
	private String lastName; 
	
	@Column(name = "GDR_CD", nullable = true)
	private String gender; 
	
	@Column(name = "EMAIL_ADR", nullable = true)
	private String email_adr; 
	
	@Column(name = "MOBL_NM", nullable = true)
	private String mobl_nm; 
	
	@Column(name = "COLG_NM", nullable = true)
	private String colg_nm; 
	
	@Column(name = "COLG_JOIN_YEAR", nullable = true)
	private String colg_join_year; 
	
	/*@Column(name = "ADR_LN1", nullable = true)
	private String adr_ln1; 
	
	@Column(name = "ADR_LN2", nullable = true)
	private String adr_ln2; 
	
	@Column(name = "ADR_ID", nullable = true)
	private String adr_id;
	
	@Column(name = "UNIV_ID", nullable = true)
	private String univ_id;
	
	@Column(name = "COURSE_ID", nullable = true)
	private String course_id;
	
	String LOGIN_DT;
	String BROWS_NM;*/
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the email_adr
	 */
	public String getEmail_adr() {
		return email_adr;
	}
	/**
	 * @param email_adr the email_adr to set
	 */
	public void setEmail_adr(String email_adr) {
		this.email_adr = email_adr;
	}
	/**
	 * @return the mobl_nm
	 */
	public String getMobl_nm() {
		return mobl_nm;
	}
	/**
	 * @param mobl_nm the mobl_nm to set
	 */
	public void setMobl_nm(String mobl_nm) {
		this.mobl_nm = mobl_nm;
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
	/**
	 * @return the colg_join_year
	 */
	public String getColg_join_year() {
		return colg_join_year;
	}
	/**
	 * @param colg_join_year the colg_join_year to set
	 */
	public void setColg_join_year(String colg_join_year) {
		this.colg_join_year = colg_join_year;
	}
	/**
	 * @return the adr_ln1
	 */
	/*public String getAdr_ln1() {
		return adr_ln1;
	}
	*//**
	 * @param adr_ln1 the adr_ln1 to set
	 *//*
	public void setAdr_ln1(String adr_ln1) {
		this.adr_ln1 = adr_ln1;
	}
	*//**
	 * @return the adr_ln2
	 *//*
	public String getAdr_ln2() {
		return adr_ln2;
	}
	*//**
	 * @param adr_ln2 the adr_ln2 to set
	 *//*
	public void setAdr_ln2(String adr_ln2) {
		this.adr_ln2 = adr_ln2;
	}
	*//**
	 * @return the adr_id
	 *//*
	public String getAdr_id() {
		return adr_id;
	}
	*//**
	 * @param adr_id the adr_id to set
	 *//*
	public void setAdr_id(String adr_id) {
		this.adr_id = adr_id;
	}
	*//**
	 * @return the univ_id
	 *//*
	public String getUniv_id() {
		return univ_id;
	}
	*//**
	 * @param univ_id the univ_id to set
	 *//*
	public void setUniv_id(String univ_id) {
		this.univ_id = univ_id;
	}
	*//**
	 * @return the course_id
	 *//*
	public String getCourse_id() {
		return course_id;
	}*/
	/**
	 * @param course_id the course_id to set
	 */
	/*public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	*/
 
 /*   private int id;
     private Set<College> courses;*/
 
 /*   @Id
    @GeneratedValue
    @Column(name = "ID")
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 */
 /*   @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })
    public Set<College> getCourses() {
        return courses;
    }
 
    public void setCourses(Set<College> courses) {
        this.courses = courses;
    }
 
 */
	
 /*   @Version
    @Column(name = "VERSION", nullable = true)
    public int getVersion() {
        return version;
    }
 
    public void setVersion(int version) {
        this.version = version;
    }
 */
	
	
}