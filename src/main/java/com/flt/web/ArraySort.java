/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.web;

/**
 *
 * @author 熊成威
 * @date 2018/11/8   
 * @version 1.0
 */
public class ArraySort implements Runnable {

	private String num;

	public ArraySort(int num){
		this.num = num + "";
	}

	public static void main(String[] args){
		int[] nums={11,3,998,999,2,152,990};
		for (int i=0; i< nums.length;i++){
			new Thread(new ArraySort(nums[i])).start();
		}
	}

	@Override public void run() {
		try {
			Thread.sleep(Integer.parseInt(num));
			System.out.println(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
