package com.lovver.ssdbj.core;

/**
 * ������������ӿڣ������Խ��������ת��
 * 
 * @author jobell.jiang <jobell@qq.com> 
 */
public interface ResultHandler<T> {
	public T handler(BaseResultSet resultSet);
}
