package P1.text;

import static org.junit.Assert.*;

import org.junit.Test;

import P1.MagicSquare;

public class Text_MagicSquare{

	@Test
	void test1() 
	{
		if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\eclipse-workspace\\Lab1\\src\\P1\\text\\1.txt")) 
		{
            System.out.println("�˾�����һ���÷�");
        } 
		else 
		{
            System.out.println("�˾����ǻ÷�");
        }
	}
	@Test
	void test2() 
	{
		if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\eclipse-workspace\\Lab1\\src\\P1\\text\\2.txt")) 
		{
            System.out.println("�˾�����һ���÷�");
        } 
		else 
		{
            System.out.println("�˾����ǻ÷�");
        }
	}
	@Test
	void test3() 
	{
		if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\eclipse-workspace\\Lab1\\src\\P1\\text\\3.txt")) 
		{
            System.out.println("�˾�����һ���÷�");
        } 
		else 
		{
            System.out.println("�˾����ǻ÷�");
        }
	}
	@Test
	void test4() 
	{
		if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\eclipse-workspace\\Lab1\\src\\P1\\text\\4.txt")) 
		{
            System.out.println("�˾�����һ���÷�");
        } 
		else 
		{
            System.out.println("�˾����ǻ÷�");
        }
	}
	@Test
	void test5() 
	{
		if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\eclipse-workspace\\Lab1\\src\\P1\\text\\5.txt")) 
		{
            System.out.println("�˾�����һ���÷�");
        } 
		else 
		{
            System.out.println("�˾����ǻ÷�");
        }
	}

}
