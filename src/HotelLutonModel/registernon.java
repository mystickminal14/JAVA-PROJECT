package HotelLutonModel;

public class registernon {
private String firstName;
private String lastnam;
private int age;
private String gender;
private String add;
private String count;
private String emId;
private String pass;
private int creditInfo;
private String type;
public registernon() {
	super();
	this.firstName = "";
	this.lastnam = "";
	this.age = 0;
	this.gender = "";
	this.add = "";
	this.count = "";
	this.emId = "";
	this.pass = "";
	this.creditInfo = 0;
	this.type = "";
}
public registernon(String firstName, String lastnam, int age, String gender, String add, String count, String emId,
		String pass, int creditInfo, String type) {
	super();
	this.firstName = firstName;
	this.lastnam = lastnam;
	this.age = 0;
	this.gender = gender;
	this.add = add;
	this.count = count;
	this.emId = emId;
	this.pass = pass;
	this.creditInfo = 0;
	this.type = type;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastnam() {
	return lastnam;
}
public void setLastnam(String lastnam) {
	this.lastnam = lastnam;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getCount() {
	return count;
}
public void setCount(String count) {
	this.count = count;
}
public String getEmId() {
	return emId;
}
public void setEmId(String emId) {
	this.emId = emId;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public int getCreditInfo() {
	return creditInfo;
}
public void setCreditInfo(int creditInfo) {
	this.creditInfo = creditInfo;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "registernon [firstName=" + firstName + ", lastnam=" + lastnam + ", age=" + age + ", gender=" + gender
			+ ", add=" + add + ", count=" + count + ", emId=" + emId + ", pass=" + pass + ", creditInfo=" + creditInfo
			+ ", type=" + type + "]";
}

}
