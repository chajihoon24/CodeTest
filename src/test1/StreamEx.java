package test1;

import java.util.Arrays;
import java.util.List;


public class StreamEx {
	
    public void streamExample() {
    	List<String> list1 = List.of("김수동", "강가아", "나미리","다미니");
    	List<String> list2 = Arrays.asList("안","녕");
    	
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        // 스트림 사용 예시
        list.stream()
            .filter(s -> s.startsWith("a"))
            .forEach(System.out::println);
           // "apple"
        String result = list.stream()
        				.reduce("시작", (a,b)-> a+ b);
        
        System.out.println(result);
    }
	
}
