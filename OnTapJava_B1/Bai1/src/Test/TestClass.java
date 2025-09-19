package Test;

import java.util.Scanner;

import Class.PhanSo;

public class TestClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	PhanSo ps1 = new PhanSo();
	PhanSo ps2 = new PhanSo();
	PhanSo psTong = new PhanSo();
	PhanSo psHieu = new PhanSo();
	PhanSo psTich = new PhanSo();
	PhanSo psThuong = new PhanSo();
	
	System.out.println("Nhap vao phan so thu nhat: ");
	ps1.nhapPS(sc);
	System.out.println("Nhap vao phan so thu hai: ");
	ps2.nhapPS(sc);
	
	psTong = ps1.congPS(ps2);
	System.out.println("Phan so thu nhat: ");
	ps1.hienThiPS();
	System.out.println("Phan so thu hai: ");
	ps2.hienThiPS();
	System.out.println("Tong hai phan so bang: ");
	psTong.hienThiPS();
	
	psHieu = ps1.truPS(ps2);
	System.out.println("Hieu hai phan so bang: ");
	psHieu.hienThiPS();
	
	psTich = ps1.nhanPS(ps2);
	System.out.println("Tich hai phan so bang: ");
	psTich.hienThiPS();
	
	psThuong = ps1.chiaPS(ps2);
	System.out.println("Thuong hai phan so bang: ");
	psThuong.hienThiPS();
}
}
