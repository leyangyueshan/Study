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
// * ���صĹ����������صķ���
// * 
// * 
// * ����Tree�ǹ��������ƣ�info()�Ƿ������������������������һ�£�
// * ���صĹ������ͷ��������ж�һ�޶��Ĳ����б�������������������*/
//class Tree {
//	int height;
//
//	Tree() {
//		System.out.println("��ֲһ������");
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
//	// ���ط���
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
//		// ���ع�����
//		new Tree();
//	}
//
//}

/* ������ */
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
// gb.board[x - 1][y - 1] = "��   ";
// black[x - 1][y - 1] = 1;
// win(black, x - 1, y - 1);
// }
// if (flag % 2 != 0) {
// gb.board[x - 1][y - 1] = "��   ";
// white[x - 1][y - 1] = 1;
// win(white, x - 1, y - 1);
// }
// gb.printboard();
// System.out.print("����������������꣺");
// }
//
// }
//
// private static void win(int[][] select, int x, int y) {
//
// /* �������Ƿ������ */
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
// /* �������Ƿ������ */
// for (int i = y - 4; i <= y; i++) {
// sum2 = select[x][i] + select[x][i + 1] + select[x][i + 2]
// + select[x][i + 3] + select[x][i + 4];
// //System.out.println(sum2);
// if (sum2 == 5) {
// System.out.print("you win!"+"\n");
// break;
// }
// }
// /* ���Խ��߼���Ƿ������ */
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
// /* б�Խ��߼���Ƿ������ */
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
// board[i][j] = "��   ";
// }
// }
//
// }
// }

/* ������ */
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
/* �������������Լ�� */

// Scanner input = new Scanner(System.in);
// System.out.print("�������һ������");
// short a = input.nextShort();
// System.out.print("������ڶ�������");
// short b = input.nextShort();
// if (a >= b) {
// System.out.print(a + "��" + b + "�����Լ��Ϊ" + max(a, b));
// } else {
// System.out.print(a + "��" + b + "�����Լ��Ϊ" + max(b, a));
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
 * �ݹ飺��ŵ������ ������������ָ����С��ͬ��n�����Ӵ�A����ȫ���Ƶ�B���� �ƶ�����
 * n�����ӷֱ���Ϊ1,2,3......n;�������ֱ���ΪA��B��C; �κ�ʱ�����Ӷ����ܷ��ڱ���С�������Ϸ� ��ʼ״̬ʱ���������Ӷ�����A��
 * ÿ��ֻ���ƶ�һ�����ӣ����������ֻ��������
 */
// System.out.print("���������Ӹ���n��");
// Scanner input = new Scanner(System.in);
// int a = input.nextInt();
// System.out.print("�ƶ�˳��Ϊ��" + "\n");
// move(a, 'A', 'B', 'C');
// }
//
// private static void move(int a, char A, char B, char C) {
// if (a == 1) {
// System.out.print("��"+(++b)+"����"+"������" + a + "��" + A + "�ƶ���" + B + "\n");
// } else {
// move(a - 1, A, C, B);
// System.out.print("��"+(++b)+"����"+"������" + a + "��" + A + "�ƶ���" + B + "\n");
// move(a - 1, C, B, A);
// }
//
// }
// }

/* �ݹ飺쳲��������� */
// System.out.print("��������Ҫ���ҵ�λ�ã�");
// Scanner input = new Scanner(System.in);
// int a = input.nextInt();
// int b = a - 1;
// System.out.print("�����ҵ�쳲��������е�" + a + "λ�õ�ֵ��" + digui(b));
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

/* �ļ�I/O��demo */
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

/* �̳м��ӿ���demo */
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

/* ���������͵������飬��������� */
// System.out.println("������Ԫ�ظ�����");
// Scanner input = new Scanner(System.in);
// int a = input.nextInt();
// int[] b = new int[a];
//
// System.out.println("������Ԫ�أ�");
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

/* ��ӡ2�ݺ��������� */
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

/* ����һ���ַ����ж�ÿ����ĸ���ֵĴ��� */
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
// System.out.print(c+"������"+count[j]+"�Ρ�"+"\n");
// }
// }
//

/* ����һ����С���ţ������ţ���������ɵ��ַ������ж����Ƿ�ȫ����� */

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

/* ����������α������߳����������꣬���������ܳ������ */

// double a,b,c,d;
// System.out.printf("���������εı������߳����������꣺");
// Scanner input = new Scanner(System.in);
// a = input.nextDouble();
// b = input.nextDouble();
// c = input.nextDouble();
// d = input.nextDouble();
// Rectanglel rectangle1 = new Rectanglel(a,b,c,d);
// System.out.print(a+"���εı߳�Ϊ"+b+"\n"+"����ε����Ϊ��"+rectangle1.getArea()+
// "\n"+"����ε��ܳ�Ϊ��"+rectangle1.getPerimeter());
// e=rectangle1.getArea( );
// f = rectangle1.getPerimeter();
// System.out.print(c);
// System.out.print(d);

