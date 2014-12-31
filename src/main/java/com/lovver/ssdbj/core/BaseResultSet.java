package com.lovver.ssdbj.core;

import java.util.List;

/**
 * 基础结果集接口
 * 
 * @author jobell.jiang <jobell@qq.com>
 */
public interface BaseResultSet<T> {
	public byte[] getResult();
	public String getStatus();
}
