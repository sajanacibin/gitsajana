   package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamtest1 {

	
	
	public static void main(String[] args) 
	{
		//normal method of arraylist and for loop
		/*ArrayList<String> name=new ArrayList<String>();
		name.add("adline");
		name.add("johan");
		name.add("ann");
		name.add("nathan");
		int count=0;
		
		for(int i=0;i<name.size();i++)
		{
			
			
		String names=name.get(i);

		//System.out.println(names);
		if(names.startsWith("a"))
		{
			count++;
			
			
		}
		
	
		}
		
		System.out.println(count);*/
		//using array
		//String[] names={"adline","johan"};
		
		//using java stream
		ArrayList<String> name=new ArrayList<String>();
		name.add("adline");
		name.add("johan");
		name.add("ann");
		name.add("nathan");
		//there is no life for intermediate operation if no terminal operation 
		//terminal operation can be executed only if intermediate operation returen s true
		//filter method scan the name parallely not like for loop.for loop executes in sequences
	Long counts=	name.stream().filter(s->s.startsWith("a")).count();
	System.out.println(counts);
	
	
		name.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		
		streammap();
		streamsorting();
		streamconcate();
		
		streamint();
	}
	
	
	public static  void streammap()
	
	{
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("sajana");
		list.add("johan");
		list.add("soumaya");
		list.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		list.stream().filter(s->s.endsWith("a")).limit(1).forEach(s->System.out.println(s));
		
		
	}
	public static void streamsorting()
	{
		
		//CREATE ARRAY AMD CONVERT TO ARRAYLIST
		
String[] nameslist= {"adline","rama","ann","augustine"};
List<String> listofname=Arrays.asList(nameslist);
listofname.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		
	}
	public static void streamconcate()
	{
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("sajana");
		list1.add("johan");
		list1.add("soumaya");
		String[] list2=  {"adline","rama","ann","augustine"};
		List<String> list3=Arrays.asList(list2);
		Stream<String> newstream=Stream.concat(list1.stream(),list3.stream());
	boolean flag=	 newstream.anyMatch(s->s.equalsIgnoreCase("augustine"));
	System.out.println(flag);
	
		
	}
	public static void streamint()
	{
		
		//int[] num= {3,3,6,2,8,5,5,1,4};
		
	List<Integer> numlist=Arrays.asList(3,3,6,2,8,5,5,1,4);
	numlist.stream().distinct().sorted().forEach(s->System.out.println(s));
List<Integer> numlist2=	numlist.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(numlist2.get(3));
	}
}
