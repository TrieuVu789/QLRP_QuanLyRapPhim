public class Phim {
    private String tenPhim;
    private int nam;
    //private String hangSanXuat;
    private float giaVe;
    private Ngay ngayChieu;
    private HangSanXuat hangSanXuat;

    public Phim(String tenPhim, int nam, float giaVe, Ngay ngayChieu, HangSanXuat hangSanXuat) {
        this.tenPhim = tenPhim;
        this.nam = nam;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public float getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(float giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }


    public String inRaTenHangSX(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public boolean kiemTraGiaVeBoPhimKhac(Phim phimKhac){
        return this.giaVe==phimKhac.getGiaVe();
    }
    public double giaSauKhiKhuyenMai(double x){
        return this.giaVe*(1-x/100);
    }

}
