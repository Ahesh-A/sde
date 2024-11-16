import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{

	public static void main(String[] args) throws Exception {
		InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		System.out.print("Enter your name: ");
		String name = bufferedReader.readLine();

		System.out.println("Name: " + name);
	}
}
