package com.yourcompany.android.jetnotes.lamdas;

public class Teacher implements Teachable{

	@Override
	public void teach(String subject) {
		System.out.println("teaching "+ subject);
	}

}
