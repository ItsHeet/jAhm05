

import java.util.*;


public class classwork {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList<Integer>(5);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter " +i +" Marks :: ");
			int i1=sc.nextInt();
			l1.add(i1);
		}
		
		System.out.println("Size of Array :: "+l1.size());
		
		System.out.println(l1);
		
		System.out.println("Element in array list ");
		l1.forEach(ele -> System.out.println(ele));
	}

}
