package Class;
import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi{
	private int soNguoi148, soNha148;
	private Nguoi[] list148;
	public HoDan() {
		list148 = new Nguoi[10];
	}
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi148 = soNguoi;
		this.soNha148 = soNha;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap so nguoi: ");
		soNguoi148 = sc.nextInt();sc.nextLine();
		System.out.println("Nhap so nha: ");
		soNha148 = sc.nextInt();sc.nextLine();
		System.out.println("Nhap thong tin cho tung nguoi trong ho: ");
		for(int i = 0;i<soNguoi148;i++) {
			System.out.println("Nguoi thu "+(i+1)+" la: ");
			list148[i] = new Nguoi();
			list148[i].nhapThongTin(sc);		
		}
	}
	
	public void hienThiThongTin() {
		System.out.println("So nguoi: "+soNguoi148);
		System.out.println("So nha: "+soNha148);
		System.err.println("Thong tin tung nguoi trong gia dinh: ");
		for(int i = 0;i<soNguoi148;i++) {
			System.out.println("Nguoi thu "+(i+1)+" la: ");
			list148[i].hienThiThongTin();
		}
	}
	
	public Nguoi[] getList() {
		return list148;
	}
	
	public int getSoNguoi() {
		return soNguoi148;
	}
}
