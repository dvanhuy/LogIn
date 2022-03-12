create database ConnectJava
go
use ConnectJava
go
-- Tao bang user
create table NguoiDung(
	ID int primary key,
	ten nvarchar(45),
	sdt varchar(45),
	tenTK varchar(45),
	matkhau varchar(45),
	gioiThieu nvarchar(100),
	vaiTro nvarchar(45),
	soThich nvarchar(45)
)
go
insert into NguoiDung 
values	(1,N'Nguyễn A',0905123456,'abc',12345,N'huy',N'Admin',N'Xem phim'),
		(2,N'Lê B',0905123457,'abc',12345,N'fgf',N'User',N'Xem phim'),
		(3,N'Trần C',0905123458,'abc',12345,N'ha',N'User',N'Nghe nhạc'),
		(4,N'Đinh D',0905123459,'abc',12345,N'huy',N'User',N'Nghe nhạc'),
		(5,N'Trần D',0945465459,'tyu',12845,N'huy',N'Admin',N'Nghe nhạc')

use ConnectJava

go
create table TaiLieu
(
	id char(5) primary key,
	tenNXB nvarchar(30),
	soBanPhatHanh int,
	tenTacGia nvarchar(30),
	soTrang int,
	soPhatHanh nvarchar(20),
	thangPhatHanh int,
	ngayPhatHanh date,
	loai nvarchar(10),
	constraint CK_TaiLieu_loai check (loai IN ('sach','tapchi','bao'))
)
set dateformat dmy
insert into TaiLieu
values 
		('SA001',N'Kim Đồng',10,N'Vũ Trọng Phụng',300,NULL,NULl,NULl,'sach'),
		('SA002',N'Thiếu Nhi',11,N'Đinh A',303,NULL,NULl,NULl,'sach'),
		('SA003',N'ABC',30,N'Trần Ngọc',200,NULL,NULl,NULl,'sach'),
		('TC001',N'Thiếu Nhi',100,NULL,NULl,N'NTT1',2,NULl,'tapchi'),
		('TC002',N'Kim Đồng',60,NULL,NULl,N'NBT1',12,NULl,'tapchi'),
		('TC003',N'Thiếu Nhi',20,NULL,NULl,N'NCT1',1,NULl,'tapchi'),
		('BA001',N'ABC',200,NULL,NULL,NULl,NULl,'10/2/2001','bao'),
		('BA002',N'Kim Đồng',150,NULL,NULL,NULl,NULl,'15/5/2001','bao'),
		('BA003',N'ABC',170,NULL,NULL,NULl,NULl,'20/6/2001','bao')

go
use ConnectJava
create table SanPham
(
	maSP char(5) not null,
	tenSP nvarchar(50) not null,
	donGiaBan money not null,
	tenNSX nvarchar(50),
	soLuongHienCon int
)

insert into SanPham(maSP,TenSP,donGiaBan,tenNSX ,soLuongHienCon)
values  ('SP001',N'Sữa Vinamilk',400000,N'Vinamilk',5000),
        ('SP002',N'Kẹo dẻo',600000,N'Bến tre',4000),
        ('SP003',N'Bánh ngọt',40000,N'Bến tre',10),
        ('SP004',N'Sách',450000,N'Kim Đồng',22),
        ('SP005',N'Sữa Milo',500000,N'Vinamilk',100),
        ('SP006',N'Sữa Vinamilk',30000,N'Vinamilk',123),
        ('SP007',N'Cocacola',1500000,N'Pepsi',123),
        ('SP008',N'Pepsi',700000,N'Pepsi',456)

go
use ConnectJava
go

create or alter function FN_idTiepSanPham
()
returns char(5)
as
begin
	declare @id char(5)
	select top 1  @id=maSP
	from SanPham
	order by maSP desc
	declare @lastnumber int
	set @lastnumber=right(@id,3)+1
	declare @nextchar char(5)
	set @nextchar=CONCAT('SP', format (@lastnumber, 'D3'))
	return @nextchar
end
go
