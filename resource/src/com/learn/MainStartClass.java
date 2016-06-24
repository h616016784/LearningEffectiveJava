package com.learn;

import com.learn.chart1.NewObjectLearn;

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
		
		NewObjectLearn instance = NewObjectLearn.getInstance2();
		System.out.println(instance.toString());
		
		//工厂模式：a 抽象工厂模式，为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类
		//         b 简单工厂模式（静态工厂模式），是类的创建模式，由一个工厂类决定创建哪种产品类的实例
		
	}

}
