package it.pkg.command;

import java.io.Serializable;

public class AddOwnerCommand implements Serializable{

	   protected String ownerName;
	   protected int age;
	   protected String gender;
	   protected String mobileNo;
	   protected String emailAddress;
	   protected int flatNo;
	   protected int floor;
	   protected String facing;
	   protected int blockNo;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getFacing() {
		return facing;
	}
	public void setFacing(String facing) {
		this.facing = facing;
	}
	public int getBlockNo() {
		return blockNo;
	}
	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}
	   
	   
	   
	   
	
}
