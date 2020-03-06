package cn.opm.demo.test;

import java.math.BigDecimal;
import java.util.Objects;

public class Demo02 {
	public static void main(String[] args) {
		float a = 1.0f - 0.9f;
		float b = 0.9f - 0.8f;
		System.out.println(a == b);
		System.out.println(Objects.equals(a, b));

		BigDecimal num1 = new BigDecimal("1.0");
		BigDecimal num2 = new BigDecimal("0.9");
		BigDecimal num3 = num1.subtract(num2);
		System.out.println(a);
		System.out.println(num3.toString());
		BigDecimal num4 = new BigDecimal("0.8");
		BigDecimal num5 = num2.subtract(num4);
		System.out.println(num5);
		System.out.println(Objects.equals(num3, num5));
	}
}
