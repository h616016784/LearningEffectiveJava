package com.learn.chart1;

public class NewObjectLearn {
	private static NewObjectLearn newObjectlearn=new NewObjectLearn();
	/**
	 * ����ģʽ 
	 * @return
	 */
	
	public static NewObjectLearn getInstance(){
		return newObjectlearn;
	}
	public static NewObjectLearn getInstance2(){//����ʽ����
		if(newObjectlearn==null){
			newObjectlearn=new NewObjectLearn();
		}
		return newObjectlearn;
	}
	
}
