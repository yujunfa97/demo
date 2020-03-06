package cn.opm.demo.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) {
		String tmp = "a,b,c,,";
		String[] arr = tmp.split(",");
		System.out.println(arr.length);
		List<String> stringList = new ArrayList<>();
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		arr = stringList.toArray(new String[0]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Instant.now());
		System.out.println(LocalDateTime.now(ZoneId.of("GMT+8")));
	}
}
