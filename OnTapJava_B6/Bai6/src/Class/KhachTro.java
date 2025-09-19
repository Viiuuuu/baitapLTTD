package Class;

import java.util.Date;
import java.util.Scanner;

public class KhachTro extends Nguoi {
	private int soNgayTro148;
	private String loaiPhong148;
	private double giaPhong148;
	public KhachTro() {
	
	}
	public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen148 = hoTen;
		this.CMND148 = CMND;
		this.soNgayTro148 = soNgayTro;
		this.loaiPhong148 = loaiPhong;
		this.giaPhong148 = giaPhong;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap vao so ngay tro: ");
		soNgayTro148 = sc.nextInt();loaiPhong148 = sc.nextLine();
		System.out.println("Nhap vao loai phong: ");
		loaiPhong148 = sc.nextLine();
		System.out.println("Nhap gia phong: ");
		giaPhong148 = sc.nextDouble();sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		
		System.out.println("So ngay tro" +soNgayTro148);
		System.out.println("Loai phong" +loaiPhong148);
		System.out.println("Gia phong" +giaPhong148);
	}
	
	public int getSoNgayTro() {
		return soNgayTro148;
	}
	
	public double getGiaPhong() {
		return giaPhong148;
	}
}
