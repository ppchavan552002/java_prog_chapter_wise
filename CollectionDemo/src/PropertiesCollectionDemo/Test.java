package PropertiesCollectionDemo;



import java.io.FileReader;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("C:\\Users\\Victory\\OneDrive\\Desktop\\java_prog\\CollectionDemo\\src\\PropertiesCollectionDemo\\db.properties");
		Properties p=new Properties();
		p.load(reader);
		System.out.println("user");
		System.out.println("password");
	}

}
