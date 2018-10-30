package com.imooc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Package:com.imooc
 * @ClassName:TestLambda
 * @Description:TODO 测试Lambda表达式
 * @author:Jiangxb
 * @date:2018年10月30日 下午3:53:18
 * 
 */
public class TestLambda {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("测试数据1");
		list.add("测试数据2");
		list.add("测试数据3");
		list.add("测试数据41");
		list.add("测试数据12");
		
		// 传统方法遍历
		for(String str : list) {
//			System.out.println(str);
		}
		
		// Lambda表达式
//		list.forEach(e -> System.out.println(e));
		
		// 结合Predicate的使用，过滤条件来筛选元素
		Predicate<String> contain = e -> e.contains("1");	// 包含1的
		Predicate<String> contain2 = e -> e.contains("2");	// 包含2的
//		list.stream().filter(contain).forEach(e -> System.out.println(e));	// 打印包含“1”的元素
//		list.stream().filter(contain2).forEach(e -> System.out.println(e));	// 打印包含“2”的元素
//		list.stream().filter(contain.and(contain2)).forEach(e -> System.out.println(e)); // 打印包含"1"和“2”的元素
//		list.stream().filter(contain.or(contain2)).forEach(e -> System.out.println(e));	 // 打印包含"1"或“2”的元素
		
		list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
		
		List<String> nowList = list.stream().filter(contain).collect(Collectors.toList());	// 将过滤后的元素放入新的集合
//		nowList.forEach(e -> System.out.println(e));
	}
}
