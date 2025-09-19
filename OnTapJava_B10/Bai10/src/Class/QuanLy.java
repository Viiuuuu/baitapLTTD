package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<BienLai> ds148;
	
	public QuanLy() {
		ds148=new ArrayList<BienLai>(10);
		
	}
	
	public void themBienLai(BienLai bienLai) {
		ds148.add(bienLai);
	}
	
	public void nhapDanhSach(Scanner sc) {
		BienLai bienLai;
		System.out.println("Nhap vao so luong bien lai: ");
		int n=sc.nextInt();sc.nextLine();
		System.out.println("Nhap vao danh sach bien lai: ");
		for(int i=0;i<n;i++) {
			System.out.println("Bien lai thu "+(i+1)+" la: ");
			bienLai=new BienLai();
			bienLai.nhapThongTin(sc);
			
			themBienLai(bienLai);
		}
			
	}
	
	public void hienThiDanhSach() {
		for(int i=0;i<ds148.size();i++) {
			System.out.println("Bien lai thu "+(i+1)+" la: ");
			ds148.get(i).hienThiThongTin();
			System.out.println();
		}
	}
}
