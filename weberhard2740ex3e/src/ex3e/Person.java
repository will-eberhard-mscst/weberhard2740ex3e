package ex3e;

import java.io.IOException;
import java.io.PrintWriter;

public class Person {

	private static PrintWriter outputFile;
	private String name;
	private String address;
	private int age;
	private String phone;
	
	public Person(String name, String address, int age, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(this.name);
		str.append(", ");
		str.append(this.address);
		str.append(", Age: ");
		str.append(this.age);
		str.append(", ");
		str.append(this.phone);
		return str.toString();
	}	
	
	public void write(){
		outputFile.println(this.name);
		outputFile.println(this.address);
		outputFile.println(this.age);
		outputFile.println(this.phone);
	}
	
	public static boolean openFile(String fileName){
		boolean fileOpened = false;
		try{
			outputFile = new PrintWriter(fileName);
			fileOpened = true;
		}
		catch(IOException e){}
		
		return fileOpened;
	}
	public static void closeFile(){
		if(outputFile != null) outputFile.close();
	}
}
