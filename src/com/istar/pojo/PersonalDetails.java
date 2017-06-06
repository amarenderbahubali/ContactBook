package com.istar.pojo;

public class PersonalDetails
{
private int id;
private String name;
private Long telno;
private String dob;
private String address;
private String nickname;
private String type;
private String relationship;
private String website;
private String companyname;
private Long landlineno;
public PersonalDetails(){
	super();
}


public PersonalDetails(int id,String name,Long telno,String dob, String address, String nickname,String type,String relationship,String website,String companyname,Long landlineno)
{
	super();
	this.id=id;
    this.name=name;
    this.telno=telno;
    this.dob=dob;
    this.address=address;
    this.nickname=nickname;
    this.type=type;
    this.relationship=relationship;
    this.website=website;
    this.companyname=companyname;
    this.landlineno=landlineno;
}


