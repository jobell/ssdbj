package com.lovver.ssdbj.core;

/**
 * Э�鼶������
 * 
 * @author jobell.jiang <jobell@qq.com>
 */
public interface ProtocolConnection extends BaseConnection {
	/**
	 * ����Э������
	 * @return
	 */
	public String getProtocol();
	
	/**
	 * ����Э��汾��
	 * @return
	 */
	public String getProtocolVersion();
	
	public Protocol getProtocolImpl();
	
}
