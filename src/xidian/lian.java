package xidian;

import java.io.BufferedReader;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import xidian.runString;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JApplet;
 public class lian{
	 public static void mian(String[] args){
		 
		 
		 
		 
	 }
 }

 
 
 
 
 
 
 
 
///*
// * 重载的构造器和重载的方法
// * 
// * 
// * 其中Tree是构造器名称，info()是方法名，构造器名必须和类名一致，
// * 重载的构造器和方法必须有独一无二的参数列表。这样编译器才能区分*/
//class Tree {
//	int height;
//
//	Tree() {
//		System.out.println("种植一颗种子");
//		height = 0;
//	}
//
//	Tree(int i) {
//		height = i;
//		System.out.println("creat tree is" + height);
//	}
//
//	void info() {
//		System.out.println("tree is" + height);
//	}
//
//	// 重载方法
//	void info(String s) {
//		System.out.println(s + ":tree is" + height);
//	}
//}
//
//public class lian {
//	public static void main(String[] args) {
//		for (int i = 0; i < 6; i++) {
//			Tree t = new Tree(i);
//			t.info();
//			t.info("overLoad");
//		}
//		// 重载构造器
//		new Tree();
//	}
//
//}

/* 五子棋 */
// private String[][] board;
// private static int[][] black = new int[15][15];
// private static int[][] white = new int[15][15];
// private static int sum1 = 0;
// private static int sum2 = 0;
// private static int sum3 = 0;
// private static int sum4 = 0;
// public static int Size = 15;
// public static int flag = 1;
// public static int b = 0;
//
// public static void main(String[] args) throws IOException {
// for (int i = 0; i < 15; i++) {
// for (int j = 0; j < 15; j++) {
// black[i][j] = 0;
// }
// }
//
// String inputstr = null;
// lian gb = new lian();
// gb.initboard();
// gb.printboard();
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// // br.readLine();
// while ((inputstr = br.readLine()) != null) {
// String[] pos = inputstr.split(",");
// int x = Integer.parseInt(pos[0]);
// int y = Integer.parseInt(pos[1]);
// if (flag % 2 == 0) {
// gb.board[x - 1][y - 1] = "★   ";
// black[x - 1][y - 1] = 1;
// win(black, x - 1, y - 1);
// }
// if (flag % 2 != 0) {
// gb.board[x - 1][y - 1] = "☆   ";
// white[x - 1][y - 1] = 1;
// win(white, x - 1, y - 1);
// }
// gb.printboard();
// System.out.print("请输入您下棋的坐标：");
// }
//
// }
//
// private static void win(int[][] select, int x, int y) {
//
// /* 纵向监测是否满五个 */
// for (int i = x - 4; i <= x; i++) {
//
// sum1 = select[i][y] + select[i + 1][y] + select[i + 2][y]
// + select[i + 3][y] + select[i + 4][y];
// //System.out.println(sum1);
//
// if (sum1 == 5) {
// System.out.print("you win!"+"\n");
// break;
// }
// // System.out.println(sum1);
// }
//
// /* 监测横向是否满五个 */
// for (int i = y - 4; i <= y; i++) {
// sum2 = select[x][i] + select[x][i + 1] + select[x][i + 2]
// + select[x][i + 3] + select[x][i + 4];
// //System.out.println(sum2);
// if (sum2 == 5) {
// System.out.print("you win!"+"\n");
// break;
// }
// }
// /* 正对角线监测是否满五个 */
// for (int i = 4; i >= 0; i--) {
//
// sum3 = select[x - i][y - i] + select[x - i + 1][y - i + 1]
// + select[x - i + 2][y - i + 2]
// + select[x - i + 3][y - i + 3]
// + select[x - i + 4][y - i + 4];
// //System.out.println(sum3);
// if (sum3 == 5) {
// System.out.print("you win!"+"\n");
// break;
// }
// }
// /* 斜对角线监测是否满五个 */
// for (int i = 4; i >= 0; i--) {
// sum4 = select[x + i][y - i] + select[x + i - 1][y - i + 1]
// + select[x + i - 2][y - i + 2]
// + select[x + i - 3][y - i + 3]
// + select[x + i - 4][y - i + 4];
// //System.out.println(sum4);
// if (sum4 == 5) {
// System.out.print("you win!"+"\n");
// break;
// }
// }
//
// }
//
// private void printboard() {
// for (int i = 0; i < Size; i++) {
// for (int j = 0; j < Size; j++) {
// System.out.print(board[i][j]);
// }
// System.out.print("\n");
// }
// flag++;
// }
//
// private void initboard() {
// board = new String[Size][Size];
// for (int i = 0; i < Size; i++) {
// for (int j = 0; j < Size; j++) {
// board[i][j] = "＋   ";
// }
// }
//
// }
// }

/* 求素数 */
// short a, c;
// double b;
// for (a = 1000; a < 2000; a++) {
// int d = 2;
// b = (double) Math.sqrt(a);
// for (c = 2; c <= b; c++) {
// if (a % c == 0) {
// d = 3;
// }
// }
// if (d == 2) {
// System.out.print(a + "\n");
// }
// }
//
// }
// }
/* 找两个数的最大公约数 */

// Scanner input = new Scanner(System.in);
// System.out.print("请输入第一个数：");
// short a = input.nextShort();
// System.out.print("请输入第二个数：");
// short b = input.nextShort();
// if (a >= b) {
// System.out.print(a + "和" + b + "的最大公约数为" + max(a, b));
// } else {
// System.out.print(a + "和" + b + "的最大公约数为" + max(b, a));
// }
//
// }
//
// public static short max(short m, short n) {
// if (m == n)
// return m;
// if (m % n == 0)
// return n;
// short p, q = 1;
//
// for (p = (short) (n / 2); p > 1; p--) {
// if (m % p == 0 && n % p == 0) {
// q = p;
// break;
// }
// }
// return q;
// }
// }

/*
 * 递归：汉诺塔问题 问题描述：将指定大小不同的n个盘子从A塔上全部移到B塔上 移动规则：
 * n个盘子分别标记为1,2,3......n;三个塔分别标记为A、B、C; 任何时候盘子都不能放在比它小的盘子上方 初始状态时，所有盘子都放在A上
 * 每次只能移动一个盘子，且这个盘子只能在塔顶
 */
// System.out.print("请输入盘子个数n：");
// Scanner input = new Scanner(System.in);
// int a = input.nextInt();
// System.out.print("移动顺序为：" + "\n");
// move(a, 'A', 'B', 'C');
// }
//
// private static void move(int a, char A, char B, char C) {
// if (a == 1) {
// System.out.print("第"+(++b)+"步："+"将盘子" + a + "从" + A + "移动到" + B + "\n");
// } else {
// move(a - 1, A, C, B);
// System.out.print("第"+(++b)+"步："+"将盘子" + a + "从" + A + "移动到" + B + "\n");
// move(a - 1, C, B, A);
// }
//
// }
// }

/* 递归：斐波那契数列 */
// System.out.print("请输入需要查找的位置：");
// Scanner input = new Scanner(System.in);
// int a = input.nextInt();
// int b = a - 1;
// System.out.print("您查找的斐波那契数列第" + a + "位置的值是" + digui(b));
//
// }
//
// private static int digui(int b) {
// // TODO Auto-generated method stub
// if (b == 0)
// return 0;
// if (b == 1)
// return 1;
// else
// return digui(b - 1) + digui(b - 2);
//
// }
// }

/* 文件I/O流demo */
// int flag;
// FileOutputStream output = new FileOutputStream("F:\\1.5\\temp.txt");
// for (int i = 0; i < 10; i++) {
// output.write(i);
// }
// output.close();
// FileInputStream input = new FileInputStream("F:\\1.5\\temp.txt");
// while ((flag = input.read()) != -1) {
// System.out.print(flag);
// }
//
// input.close();

/* 继承及接口类demo */
// Object[] objects = { new Tiger(), new Chicken(), new Apple() };
// for (int i = 0; i < objects.length; i++) {
// if (objects[i] instanceof Ediable) {
// System.out.print(((Ediable) objects[i]).howToEat());
// }
// }
// }
//
// }
//
// class Animal {
//
// }
//
// class Chicken extends Animal implements Ediable {
// public String howToEat() {
// return "Chicken:Fry it";
// }
// }
//
// class Tiger extends Animal {
//
// }
//
// abstract class Fruit implements Ediable {
//
// }
//
// class Apple extends Fruit {
// public String howToEat() {
// return "Apple:Make apple cider";
// }
// }
//
// class Orange extends Fruit {
// public String howToEat() {
// return "Orange:Make Orange juice";
// }
// }

/* 求数组最大和的子数组，并输出最大和 */
// System.out.println("请输入元素个数：");
// Scanner input = new Scanner(System.in);
// int a = input.nextInt();
// int[] b = new int[a];
//
// System.out.println("请输入元素：");
// for (int i = 0; i < a; i++) {
// b[i] = input.nextInt();
// // System.out.print(b[i]);
// }
// System.out.println(maxSubArray(b));
// }
//
// public static int maxSubArray(int b[]) {
// int n = b.length;
// int thisSum = 0, maxSum = 0, i, j, k;
// for (i = 0; i < n; i++) {
// for (j = i; j < n; j++) {
// thisSum = 0;
// for (k = i; k < j; k++) {
// thisSum += b[k];
// if (thisSum > maxSum) {
// maxSum = thisSum;
// }
// }
// }
// }
//
// return maxSum;
//

/* 打印2幂函数金字塔 */
// for(int i = 1;i<=a;i++){
// for(int j = 0;j<a-i;j++){
// System.out.print("    ");
// }
// for(int k = 1;k<=i;k++){
// if((int) Math.pow(2, k)<10){
// System.out.print((int) Math.pow(2, k)+"   ");
// }
// if((int) Math.pow(2, k)>10&&(int) Math.pow(2, k)<100){
// System.out.print((int) Math.pow(2, k)+"  ");
// }
// if((int) Math.pow(2, k)>100){
// System.out.print((int) Math.pow(2, k)+" ");
// }
// }
// for(int m = i;m>1;m--){
// if((int)Math.pow(2, m-1)<10){
// System.out.print((int)Math.pow(2, m-1)+"   ");
// }
// if((int)Math.pow(2, m-1)>10&&(int)Math.pow(2, m-1)<100){
// System.out.print((int)Math.pow(2, m-1)+"  ");
// }
// if((int)Math.pow(2, m-1)>100){
// System.out.print((int)Math.pow(2, m-1)+" ");
// }
// }
// System.out.print("\n");
// }

/* 输入一串字符，判断每个字母出现的次数 */
// char[] b = a.toCharArray();
// char c;
// int e;
// // c = 97;
// // System.out.print(c);
// int d;
// int[] count = new int[26];
// for(int i = 0;i<b.length;i++){
// //c = b[i];
// d = b[i] - 'a';
// count[d]++;
// //System.out.print(d+"\n");
// }
// for(int j = 0;j<count.length;j++){
// if(count[j]!=0){
// e = j+97;
// c = (char) e;
// //System.out.print(c);
// System.out.print(c+"出现了"+count[j]+"次。"+"\n");
// }
// }
//

/* 输入一串由小括号，中括号，大括号组成的字符串，判断其是否全部配对 */

// int e=0;
// char[] b = a.toCharArray();
// int c = 0,d = b.length-1;
// for(int i = 0;i<b.length;i++){
// if(b[c]==b[d]){
// c++;
// d--;
// }
// else{
//
// e = 1;
//
// }
// }
// if(e == 0){
//
// System.out.print("yes");
// }
// else{
// System.out.print("no");
// }
//

/* 输入正多边形边数，边长及中心坐标，输出多边形周长和面积 */

// double a,b,c,d;
// System.out.printf("请输入多边形的边数，边长及中心坐标：");
// Scanner input = new Scanner(System.in);
// a = input.nextDouble();
// b = input.nextDouble();
// c = input.nextDouble();
// d = input.nextDouble();
// Rectanglel rectangle1 = new Rectanglel(a,b,c,d);
// System.out.print(a+"边形的边长为"+b+"\n"+"多边形的面积为："+rectangle1.getArea()+
// "\n"+"多边形的周长为："+rectangle1.getPerimeter());
// e=rectangle1.getArea( );
// f = rectangle1.getPerimeter();
// System.out.print(c);
// System.out.print(d);

