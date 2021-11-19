package Selenium.Selenium.dataprovider;


import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="getData")
	public void setData(String username, String password) {
		System.out.println("your username is: " + username);
		System.out.println("your password is: "+ password);
	}
@org.testng.annotations.DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0]="user1";
		data[0][1]="pass";
		
		data[1][0]="user2";
		data[1][1]="abc";
		
		data[2][0]="user3";
		data[2][1]="xyz";
		return data;
	}

}
