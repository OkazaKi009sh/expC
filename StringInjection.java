import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;


public class StringInjection {
	static FileReader fr = null;
	static BufferedReader br = null;
	static PrintWriter pw = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String example1 = "c://Users//username//Desktop//M//MemoryC.txt";
		String example2 =  "c://Users//username//Desktop//M//MemoryOutput.txt";
		String path = example1;
		String output = example2;
		try {
			File file = new File(output);
			pw = new PrintWriter(file);
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String str = null;
			String zero = "";
			int count = 0;
			while((str = br.readLine()) != null) {
				if(!str.equals("")) {
					String hex = Integer.toHexString(count);
					for(int i=0;i<4-hex.length();i++) {
						zero += "0";
					}
					str = zero + hex + " " + str;
					pw.println(str);
					zero = "";
					count++;
				}
			}
			fr.close();
			br.close();
			pw.close();
		}	catch(Exception e) {
			
		}
	}

}
