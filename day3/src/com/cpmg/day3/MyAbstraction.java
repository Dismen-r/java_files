package com.cpmg.day3;
	abstract  class Mobile
	{
		final int price=1000;
		abstract public void calling();
	   abstract public void sendSMS();
		public void chargingUSB()
		{
			System.out.println("USB charging ");
		}
		
	}
	class Google extends Mobile
	{
		@Override
		public void calling() {
			// TODO Auto-generated method stub
			System.out.println("Google 4g calling");
		}

		@Override
		public void sendSMS() {
			// TODO Auto-generated method stub
			System.out.println("Send sms using internet");
		}
		
		public void androidAndroid()
		{
			System.out.println("Android Phone");
		}
	}
	class Apple extends Mobile
	{
		@Override
		public void calling() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void sendSMS() {
			// TODO Auto-generated method stub	
		}
		public void IOS()
		{
			System.out.println("IOS Apple");
		}
		public void getProcessor()
		{
			System.out.println("I am A7 chip");
		}
	}
	public class MyAbstraction {	
		public static void main(String args[])
		{
		Google gPlus=new Google();
		gPlus.androidAndroid();
		gPlus.calling();
		gPlus.sendSMS();
		gPlus.chargingUSB();
		Apple plus12=new Apple();
		plus12.calling();
		plus12.sendSMS();
		plus12.getProcessor();
		plus12.IOS();
		plus12.chargingUSB();
		}
	}