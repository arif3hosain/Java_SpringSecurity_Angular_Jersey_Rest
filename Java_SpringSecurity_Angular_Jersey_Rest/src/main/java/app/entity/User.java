package app.entity;

import java.sql.Blob;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import app.domain.SetupCompany;
import app.domain.pms.SetupEmployee;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@javax.persistence.Entity
public class User implements Entity, UserDetails
{

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true, length = 16, nullable = false)
	private String name;

	@Column(length = 80, nullable = false)
	private String password;

//	@NotNull
	@Column(name = "full_name", nullable = true)
	private String fullName;

//	@NotNull
	@Column(name = "last_name", nullable = true)
	private String lastName;


	@Column(name = "email", nullable = true)
	private String eamil;


	@Column(name = "status", nullable = true)
	private int status;

	@Column(name = "lang_key", nullable = true)
	private String langKey;

	@Column(name = "activation_key", nullable = true)
	private String activationKey;

	@Column(name = "reset_key", nullable = true, insertable = false, updatable = false)
	private String resetKey;

	@Column(name = "created_by", nullable = true)
	private Integer createdBy;

	@Column(name = "created_date", nullable = true)
	private Date createdDate;

	@Column(name = "reset_date", nullable = true)
	private Date resetDate;

	@Column(name = "last_modified_by", nullable = true)
	private String lastModifiedBy;

	@Column(name = "last_modified_date", nullable = true)
	private Date lastModifiedDate;

	@Column(name = "address", nullable = true)
	private String address;

	@Column(name = "request_for", nullable = true)
	private String requestFor;

	@Column(name = "gender", nullable = true)
	private String gender;

	@Column(name = "date_of_birth", nullable = true)
	private Date dateOfBirth;

	@Column(name = "phone_number", nullable = true)
	private String phoneNumber;

	@Column(name = "picture", nullable = true)
	private Blob picture;

	@Column(name = "reset_key", nullable = true)
	private Long com_ID;

	@ElementCollection(fetch = FetchType.EAGER)
	private Set<Role> roles = new HashSet<Role>();

//	@ManyToOne
//	@JoinColumn (name = "com_id",nullable = true)
//	private SetupCompany setupCompany;
//
//	@ManyToOne
//	@JoinColumn (name = "emp_id", nullable = true)
//	private SetupEmployee setupEmployee;



	protected User()
	{
		/* Reflection instantiation */
	}

	public User(String name, String passwordHash, String myEmail)
	{
		this.name = name;
		this.password = passwordHash;
		this.eamil=myEmail;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLangKey() {
		return langKey;
	}

	public void setLangKey(String langKey) {
		this.langKey = langKey;
	}

	public String getActivationKey() {
		return activationKey;
	}

	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}

	public String getResetKey() {
		return resetKey;
	}

	public void setResetKey(String resetKey) {
		this.resetKey = resetKey;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getResetDate() {
		return resetDate;
	}

	public void setResetDate(Date resetDate) {
		this.resetDate = resetDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRequestFor() {
		return requestFor;
	}

	public void setRequestFor(String requestFor) {
		this.requestFor = requestFor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}



	public Long getCom_ID() {
		return com_ID;
	}

	public void setCom_ID(Long com_ID) {
		this.com_ID = com_ID;
	}

	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set<Role> getRoles()
	{
		return this.roles;
	}

	public void setRoles(Set<Role> roles)
	{
		this.roles = roles;
	}

	public void addRole(Role role)
	{
		this.roles.add(role);
	}

	@Override
	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities()
	{
		return this.getRoles();
	}

	@Override
	public String getUsername()
	{
		return this.name;
	}

	@Override
	public boolean isAccountNonExpired()
	{
		return true;
	}

	@Override
	public boolean isAccountNonLocked()
	{
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired()
	{
		return true;
	}

	@Override
	public boolean isEnabled()
	{
		return true;
	}
}
