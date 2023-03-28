package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
	@DataProvider(name = "ValidCredensial")
	public static Object dataset(){
		Object [][] objects = {{"gilly50@adalah.dev","pass123#"}
		};
		return objects;
	}
	
}
