package Class;

import java.util.Scanner;

public class PhanSo {
	private int tuSo117, mauSo117;
	
	public PhanSo() {
		tuSo117 = 0;
		mauSo117 = 1;
	}
	
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo117 = tuSo;
		this.mauSo117 = mauSo;
	}
	
	public void nhapPS(Scanner sc) {
		int a;
		int b;
		
		do
		{
			System.out.println("Nhap vao tu so: ");
			a = sc.nextInt();
			
			System.out.println("Nhap vao mau so: ");
			b = sc.nextInt();
			if(b==0)
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			else
				tuSo117=a;
				mauSo117=b;
		}
		while(b==0);
	}
	public void hienThiPS() {
		if(tuSo117*mauSo117<0) 
			System.out.println("-"+ Math.abs(tuSo117)+"/"+Math.abs(mauSo117));
		else
			System.out.println( Math.abs(tuSo117)+"/"+Math.abs(mauSo117));
	}
	
	public PhanSo congPS(PhanSo ps2) {
		int a = tuSo117*ps2.mauSo117 + ps2.tuSo117*mauSo117;
		int b = mauSo117*ps2.mauSo117;
		return new PhanSo(a,b);		
	}
	
	public PhanSo truPS(PhanSo ps2) {
		int a = tuSo117*ps2.mauSo117 - ps2.tuSo117*mauSo117;
		int b = mauSo117*ps2.mauSo117;
		return new PhanSo(a,b);		
	}
	
	public PhanSo nhanPS(PhanSo ps2) {
		int a =tuSo117*ps2.tuSo117;
		int b = mauSo117*ps2.mauSo117;
		return new PhanSo(a,b);	
	}
	
	public PhanSo chiaPS(PhanSo ps2) {
		int a =tuSo117*ps2.mauSo117;
		int b = mauSo117*ps2.tuSo117;
		return new PhanSo(a,b);	
	}
	
	private int timUSCLN(int a, int b) {
		int r=a%b;
		
		while(r!=0) {
			a=b;
			b=r;
			r=a%b;
		}
		return b;
	}
	
	public boolean kiemTraToiGian() {
		if(timUSCLN(mauSo117, mauSo117)==1)
			return true;
		return false;
	}
	
	public void toiGianPS() {
		int x = timUSCLN(mauSo117, mauSo117);
		tuSo117/=x;
		mauSo117/=x;
	}
}
