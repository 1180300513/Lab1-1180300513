package P1.text;

import static org.junit.Assert.*;

import org.junit.Test;

public class text {

	@Test
	void test1() 
	{
		if(new Magic_Square().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\1.txt")) 
		{
            System.out.println("此矩阵是一个幻方");
        } 
		else 
		{
            System.out.println("此矩阵不是幻方");
        }
	}
	@Test
	void test2() 
	{
		if(new Magic_Square().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\2.txt")) 
		{
            System.out.println("此矩阵是一个幻方");
        } 
		else 
		{
            System.out.println("此矩阵不是幻方");
        }
	}
	@Test
	void test3() 
	{
		if(new Magic_Square().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\3.txt")) 
		{
            System.out.println("此矩阵是一个幻方");
        } 
		else 
		{
            System.out.println("此矩阵不是幻方");
        }
	}
	@Test
	void test4() 
	{
		if(new Magic_Square().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\4.txt")) 
		{
            System.out.println("此矩阵是一个幻方");
        } 
		else 
		{
            System.out.println("此矩阵不是幻方");
        }
	}
	@Test
	void test5() 
	{
		if(new Magic_Square().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\5.txt")) 
		{
            System.out.println("此矩阵是一个幻方");
        } 
		else 
		{
            System.out.println("此矩阵不是幻方");
        }
	}

}
