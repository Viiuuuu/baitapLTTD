package Test;

import java.util.Scanner;

import Class.KhuPho;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhuPho qlkp148 = new KhuPho();
		
		qlkp148.nhapDanhSach(sc);
		
		System.out.println("Danh sach ho dan co nguoi 80 tuoi la: ");
		qlkp148.timKiemThongTin();

	}

}
