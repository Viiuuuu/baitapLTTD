package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs148;
	
	public QLHS() {
		dshs148 = new ArrayList<HocSinh>(10);
	}
	
	public void themHS(HocSinh hs) {
		dshs148.add(hs);
	}
	
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs;
		
		System.out.println("Nhap vao so luong hoc sinh: ");
		int n =sc.nextInt();sc.nextLine();

		System.out.println("Nhap vao thong tin hoc sinh trong danh sach: ");
		for(int i=0;i<n;i++) {
			System.out.println("Hoc sinh thu "+(i+1)+" la: ");
			
			hs = new HocSinh();
			hs.nhapThongTin(sc);
			
			themHS(hs);
		}
	}
	
	public void hienThiDanhSach() {
		int n = dshs148.size();
		for(int i=0;i<n;i++) {
			System.out.println("Hoc sinh thu "+(i+1)+" la: ");
			dshs148.get(i).hienThiThongTin();
		}
	}
	
	public void timKiemThongTin(int nam, String que) {
		for(HocSinh hs:dshs148) {
			if((hs.getNgaySinDate().getYear()+1900==nam) && (que.equals(hs.getQueQuan()))) {
				hs.hienThiThongTin();
			}
		}
	}
	
	public void timKiemThongTin(String lop) {
		for (HocSinh hs : dshs148) {
			if(lop.equals(hs.getLop())) {
				hs.hienThiThongTin();
			}
		}
	}
}
