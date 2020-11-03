package com.sayhiai.example.javaagent.app;

import java.util.HashMap;

public class MainRun {
	public static void main(String[] args) {
		hello("world");

		while (true) {
			try {
				Thread.sleep(100000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void hello(String name) {
		System.out.println("hello " + name + new HashMap<>() + new java.lang.String("fixme").replace("i", "a"));
	}
}
