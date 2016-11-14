package com.struts.fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUpload extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private File ppt;
     private String pptContentType;
     private String pptFileName;
     private String desc;
	public File getPpt() {
		return ppt;
	}
	public void setPpt(File ppt) {
		this.ppt = ppt;
	}
	public String getPptContentType() {
		return pptContentType;
	}
	public void setPptContentType(String pptContentType) {
		this.pptContentType = pptContentType;
	}
	public String getPptFileName() {
		return pptFileName;
	}
	public void setPptFileName(String pptFileName) {
		this.pptFileName = pptFileName;
	}
    
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(ppt);
		System.out.println(pptFileName);
		System.out.println(pptContentType);
		String path=ServletActionContext.getServletContext().getRealPath("/files/"+pptFileName);
		FileInputStream fis=new FileInputStream(ppt);
		FileOutputStream fos=new FileOutputStream(new File(path));
		byte [] buffer=new byte[1024];
		int len;
		while((len=fis.read(buffer))!=-1){
			fos.write(buffer, 0, len);
		}
		return super.execute();
	}

}
