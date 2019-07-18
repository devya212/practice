
import java.util.Date;

public class Customer {
private String customerCode;
private String customerName;
private String customerAddress1;
private String customerAddress2;
private int customerPinCode;
private String email;
private long contactNo;
private String primaryContactPerson;
private String recordStatus;
private String flag;
 Date createDate;
private String createdBy;
Date modifiedDate;
private String modifiedBy;
 Date authorizedDate;
private String authorizedBy;
public String getCustomerCode() {
	return customerCode;
}
public void setCustomerCode(String customerCode) {
	this.customerCode = customerCode;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress1() {
	return customerAddress1;
}
public void setCustomerAddress1(String customerAddress1) {
	this.customerAddress1 = customerAddress1;
}
public String getCustomerAddress2() {
	return customerAddress2;
}
public void setCustomerAddress2(String customerAddress2) {
	this.customerAddress2 = customerAddress2;
}
public int getCustomerPinCode() {
	return customerPinCode;
}
public void setCustomerPinCode(int customerPinCode) {
	this.customerPinCode = customerPinCode;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
public String getPrimaryContactPerson() {
	return primaryContactPerson;
}
public void setPrimaryContactPerson(String primaryContactPerson) {
	this.primaryContactPerson = primaryContactPerson;
}
public String getRecordStatus() {
	return recordStatus;
}
public void setRecordStatus(String recordStatus) {
	this.recordStatus = recordStatus;
}
public String getFlag() {
	return flag;
}
public void setFlag(String flag) {
	this.flag = flag;
}
public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public Date getModifiedDate() {
	return modifiedDate;
}

public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}
public String getModifiedBy() {
	return modifiedBy;
}
public void setModifiedBy(String modifiedBy) {
	this.modifiedBy = modifiedBy;
}
public Date getAuthorizedDate() {
	return authorizedDate;
}
public void setAuthorizedDate(Date authorizedDate) {
	this.authorizedDate = authorizedDate;
}
public String getAuthorizedBy() {
	return authorizedBy;
}
public void setAuthorizedBy(String authorizedBy) {
	this.authorizedBy = authorizedBy;
}
public String toString() {
	return "Customer [customerCode=" + customerCode + ", customerName=" + customerName + ", customerAddress1="
			+ customerAddress1 + ", customerAddress2=" + customerAddress2 + ", customerPinCode=" + customerPinCode
			+ ", email=" + email + ", contactNo=" + contactNo + ", primaryContactPerson=" + primaryContactPerson
			+ ", recordStatus=" + recordStatus + ", flag=" + flag + ", createDate=" + createDate + ", createdBy="
			+ createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + ", authorizedDate="
			+ authorizedDate + ", authorizedBy=" + authorizedBy + "]";
}
}