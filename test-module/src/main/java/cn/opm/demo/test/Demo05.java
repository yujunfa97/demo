package cn.opm.demo.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Demo05 {
	public static void main(String[] args) {
		ThreadLocal<DateFormat> df = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:sss"));
		System.out.println(df.get().format(new Date()));
		df.remove();
		System.out.println(Instant.parse("2007-12-03T10:15:30.00Z"));
		System.out.println(System.nanoTime());
		System.out.println(System.currentTimeMillis());
	}
	public static void method(String tmp) {
		switch (tmp) {
			case "sth":
				System.out.println("it's sth");
				break;
			case "null":
				System.out.println("it's null");
				break;
			default:
				System.out.println("it's default");
		}
	}
}
