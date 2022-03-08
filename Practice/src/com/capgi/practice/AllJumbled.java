package com.capgi.practice;

import java.util.Scanner;

class ExamPaper{
	private String correct;
	private String question;
	
	public ExamPaper(String correct,String question){
		this.correct=correct;
		this.question=question;
		
	}
	
	public void setCorrect(String correct) {
		this.correct=correct;
		
	}
	public void setQuestion(String question) {
		this.question=question;
	}
	public String getQuestion() {
		return question;
	}
	public String getCorrect() {
		return correct;
	}

	public String examChecker(int[] solution) throws Exception{
		 String[] str1=correct.split("\\s");
		 String[] str2=question.split("\\s");


		if(solution.length!=str1.length) {
			return "Fail";
		}
		boolean flag=true;
		for(int i=0;i<solution.length;i++) {
			if(str1[i].equals(str2[solution[i]])) 
			{
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}


		if(flag) {
			return "Passed";
		}
		else {
			return "Partially Passed";
		}
	}
	
	public String length(int[] solution) {
		 String[] str1=correct.split("\\s");

		if(solution.length==str1.length) {
			return "true";
		}
return " ";
		
	}
}


public class AllJumbled {
	public static void main(String[] args) throws Exception{
		
		String correct="Hi name";
		String question="Hi name my";

		ExamPaper paper=new ExamPaper(correct,question);
		int a[]= {0,2,1};
		System.out.println(paper.examChecker(a));
		System.out.println(paper.length(a));
	}

}
