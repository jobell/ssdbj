package com.lovver.ssdbj.core;

import java.util.List;

/**
 * ����������ӿ�
 * 
 * @author jobell.jiang <jobell@qq.com>
 */
public interface BaseResultSet {
	public List<byte[]> getResult();
	public String getStatus();
}
