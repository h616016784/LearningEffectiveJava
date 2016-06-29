package com.learn;

import java.util.HashMap;
import java.util.Map;

import com.learn.chart1.NewObjectLearn;
import com.learn.chart3.PhoneNumber;

public class MainStartClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("程序开始  主函数被调用!");
		
		/**
		 * 第一章内容
		 */
		
		//静态工厂的优点：代码简洁、一个对象、可以返回原类型的任意子类
				//缺点：静态、类如果不含共有或受保护的构造器就不能被实例化。
		//创建对象 一般优先考虑静态工厂而后是构造器
		//如果类的构造器或者静态工厂中有多个参数，设计这种类时Builder模式就是一种不错的选择
		//静态工厂和单例的？？？单例通常代表唯一的系统组件，比如窗口管理器或文件系统
		
//		NewObjectLearn instance = NewObjectLearn.getInstance2();
//		System.out.println(instance.toString());
		
		//工厂模式：（1）简单工厂模式是由一个具体的类去创建其他类的实例，父类是相同的，父类是具体的。 
		//          （2）工厂方法模式是有一个抽象的父类定义公共接口，子类负责生成具体的对象，这样做的目的是将类的实例化操作延迟到子类中完成。 
		//          （3）抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口，而无须指定他们具体的类。它针对的是有多个产品的等级结构。而工厂方法模式针对的是一个产品的等级结构。
		
		//避免创建不必要的对象   String s=new String("abcdefg");//这是不对的
		//                    并不是对象越少越好，小的对象耗费的资源也很少，而如果用对象池的话里面最好是重量级的对象才会节省资源
		//            如果一个栈先增长，然后再收缩，那么从栈中弹出的对象不会被回收？？？？
		//避免使用终结法（finalizer）
		
		/**
		 * 第3章 对于所有对象都通用的方法
		 */
		//覆盖equals方法，要注意许多事项，必须遵守通用约定，因为一个类的实例通常会别频繁的传递给另一个实例。
		//       提高equals方法的诀窍：
		//           比较相等时尽可能使用“==”来判断，比equals性能好
		//每个覆盖equals方法的，也要覆盖hashcode的方法
		//       如果两个对象equals相同，那么hashcode也必须一样；如果不同，那么hashcode可以一样也可以不一样，
		//           但是如果不一样，有可能提高散列表的性能。
		//       只要equals方法所用到的信息没有被修改，那么对这同一个对象调用多次，hashcode返回的值要一致。
		
		Map<PhoneNumber,String> m=new HashMap<PhoneNumber, String>();
		m.put(new PhoneNumber(707, 867, 5309), "tom");
		m.get(new PhoneNumber(707, 867, 5309));
		System.out.println("chart3 finish!");
		
		/**
		 * 第4章 类和接口
		 */
		//第16条 复合优先于继承   复合（composition）--现有类变成了新类的一个组件
	}

}
