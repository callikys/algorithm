import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputP = br.readLine();
		String inputD = br.readLine();
		
		int pCount = 0;
		for(int i = 0; i<inputP.length(); i++) {
			char c = inputP.charAt(i);
			if(c=='a') {
				pCount++;
			}
		}
		int dCount = 0;
		for(int i = 0; i<inputD.length(); i++) {
			char c = inputD.charAt(i);
			if(c=='a') {
				dCount++;
			}
		}
		if(dCount<=pCount) {
			bw.write("go");
		} else {
			bw.write("no");
		}
		bw.flush();
		bw.close();
	}

}
