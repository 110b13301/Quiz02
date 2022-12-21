import java.io.*;
public class J2 {
	public static void main(String args[]) throws IOException {
		FileWriter fw=new FileWriter("D:\\Quiz02\\rand.txt");
		BufferedWriter bfw=new BufferedWriter(fw);
		for(int i=1; i<=1000; i++) {
			bfw.write(Integer.toString((int)(Math.random()*100000)+1));
			bfw.newLine();
		}
		bfw.flush();
		fw.close();
		System.out.print("done");
	}
}