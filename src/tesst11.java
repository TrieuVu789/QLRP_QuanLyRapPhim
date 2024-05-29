public class tesst11 {
    public static void main(String[] args) {
    Ngay ngay1 = new Ngay(11,07,2004);
    Ngay ngay2 = new Ngay(11,07,2004);
    Ngay ngay3 = new Ngay(13,07,2002);

    HangSanXuat hang1 = new HangSanXuat("VTV","vietnam");
    HangSanXuat hang2 = new HangSanXuat("VTV1","vietnam12");
    HangSanXuat hang3 = new HangSanXuat("VTV2","vietnam33");

    Phim phim1 = new Phim("anhem0",2004,10000,ngay1,hang1);
    Phim phim2 = new Phim("anhem110",2044,1120,ngay1,hang2);
    Phim phim3 = new Phim("anhem31230",2104,10000,ngay1,hang3);

        System.out.println("In Ra Ten Hang: "+phim1.inRaTenHangSX());
        System.out.println("In Ra Ten Hang: "+phim2.inRaTenHangSX());
        System.out.println("In Ra Ten Hang: "+phim3.inRaTenHangSX());

        System.out.println("Kiem Tra Gia Ve:"+ phim1.kiemTraGiaVeBoPhimKhac(phim2));
        System.out.println("Kiem Tra Gia Ve:"+ phim1.kiemTraGiaVeBoPhimKhac(phim3));

        System.out.println("Gia sau khi Giam gia 10%: "+ phim1.giaSauKhiKhuyenMai(10));
        System.out.println("Gia sau khi Giam gia 40%: "+ phim1.giaSauKhiKhuyenMai(40));
        System.out.println("Gia sau khi Giam gia 60%: "+ phim1.giaSauKhiKhuyenMai(60));
    }
}
