package org.company;

public class CompanyInfo {
private void companyName(long salary,String name) {
System.out.println("company name : "+name);
System.out.println("company salary: "+salary);
}
private void companyName(String address,long plotno) {
System.out.println("company address : "+address);
System.out.println("company plotno: "+plotno);
}
public static void main(String[] args) {
	CompanyInfo c= new CompanyInfo();
	c.companyName(50000l, "zoho");
	c.companyName("chennai", 10l);
	System.out.println("hi");
	System.out.println("bye");
	
}
}
