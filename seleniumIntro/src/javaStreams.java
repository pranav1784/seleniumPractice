import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
import org.testng.Assert;
 
import com.google.common.collect.Streams;
 
public class javaStreams {
	
	public static void main(String[] args)
	
	{
		List<String> list=new ArrayList<>();
		list.add("Henry");
		list.add("Harry");
		list.add("Andrew");
		list.add("Androver");
		list.add("Jay");
		list.add("Jennifer");
		list.add("Tom");
		list.stream().filter(s->s.startsWith("H")).forEach(s->System.out.println(s));
		list.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));	
		long num=Stream.of("Gargi","George","Feris","Reynolds","Rico","Daniel").filter(s->s.endsWith("s")).count();
		Stream.of("Gargi","George","Feris","Reynolds","Rico","Daniel").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	System.out.println(num);
	
	List<String> names=Arrays.asList("Shrut","Rishabh","Dinesh","Pooja","Diksha");
	names.stream().filter(s->s.startsWith("D")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	Stream<String>NewStream=Streams.concat(list.stream(),names.stream());
	//NewStream.sorted().forEach(s->System.out.println());
boolean match=	NewStream.anyMatch(s->s.equalsIgnoreCase("Shrut"));
 
Assert.assertTrue(match);
 
List<String> ls=names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls.get(0));
	
	List<Integer> intList=Arrays.asList(1,3,7,4,5,4,3,8,9,1);
	intList.stream().distinct().sorted().forEach(s->System.out.println(s));	
	}
 
}