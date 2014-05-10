package Pertemuan7;

public class Mahasiswa {
	
	private String nrp;
	private String nama;
	private String alamat;
	
	public Mahasiswa(){
		
	}
	
	public Mahasiswa(String nrp, String Nama, String alamat){
		this.nrp = nrp;
		this.nama =nama;
		this.alamat = alamat;
	}
	
	public String getNrp(String nrp){
		return nrp;
	}
	
	public void setNrp(String nrp){
		this.nrp = nrp;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getAlamat(){
		return alamat;
	}
	
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
	

public String toString(){
	return nrp+"-"+nama+"_"+alamat;
}
}
	
	
