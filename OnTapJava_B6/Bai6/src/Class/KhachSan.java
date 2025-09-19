package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	private ArrayList<KhachTro> ds148;
	
	public KhachSan() {
		ds148 = new ArrayList<KhachTro>(10);
	}
	
	public void themKhachTro(KhachTro kt) {
		ds148.add(kt);
	}
	
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach;
		
		System.out.println("Nhap vao so luong khach: ");
		int n = sc.nextInt();sc.nextLine();
		
		System.out.println("Nhap vao danh sach khach tro: ");
		for(int i = 0; i<n;i++) {
			System.out.println("Khach tro thu "+(i+1)+" la: ");
			khach = new KhachTro();
			khach.nhapThongTin(sc);
			themKhachTro(khach);
		}
	}
	public void hienThiDanhSach() {
		for (KhachTro khach : ds148) {
			khach.hienThiThongTin();
		}
	}
	public double tinhTien(int CMND) {
		double tien = 0;
		for(KhachTro khach:ds148) {
			if(khach.getCMND()==CMND);
				tien=khach.getSoNgayTro()*khach.getGiaPhong();
		}
		return tien;
	}
}
