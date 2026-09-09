package com.thread;
enum Season{
	WINTER,
	SPRING,
	SUMMER,
	FALL;
}
public class Task1 {
	public static void main(String[] args) {
	Season season = Season.SPRING;
	switch(season) {
	case WINTER:
		System.out.println("WINTER");
	break;
	case SPRING:
		System.out.println("SPRING");
		break;
	case SUMMER:
		System.out.println("SUMMER");
		break;
	case FALL:
		System.out.println("FALL");
		break;
	}
	
	}

}
