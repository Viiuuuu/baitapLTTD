package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<CBGV> ds;
	
	public QuanLy() {
		ds = new ArrayList<CBGV>(10);
	}
	
	public void themCanBo(CBGV canBo) {
		ds.add(canBo);
	}
	
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo;
		
		System.out.println("Nhap vao can so luong can bo: ");
		int n =sc.nextInt();sc.nextLine();
		
		System.out.println("Nhap vao thong tin can bo:");
		for(int i=0;i<n;i++) {
			System.out.println("Can bo thu "+(i+1)+" la: " );
			canBo = new CBGV();
			canBo.nhapThongTin(sc);
			
			themCanBo(canBo);
		}
	}
	
	public void hienThiThongTin() {
		for (CBGV cbgv : ds) {
			cbgv.hienThiThongTin();
		}
	}
	
	public void timKiem(double luong) {
		for (CBGV cbgv : ds) {
			if(cbgv.getLuongTL()>=luong) {
				cbgv.hienThiThongTin();
			}
		}
	}
}
