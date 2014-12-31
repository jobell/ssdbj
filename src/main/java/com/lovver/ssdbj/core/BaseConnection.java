package com.lovver.ssdbj.core;

import java.util.List;

import com.lovver.ssdbj.exception.SSDBException;

/**
 * �������ݿ����ӽӿ�
 * 
 * @author jobell.jiang <jobell@qq.com>
 */
public interface BaseConnection extends Wrapper {
	/**
	 * �ر�����
	 */
	public void close();
	/**
	 * �ж������Ƿ�ر�
	 * 
	 * @return
	 */
	public boolean isClose();
	/**
	 * �ж������Ƿ�����
	 */
	public boolean isConnection();
	/**
	 * ��ȡָ��ִ����
	 * 
	 * @return
	 */
	public CommandExecutor getCommandExecutor();
	
	/**
	 * ִ��ָ��ҷ��ؽ��
	 * 
	 * @param cmd
	 * @param params
	 * @return
	 * @throws SSDBException
	 */
	public BaseResultSet execute(String cmd,List<byte[]> params)throws SSDBException;
	
	/**
	 * ִ������Ҹ���db
	 * 
	 * @param cmd
	 * @param params
	 * @throws SSDBException
	 */
	public boolean executeUpdate(String cmd,List<byte[]> params)throws SSDBException;
}
