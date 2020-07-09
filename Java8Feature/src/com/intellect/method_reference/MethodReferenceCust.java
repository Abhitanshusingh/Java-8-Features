package com.intellect.method_reference;

interface Parser {
	String parse(String str);
}

class StringParse {
	public static String convert(String name) {
		if (name.length() >= 5)
			name = name.toLowerCase();
		else
			name = name.toUpperCase();
		return name;
	}
}

class MyPrinter {

	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodReferenceCust {
	public static void main(String[] args) {
		String name = "Abhi";
		MyPrinter toPrint = new MyPrinter();

		// Using Method Reference
		toPrint.print(name, StringParse::convert);

		// Using Lambda Expression
		toPrint.print(name, (s -> StringParse.convert(s)));

		// Normal way
		toPrint.print(name, new Parser() {
			public String parse(String s) {
				return StringParse.convert(s);
			}
		});
	}
}