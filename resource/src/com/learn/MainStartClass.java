package com.learn;

import com.learn.chart1.NewObjectLearn;

public class MainStartClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("����ʼ  ������������!");
		
		/**
		 * ��һ������
		 */
		
		//��̬�������ŵ㣺�����ࡢһ�����󡢿��Է���ԭ���͵���������
				//ȱ�㣺��̬��������������л��ܱ����Ĺ������Ͳ��ܱ�ʵ������
		//�������� һ�����ȿ��Ǿ�̬���������ǹ�����
		//�����Ĺ��������߾�̬�������ж�����������������ʱBuilderģʽ����һ�ֲ����ѡ��
		//��̬�����͵����ģ���������ͨ������Ψһ��ϵͳ��������細�ڹ��������ļ�ϵͳ
		
		
		NewObjectLearn instance = NewObjectLearn.getInstance();
		System.out.println(instance.toString());
	}

}
