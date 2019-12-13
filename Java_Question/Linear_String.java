
public class Linear_String {
	public static void main(String[]args) {
		String[] list1 = {"mona","sona","hina","ritu","mahi","rohini"};
		String result = "mahi";
		for (int index=0;index<list1.length; index++) {
			if (list1[index].equals(result)){
				System.out.println("result is found at" + index + " " + " " +"index position");
			}
		}
	}

}
