/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiem;

import ConnectDatabase.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anonymous
 */
public class BangDiemDAO implements IBangDiemDAO {

    @Override
    public ArrayList<BangDiem> getAll() {
        //throw new UnsupportedOperationException("Not supported yet.");
        ArrayList<BangDiem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from tblDiem ");
                rs = ps.executeQuery();
                list = new ArrayList<BangDiem>();
                while (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMasv(rs.getString(1));
                    bd.setMamh(rs.getString(2));
                    bd.setLanthi(rs.getInt(3));
                    bd.setHeso(rs.getInt(4));
                    bd.setDiem(rs.getFloat(5));
                    bd.setTrangthai(rs.getBoolean(6));

                    list.add(bd);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<BangDiem> findByIDSinhVien(String masv) {
        ArrayList<BangDiem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from tblDiem where MaSV = ?");
                ps.setString(1, masv);
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMasv(rs.getString(1));
                    bd.setMamh(rs.getString(2));
                    bd.setLanthi(rs.getInt(3));
                    bd.setHeso(rs.getInt(4));
                    bd.setDiem(rs.getFloat(5));
                    bd.setTrangthai(rs.getBoolean(6));

                    list.add(bd);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<BangDiem> findByIDMonHoc(String mamh) {
        ArrayList<BangDiem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from tblDiem where MaMH = ?");
                ps.setString(1, mamh);
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMasv(rs.getString(1));
                    bd.setMamh(rs.getString(2));
                    bd.setLanthi(rs.getInt(3));
                    bd.setHeso(rs.getInt(4));
                    bd.setDiem(rs.getFloat(5));
                    bd.setTrangthai(rs.getBoolean(6));

                    list.add(bd);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public BangDiem addNew(BangDiem bd) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("insert into tblDiem (MaSV,MaMH,LanThi,HeSo,Diem,TrangThai) values (?,?,?,?,?,?)");
                ps.setString(1, bd.getMasv());
                ps.setString(2, bd.getMamh());
                ps.setInt(3, bd.getLanthi());
                ps.setInt(4, bd.getHeso());
                ps.setFloat(5, bd.getDiem());
                ps.setBoolean(6, bd.isTrangthai());
                int row = ps.executeUpdate();
                if (row < 1) {
                    bd = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps);
            }
        }
        return bd;
    }

    @Override
    public BangDiem upDate(BangDiem bd) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update tblDiem set HeSo =?,Diem = ?,TrangThai=? where MaSV =? and MaMH =? and LanThi=?");

                ps.setInt(1, bd.getHeso());
                ps.setFloat(2, bd.getDiem());
                ps.setBoolean(3, bd.isTrangthai());
                ps.setString(4, bd.getMasv());
                ps.setString(5, bd.getMamh());
                ps.setInt(6, bd.getLanthi());
                int row = ps.executeUpdate();
                if (row < 1) {
                    bd = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close();
            }
        }
        return bd;
    }

    public void delBangDiem(String MaSV, String MaMH, int LanThi) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblDiem where MaSV =? and MaMH =? and LanThi =?");
            ps.setString(1, MaSV);
            ps.setString(2, MaMH);
            ps.setInt(3, LanThi);
            ps.executeUpdate();
            DBConnect.close();
        }
    }

    @Override
    public boolean CheckID(String masv, String mamh, int lanthi) {
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        boolean result = true;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.cnn.prepareStatement("select * from tblDiem where MaSV =? and MaMH =? and LanThi =?");
                psCheck.setString(1, masv);
                psCheck.setString(2, mamh);
                psCheck.setInt(3, lanthi);
                rs = psCheck.executeQuery();
                result = rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(psCheck, rs);
            }
        }
        return result;
    }

    @Override
    public ArrayList<BangDiem> findMaMH(String masv) {
        ArrayList<BangDiem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select DISTINCT mamh from tblDiem where trangthai is not null and masv=?");
                ps.setString(1, masv);
                rs = ps.executeQuery();
                list = new ArrayList<BangDiem>();
                while (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMasv(rs.getString(1));
                    bd.setMamh(rs.getString("mamh"));
//                    bd.setLanthi(rs.getInt("LanThi"));
//                    bd.setHeso(rs.getInt("HeSo"));
//                    bd.setDiem(rs.getFloat("Diem"));
                    list.add(bd);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }


    public ArrayList<BangDiem> loaddiem(String masv, String maMon) {
        ArrayList<BangDiem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select lanthi, heso, diem from tblDiem where mamh =? and masv=?");
                ps.setString(1, maMon);
                ps.setString(2, masv);
                rs = ps.executeQuery();
                list = new ArrayList<BangDiem>();
                while (rs.next()) {
                    BangDiem bd = new BangDiem();
                    //bd.setMasv(rs.getString(1));
//                    bd.setMamh(rs.getString("mamh"));
                    bd.setLanthi(rs.getInt("LanThi"));
                    bd.setHeso(rs.getInt("HeSo"));
                    bd.setDiem(rs.getFloat("Diem"));
                    list.add(bd);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<BangDiem> findMasv() {
          ArrayList<BangDiem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select DISTINCT masv from tblDiem where  trangthai is not null");
                rs = ps.executeQuery();
                list = new ArrayList<BangDiem>();
                while (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMasv(rs.getString(1));
                    list.add(bd);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BangDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new BangDiemDAO().findMaMH("SV001").get(0).getMasv());
    }
}
