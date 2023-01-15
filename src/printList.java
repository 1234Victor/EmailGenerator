import java.util.LinkedList;
import java.io.*;
public class printList {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<String> tutorList = new LinkedList();
		LinkedList<String> emailList = new LinkedList();
		LinkedList<String> schoolList = new LinkedList();
		for(int i = 1; i<=29; i++) {
			String read = br.readLine();
			tutorList.add(read);
		}
		for(int i = 1; i<=29; i++) {
			String read = br.readLine();
			emailList.add(read);
		}
		for(int i = 1; i<=29; i++) {
			String read = br.readLine();
			schoolList.add(read);
		}
		for(int i = 0; i<29; i++) {
			System.out.println("new tutor(\""+tutorList.get(i)+"\",\""+emailList.get(i)+"\",\""+schoolList.get(i)+"\"),");
		}
	}

		
		/*LinkedList<String> tuteeList = new LinkedList();
		LinkedList<String> emailList = new LinkedList();
		for(int i = 0; i< 16; i++) {
			String read = br.readLine();
			tuteeList.add(read);
		}
		for(int i = 0; i< 16; i++) {
			String read = br.readLine();
			emailList.add(read);
		}
		for(int i = 0; i< 16; i++) {
			System.out.println("new tutee(\""+tuteeList.get(i)+"\",\""+emailList.get(i)+"\"),");
		}
	
		*/
	}
	public static String eliminate(String word) {
		return word.replaceAll(" ","").toLowerCase();
	}

}
