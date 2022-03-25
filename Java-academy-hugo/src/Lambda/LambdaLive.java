package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaLive {

	public static void main(String[] args) {
		
		new Thread(new PrintHello()).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world 2!");
			}
		}).start();
		
		new Thread(() -> System.out.println("Hello world 3")).start();
		
		
		//Lista
		List<String> list = new ArrayList<>();
		list.add("ibm");
		list.add("java");
		list.add("academy");
		
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		
		System.out.println(list);
		
		/*
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}	
		});
		
		*/
		
		UpConcat lambda = (s1, s2) -> s1.toUpperCase().concat(" ").concat(s2.toUpperCase());
		System.out.println(formatString(lambda, "java", "academy"));
		
	}
	
	public static String formatString(UpConcat lf, String s1, String s2) {
		return lf.upAndConcat(s1, s2);
	}
	
}

class PrintHello implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello world");
	}
}


interface UpConcat {
	String upAndConcat(String s1, String s2);
}

