package basic.dev;

public class Book {
	String maSach;
	String ho;
	String ten;
	String tenSach;
	String theLoai;
	double gia;
	String ngayXuatBan;
	public Book(String maSach, String ho, String ten, String tenSach, String theLoai, double gia, String ngayXuatBan) {
		super();
		this.maSach = maSach;
		this.ho = ho;
		this.ten = ten;
		this.tenSach = tenSach;
		this.theLoai = theLoai;
		this.gia = gia;
		this.ngayXuatBan = ngayXuatBan;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ma: %s, ho: %s, ten: %s, tenSach: %s, the loai: %s, gia: %f, ngay: %s ", maSach,ho,ten,tenSach,theLoai,gia,ngayXuatBan);
	}
}
