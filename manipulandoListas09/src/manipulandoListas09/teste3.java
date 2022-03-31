package manipulandoListas09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class teste3 {

	public static void main(String[] args) {
		String[] array = new String[] {"A" , "B" , "c"};
		List<String> list1 = Arrays.asList(array);
		List<String> list2 = new ArrayList<>(Arrays.asList(array));
		List<String> lista3 =new ArrayList<>(Arrays.asList("A" , new String("B") , "C"));



		System.out.print(list1.equals(list2));
	}

}
