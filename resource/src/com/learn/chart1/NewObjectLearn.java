package com.learn.chart1;

public class NewObjectLearn {
	private static NewObjectLearn newObjectlearn=new NewObjectLearn();
	/**
	 * 单例模式 
	 * @return
	 */
	
	public static NewObjectLearn getInstance(){
		return newObjectlearn;
	}
	public static NewObjectLearn getInstance2(){//懒汉式单例
		if(newObjectlearn==null){
			newObjectlearn=new NewObjectLearn();
		}
		return newObjectlearn;
	}
	
}
