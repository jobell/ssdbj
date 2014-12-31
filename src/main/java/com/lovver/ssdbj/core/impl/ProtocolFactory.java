package com.lovver.ssdbj.core.impl;

import java.io.InputStream;
import java.io.OutputStream;

import com.lovver.ssdbj.core.Protocol;

public class ProtocolFactory {
	
	
	public static Protocol createSSDBProtocolImpl(String protocolName,OutputStream os,InputStream is){
		if(null==protocolName||"ssdb".equals(protocolName.toLowerCase())){
			return new SSDBProtocolImpl(os,is);
		}
		throw new RuntimeException("not support prototol:"+protocolName);
	}
}