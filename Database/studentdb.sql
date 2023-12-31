CREATE DATABASE Studentdatabase
GO
USE [Studentdatabase]
GO
/****** Object:  Table [dbo].[tblDangNhap]    Script Date: 5/28/2023 10:25:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblDangNhap](
	[TenDangNhap] [nvarchar](50) NOT NULL,
	[MatKhau] [nvarchar](20) NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[Email] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_tblDangNhap] PRIMARY KEY CLUSTERED 
(
	[TenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblDiem]    Script Date: 5/28/2023 10:25:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblDiem](
	[MaSV] [nvarchar](10) NOT NULL,
	[MaMH] [nvarchar](10) NOT NULL,
	[LanThi] [tinyint] NOT NULL,
	[HeSo] [tinyint] NULL,
	[Diem] [float] NULL,
	[TrangThai] [bit] NULL,
 CONSTRAINT [PK_tblDiem] PRIMARY KEY CLUSTERED 
(
	[MaSV] ASC,
	[MaMH] ASC,
	[LanThi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblGiangVien]    Script Date: 5/28/2023 10:25:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblGiangVien](
	[MaGV] [nvarchar](10) NOT NULL,
	[HoTenGV] [nvarchar](70) NOT NULL,
	[MaMH] [nvarchar](10) NOT NULL,
	[NgaySinh] [datetime] NULL,
	[GioiTinh] [bit] NULL,
	[Email] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](70) NULL,
	[SDT] [nvarchar](15) NULL,
 CONSTRAINT [PK_tblGiangVien] PRIMARY KEY CLUSTERED 
(
	[MaGV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblKhoa]    Script Date: 5/28/2023 10:25:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblKhoa](
	[MaKhoa] [nvarchar](10) NOT NULL,
	[TenKhoa] [nvarchar](50) NOT NULL,
	[SDT] [nvarchar](15) NULL,
 CONSTRAINT [PK_tblKhoa] PRIMARY KEY CLUSTERED 
(
	[MaKhoa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblLop]    Script Date: 5/28/2023 10:25:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblLop](
	[MaLop] [nvarchar](10) NOT NULL,
	[TenLop] [nvarchar](50) NOT NULL,
	[MaKhoa] [nvarchar](10) NOT NULL,
	[KhoaHoc] [nvarchar](20) NULL,
 CONSTRAINT [PK_tblLop] PRIMARY KEY CLUSTERED 
(
	[MaLop] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblMonHoc]    Script Date: 5/28/2023 10:25:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblMonHoc](
	[MaMH] [nvarchar](10) NOT NULL,
	[TenMH] [nvarchar](20) NOT NULL,
	[SoTrinh] [int] NULL,
	[HinhThucThi] [nvarchar](20) NULL,
	[HocKy] [int] NULL,
	[PhongHoc] [nvarchar](10) NULL,
 CONSTRAINT [PK_tblMonHoc] PRIMARY KEY CLUSTERED 
(
	[MaMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblSinhVien]    Script Date: 5/28/2023 10:25:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblSinhVien](
	[MaSV] [nvarchar](10) NOT NULL,
	[HoTen] [nvarchar](70) NOT NULL,
	[MaLop] [nvarchar](10) NOT NULL,
	[HeDaoTao] [nvarchar](50) NOT NULL,
	[NgaySinh] [datetime] NULL,
	[DiaChi] [nvarchar](100) NULL,
	[GioiTinh] [bit] NULL,
	[SDT] [nvarchar](15) NULL,
 CONSTRAINT [PK_tblSinhVien] PRIMARY KEY CLUSTERED 
(
	[MaSV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[tblDangNhap] ([TenDangNhap], [MatKhau], [HoTen], [Email]) VALUES (N'chin', N'123456', N'Nguyễn Thị Ngọc Trinh', N'tn08042k2@gmail.com')
INSERT [dbo].[tblDiem] ([MaSV], [MaMH], [LanThi], [HeSo], [Diem], [TrangThai]) VALUES (N'SV001', N'MH001', 1, 1, 8, 1)
INSERT [dbo].[tblDiem] ([MaSV], [MaMH], [LanThi], [HeSo], [Diem], [TrangThai]) VALUES (N'SV002', N'MH001', 2, 1, 9, 1)
INSERT [dbo].[tblGiangVien] ([MaGV], [HoTenGV], [MaMH], [NgaySinh], [GioiTinh], [Email], [DiaChi], [SDT]) VALUES (N'GV001', N'Nguyễn Văn A', N'MH001', CAST(N'1978-01-01 00:00:00.000' AS DateTime), 1, N'anv@gmail.com', N'HCM', N'0981234324')
INSERT [dbo].[tblGiangVien] ([MaGV], [HoTenGV], [MaMH], [NgaySinh], [GioiTinh], [Email], [DiaChi], [SDT]) VALUES (N'GV002', N'Nguyễn Văn B', N'MH002', CAST(N'1987-08-02 00:00:00.000' AS DateTime), 1, N'bnv@gmail.com', N'HCM', N'0973654090')
INSERT [dbo].[tblGiangVien] ([MaGV], [HoTenGV], [MaMH], [NgaySinh], [GioiTinh], [Email], [DiaChi], [SDT]) VALUES (N'GV003', N'Nguyễn Văn C', N'MH002', CAST(N'1982-08-05 00:00:00.000' AS DateTime), 1, N'cnv@gmail.com', N'Hà Nội', N'0973678543')
INSERT [dbo].[tblGiangVien] ([MaGV], [HoTenGV], [MaMH], [NgaySinh], [GioiTinh], [Email], [DiaChi], [SDT]) VALUES (N'GV004', N'Trần Văn D', N'MH002', CAST(N'1872-08-03 00:00:00.000' AS DateTime), 1, N'dtv@gmail.com', N'HCM', N'0973654321')
INSERT [dbo].[tblGiangVien] ([MaGV], [HoTenGV], [MaMH], [NgaySinh], [GioiTinh], [Email], [DiaChi], [SDT]) VALUES (N'GV006', N'Nguyễn Thị L', N'MH001', CAST(N'1982-01-22 00:00:00.000' AS DateTime), 0, N'lnt@gmail.com', N'Hà Nam', N'098325123')
INSERT [dbo].[tblKhoa] ([MaKhoa], [TenKhoa], [SDT]) VALUES (N'CNTT', N'Công Nghệ Thông Tin', N'0973654090')
INSERT [dbo].[tblKhoa] ([MaKhoa], [TenKhoa], [SDT]) VALUES (N'KT', N'Kế Toán', N'0973654091')
INSERT [dbo].[tblKhoa] ([MaKhoa], [TenKhoa], [SDT]) VALUES (N'QTKD', N'Quản Trị Kinh Doanh', N'0145674367')
INSERT [dbo].[tblKhoa] ([MaKhoa], [TenKhoa], [SDT]) VALUES (N'TCNH', N'Tài Chính Ngân Hàng', N'0167853906')

INSERT [dbo].[tblLop] ([MaLop], [TenLop], [MaKhoa], [KhoaHoc]) VALUES (N'CN1', N'Công Nghệ 1', N'CNTT', N'2020 - 2024')
INSERT [dbo].[tblLop] ([MaLop], [TenLop], [MaKhoa], [KhoaHoc]) VALUES (N'CN2', N'Công nghệ 2', N'CNTT', N'2020 - 2024')
INSERT [dbo].[tblLop] ([MaLop], [TenLop], [MaKhoa], [KhoaHoc]) VALUES (N'CN3', N'Công Nghệ 3', N'CNTT', N'2020 - 2024')
INSERT [dbo].[tblLop] ([MaLop], [TenLop], [MaKhoa], [KhoaHoc]) VALUES (N'CN4', N'Công nghệ 4', N'CNTT', N'2020 - 2024')
INSERT [dbo].[tblLop] ([MaLop], [TenLop], [MaKhoa], [KhoaHoc]) VALUES (N'CN5', N'Công nghệ 5', N'CNTT', N'2020 - 2024')
INSERT [dbo].[tblLop] ([MaLop], [TenLop], [MaKhoa], [KhoaHoc]) VALUES (N'CN6', N'Công nghệ 6', N'CNTT', N'2020 - 2024')
INSERT [dbo].[tblLop] ([MaLop], [TenLop], [MaKhoa], [KhoaHoc]) VALUES (N'CN7', N'Công Nghệ 7', N'CNTT', N'2020 - 2024')

INSERT [dbo].[tblMonHoc] ([MaMH], [TenMH], [SoTrinh], [HinhThucThi], [HocKy], [PhongHoc]) VALUES (N'MH001', N'Java', 2, N'Thi Thực Hành', 3, N'B305')
INSERT [dbo].[tblMonHoc] ([MaMH], [TenMH], [SoTrinh], [HinhThucThi], [HocKy], [PhongHoc]) VALUES (N'MH002', N'.NET', 3, N'Thi Thực Hành', 5, N'B307')
INSERT [dbo].[tblMonHoc] ([MaMH], [TenMH], [SoTrinh], [HinhThucThi], [HocKy], [PhongHoc]) VALUES (N'MH003', N'Tiếng Anh', 1, N'Thi Viết', 1, N'B305')

INSERT [dbo].[tblSinhVien] ([MaSV], [HoTen], [MaLop], [HeDaoTao], [NgaySinh], [DiaChi], [GioiTinh], [SDT]) VALUES (N'SV001', N'Nguyễn Thị Ngọc Trinh', N'CN4', N'Chính Quy', CAST(N'2002-08-22 00:00:00.000' AS DateTime), N'Quy Nhơn', 0, N'0973654090')
INSERT [dbo].[tblSinhVien] ([MaSV], [HoTen], [MaLop], [HeDaoTao], [NgaySinh], [DiaChi], [GioiTinh], [SDT]) VALUES (N'SV002', N'Nguyễn Quang Phúc', N'CN2', N'Chính Quy', CAST(N'2002-08-22 00:00:00.000' AS DateTime), N'Gia Lai', 1, N'0987654322')
INSERT [dbo].[tblSinhVien] ([MaSV], [HoTen], [MaLop], [HeDaoTao], [NgaySinh], [DiaChi], [GioiTinh], [SDT]) VALUES (N'SV003', N'Nguyễn Duy Thịnh', N'CN4', N'Chính Quy', CAST(N'2002-08-23 00:00:00.000' AS DateTime), N'Phú Yên', 1, N'9888854770')
INSERT [dbo].[tblSinhVien] ([MaSV], [HoTen], [MaLop], [HeDaoTao], [NgaySinh], [DiaChi], [GioiTinh], [SDT]) VALUES (N'SV004', N'Nguyễn Thành Tâm', N'CN2', N'Chính Quy', CAST(N'2002-08-22 00:00:00.000' AS DateTime), N'HCM', 1, N'0973123543')

ALTER TABLE [dbo].[tblDiem]  WITH CHECK ADD  CONSTRAINT [FK_tblDiem_tblMonHoc] FOREIGN KEY([MaMH])
REFERENCES [dbo].[tblMonHoc] ([MaMH])
GO
ALTER TABLE [dbo].[tblDiem] CHECK CONSTRAINT [FK_tblDiem_tblMonHoc]
GO
ALTER TABLE [dbo].[tblDiem]  WITH CHECK ADD  CONSTRAINT [FK_tblDiem_tblSinhVien] FOREIGN KEY([MaSV])
REFERENCES [dbo].[tblSinhVien] ([MaSV])
GO
ALTER TABLE [dbo].[tblDiem] CHECK CONSTRAINT [FK_tblDiem_tblSinhVien]
GO
ALTER TABLE [dbo].[tblGiangVien]  WITH CHECK ADD  CONSTRAINT [FK_tblGiangVien_tblMonHoc] FOREIGN KEY([MaMH])
REFERENCES [dbo].[tblMonHoc] ([MaMH])
GO
ALTER TABLE [dbo].[tblGiangVien] CHECK CONSTRAINT [FK_tblGiangVien_tblMonHoc]
GO
ALTER TABLE [dbo].[tblLop]  WITH CHECK ADD  CONSTRAINT [FK_tblLop_tblKhoa] FOREIGN KEY([MaKhoa])
REFERENCES [dbo].[tblKhoa] ([MaKhoa])
GO
ALTER TABLE [dbo].[tblLop] CHECK CONSTRAINT [FK_tblLop_tblKhoa]
GO
ALTER TABLE [dbo].[tblSinhVien]  WITH CHECK ADD  CONSTRAINT [FK_tblSinhVien_tblLop] FOREIGN KEY([MaLop])
REFERENCES [dbo].[tblLop] ([MaLop])
GO
ALTER TABLE [dbo].[tblSinhVien] CHECK CONSTRAINT [FK_tblSinhVien_tblLop]
GO
