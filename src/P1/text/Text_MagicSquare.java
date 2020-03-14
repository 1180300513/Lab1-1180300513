package P1.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import P1.MagicSquare;

class Text_MagicSquare {

	@Test
	void test() {
		 if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\1.txt")) {
	            System.out.println("此矩阵是一个幻方");
	        } else {
	            System.out.println("此矩阵不是幻方");
	        }
		 if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\2.txt")) {
	            System.out.println("此矩阵是一个幻方");
	        } else {
	            System.out.println("此矩阵不是幻方");
	        }
		 if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\3.txt")) {
	            System.out.println("此矩阵是一个幻方");
	        } else {
	            System.out.println("此矩阵不是幻方");
	        }
		 if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\4.txt")) {
	            System.out.println("此矩阵是一个幻方");
	        } else {
	            System.out.println("此矩阵不是幻方");
	        }
		 if(new MagicSquare().isLegalMagicSquare("D:\\Program Files (x86)\\Lab1_1180300513\\Lab1-1180300513\\src\\P1\\text\\5.txt")) {
	            System.out.println("此矩阵是一个幻方");
	        } else {
	            System.out.println("此矩阵不是幻方");
	        }
	}

}
