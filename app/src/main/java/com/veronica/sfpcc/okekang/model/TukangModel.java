package com.veronica.sfpcc.okekang.model;

public class TukangModel {
	private String noRek;
	private String idVer;
	private String jnk;
	private String idKeahlian;
	private String fotoTukang;
	private String emailTukang;
	private String passTukang;
	private String idTukang;
	private String buktiTukang;
	private String namaTukang;
	private String alamatTukang;
	private String expDate;
	private String namaBank;
	private String kontakTukang;
	private String ratingTukang;

	public void setNoRek(String noRek){
		this.noRek = noRek;
	}

	public String getNoRek(){
		return noRek;
	}

	public void setIdVer(String idVer){
		this.idVer = idVer;
	}

	public String getIdVer(){
		return idVer;
	}

	public void setJnk(String jnk){
		this.jnk = jnk;
	}

	public String getJnk(){
		return jnk;
	}

	public void setIdKeahlian(String idKeahlian){
		this.idKeahlian = idKeahlian;
	}

	public String getIdKeahlian(){
		return idKeahlian;
	}

	public void setFotoTukang(String fotoTukang){
		this.fotoTukang = fotoTukang;
	}

	public String getFotoTukang(){
		return fotoTukang;
	}

	public void setEmailTukang(String emailTukang){
		this.emailTukang = emailTukang;
	}

	public String getEmailTukang(){
		return emailTukang;
	}

	public void setPassTukang(String passTukang){
		this.passTukang = passTukang;
	}

	public String getPassTukang(){
		return passTukang;
	}

	public void setIdTukang(String idTukang){
		this.idTukang = idTukang;
	}

	public String getIdTukang(){
		return idTukang;
	}

	public void setBuktiTukang(String buktiTukang){
		this.buktiTukang = buktiTukang;
	}

	public String getBuktiTukang(){
		return buktiTukang;
	}

	public void setNamaTukang(String namaTukang){
		this.namaTukang = namaTukang;
	}

	public String getNamaTukang(){
		return namaTukang;
	}

	public void setAlamatTukang(String alamatTukang){
		this.alamatTukang = alamatTukang;
	}

	public String getAlamatTukang(){
		return alamatTukang;
	}

	public void setExpDate(String expDate){
		this.expDate = expDate;
	}

	public String getExpDate(){
		return expDate;
	}

	public void setNamaBank(String namaBank){
		this.namaBank = namaBank;
	}

	public String getNamaBank(){
		return namaBank;
	}

	public void setKontakTukang(String kontakTukang){
		this.kontakTukang = kontakTukang;
	}

	public String getKontakTukang(){
		return kontakTukang;
	}

	public void setRatingTukang(String ratingTukang){
		this.ratingTukang = ratingTukang;
	}

	public String getRatingTukang(){
		return ratingTukang;
	}

	@Override
 	public String toString(){
		return 
			"TukangModel{" +
			"no_rek = '" + noRek + '\'' + 
			",id_ver = '" + idVer + '\'' + 
			",jnk = '" + jnk + '\'' + 
			",id_keahlian = '" + idKeahlian + '\'' + 
			",foto_tukang = '" + fotoTukang + '\'' + 
			",email_tukang = '" + emailTukang + '\'' + 
			",pass_tukang = '" + passTukang + '\'' + 
			",id_tukang = '" + idTukang + '\'' + 
			",bukti_tukang = '" + buktiTukang + '\'' + 
			",nama_tukang = '" + namaTukang + '\'' + 
			",alamat_tukang = '" + alamatTukang + '\'' + 
			",exp_date = '" + expDate + '\'' + 
			",nama_bank = '" + namaBank + '\'' + 
			",kontak_tukang = '" + kontakTukang + '\'' + 
			",rating_tukang = '" + ratingTukang + '\'' + 
			"}";
		}
}
