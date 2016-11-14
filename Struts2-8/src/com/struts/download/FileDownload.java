package com.struts.download;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownload extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contentType;
	private long contentLength;
	private String contentDisposition;
	private InputStream inputStream;
	public String getContentType() {
		return contentType;
	}
	public long getContentLength() {
		return contentLength;
	}
	public String getContentDisposition() {
		return contentDisposition;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		contentType="text/html";
		contentDisposition="attachment;filename=overview.html";
		String path=ServletActionContext.getServletContext().getRealPath("/files/overview.html");
		inputStream=new FileInputStream(path);
		contentLength=inputStream.available();
		return super.execute();
	}

}
