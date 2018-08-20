package com.veronica.sfpcc.okekang.model;

import java.util.List;

public class ListTukangModel {
	private boolean success;
	private String message;
	private List<TukangModel> keahlian;

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setKeahlian(List<TukangModel> keahlian){
		this.keahlian = keahlian;
	}

	public List<TukangModel> getKeahlian(){
		return keahlian;
	}

	@Override
 	public String toString(){
		return 
			"ListTukangModel{" +
			"success = '" + success + '\'' + 
			",message = '" + message + '\'' + 
			",keahlian = '" + keahlian + '\'' + 
			"}";
		}
}