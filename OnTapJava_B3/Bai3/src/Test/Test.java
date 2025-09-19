package Test;

import java.util.Scanner;

import Class.QuanLySach;
import Class.Sach;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QuanLySach qls = new QuanLySach();
		
		qls.nhapDanhSachTL(sc);
		
		System.out.println("Nhap loai tai lieu can tim: ");
		String loai = sc.nextLine();
		qls.timLoaiTL(loai);

		System.out.println("Nhap ma tai lieu can tim: ");
		String maTL = sc.nextLine();
		qls.timMaTL(maTL);
		
		sc.close();
	}

}
