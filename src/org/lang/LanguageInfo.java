package org.lang;

public   class LanguageInfo  {
	public void tamilLanguage() {
		 final int a = 20;int b=10;
		 int c =a +b;
		System.out.println("Tamil Language");
	}
	public void englishLanguage() {
	
		System.out.println("English Language");
	}
	public void hindiLanguage() {
		System.out.println("Hindi Language");
	}
	public static void main(String[]args) {
		
		LanguageInfo l = new LanguageInfo();
	    l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		StateDetails s = new StateDetails();
		//s.southIndia();
		s.northIndia();
		StateDetails.southIndia();
		
		
		
}
}