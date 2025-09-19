package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<TheMuon> ds148;
	
	public QuanLy() {
		ds148 = new ArrayList<TheMuon>(10);
	}
	
	public void themTheMuon(TheMuon theMuon) {
		ds148.add(theMuon);
	}
	
	public void nhapDanhSach(Scanner sc) {
		TheMuon theMuon;
		
		System.out.println("Nhap vao so luong the muon: ");
		int n=sc.nextInt();sc.nextLine();
		
		System.out.println("Nhap vao danh sach: ");
		for(int i=0;i<n;i++) {
			System.out.println("The muon thu "+(i+1)+" la: ");
			theMuon= new TheMuon();
			theMuon.nhapThongTin(sc);
			themTheMuon(theMuon);
		}
	}
	
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the : ds148) {
			if(the.getHanTra().getDate()==31 || the.getHanTra().getDate()==30) {
				the.hienThiThongTin();
			}
		}
	}
}
