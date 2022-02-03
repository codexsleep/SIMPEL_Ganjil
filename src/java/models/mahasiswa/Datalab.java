/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.mahasiswa;

/**
 *
 * @author Mahendra
 */
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.database;

public class Datalab {
    int id_lab, nolab, kapasitaslab, idpic, idpiclab, idkalab, idkalablab, idpeminjaman;
    String ruangkalab,kontakkalab,ruangpic,kontakpic, tgl_peminjaman, tgl_mulai, tgl_berakhir, statuspeminjaman;

    public String getStatuspeminjaman() {
        return statuspeminjaman;
    }

    public void setStatuspeminjaman(String statuspeminjaman) {
        this.statuspeminjaman = statuspeminjaman;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public String getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    public void setTgl_peminjaman(String tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }

    public String getTgl_mulai() {
        return tgl_mulai;
    }

    public void setTgl_mulai(String tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public String getTgl_berakhir() {
        return tgl_berakhir;
    }

    public void setTgl_berakhir(String tgl_berakhir) {
        this.tgl_berakhir = tgl_berakhir;
    }

    public String getRuangkalab() {
        return ruangkalab;
    }

    public void setRuangkalab(String ruangkalab) {
        this.ruangkalab = ruangkalab;
    }

    public String getKontakkalab() {
        return kontakkalab;
    }

    public void setKontakkalab(String kontakkalab) {
        this.kontakkalab = kontakkalab;
    }

    public String getRuangpic() {
        return ruangpic;
    }

    public void setRuangpic(String ruangpic) {
        this.ruangpic = ruangpic;
    }

    public String getKontakpic() {
        return kontakpic;
    }

    public void setKontakpic(String kontakpic) {
        this.kontakpic = kontakpic;
    }

    public int getIdkalab() {
        return idkalab;
    }

    public void setIdkalab(int idkalab) {
        this.idkalab = idkalab;
    }

    public int getIdkalablab() {
        return idkalablab;
    }

    public void setIdkalablab(int idkalablab) {
        this.idkalablab = idkalablab;
    }

    public String getNama_kalab() {
        return nama_kalab;
    }

    public void setNama_kalab(String nama_kalab) {
        this.nama_kalab = nama_kalab;
    }
    String namapic, nama_kalab;

    public String getNamapic() {
        return namapic;
    }

    public void setNamapic(String namapic) {
        this.namapic = namapic;
    }
    
    public int getIdpiclab() {
        return idpiclab;
    }

    public void setIdpiclab(int idpiclab) {
        this.idpiclab = idpiclab;
    }

    public int getIdpic() {
        return idpic;
    }

    public void setIdpic(int idpic) {
        this.idpic = idpic;
    }

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }
    String namalab, statuslab;

    public int getNolab() {
        return nolab;
    }

    public void setNolab(int nolab) {
        this.nolab = nolab;
    }

    public int getKapasitaslab() {
        return kapasitaslab;
    }

    public void setKapasitaslab(int kapasitaslab) {
        this.kapasitaslab = kapasitaslab;
    }

    public String getNamalab() {
        return namalab;
    }

    public void setNamalab(String namalab) {
        this.namalab = namalab;
    }

    public String getStatuslab() {
        return statuslab;
    }

    public void setStatuslab(String statuslab) {
        this.statuslab = statuslab;
    }

    public database getDb() {
        return db;
    }

    public void setDb(database db) {
        this.db = db;
    }

    database db = null;

    public Datalab() {
        db = new database();
    }

    public List tampil() {
        List<Datalab> data = new ArrayList<Datalab>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_lab order by nama_lab asc";
            rs = db.getData(sql);
            while (rs.next()) {
                Datalab dl = new Datalab();
                dl.setId_lab(rs.getInt("id_lab"));
                dl.setIdpiclab(rs.getInt("id_pic"));
                dl.setIdkalablab(rs.getInt("id_kalab"));
                dl.setNolab(rs.getInt("no_lab"));
                dl.setNamalab(rs.getString("nama_lab"));
                dl.setKapasitaslab(rs.getInt("kapasitas_lab"));
                dl.setStatuslab(rs.getString("status_lab"));
                data.add(dl);

            }
            db.disconnect(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data lab" + ex);
        }
        return data;
    }

    public List getPic(int id) {
        List<Datalab> data = new ArrayList<Datalab>();
        ResultSet rs = null;
        int getpic_id = id;
        try {
            String sql = "select * from tbl_pic_lab where id_pic="+getpic_id;
            rs = db.getData(sql);
            while (rs.next()) {
                Datalab dl = new Datalab();
                dl.setIdpic(rs.getInt("id_pic"));
                dl.setNamapic(rs.getString("nama_pic"));
                dl.setRuangpic(rs.getString("ruangan_pic"));
                dl.setKontakpic(rs.getString("kontak_pic"));
                data.add(dl);

            }
            db.disconnect(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data pic" + ex);
        }
        return data;
    }
    
    
    public List getKalab(int id) {
        List<Datalab> data = new ArrayList<Datalab>();
        ResultSet rs = null;
        int getkalab_id = id;
        try {
            String sql = "select * from tbl_kepala_lab where id_kalab="+getkalab_id;
            rs = db.getData(sql);
            while (rs.next()) {
                Datalab dl = new Datalab();
                dl.setIdkalab(rs.getInt("id_kalab"));
                dl.setNama_kalab(rs.getString("nama_kalab"));
                dl.setRuangkalab(rs.getString("ruangan_kalab"));
                dl.setKontakkalab(rs.getString("kontak_kalab"));
                data.add(dl);

            }
            db.disconnect(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data kalab" + ex);
        }
        return data;
    }
    
        public List getPeminjaman(int id) {
        List<Datalab> data = new ArrayList<Datalab>();
        ResultSet rs = null;
        int getpemenjaman_id = id;
        try {
            String sql = "select * from tbl_peminjaman";
            rs = db.getData(sql);
            while (rs.next()) {
                Datalab dl = new Datalab();
                dl.setIdpeminjaman(rs.getInt("id_kalab"));
                dl.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                dl.setTgl_mulai(rs.getString("tgl_mulai"));
                dl.setTgl_berakhir(rs.getString("tgl_berakhir"));
                dl.setStatuspeminjaman(rs.getString("status_peminjaman"));
                data.add(dl);
            }
            db.disconnect(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data peminjaman lab" + ex);
        }
        return data;
    }
}
