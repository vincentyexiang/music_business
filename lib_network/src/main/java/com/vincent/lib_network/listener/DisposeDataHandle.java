package com.vincent.lib_network.listener;

/**
 * @author vision
 *
 */
public class DisposeDataHandle
{
	public DisposeDataListener mListener = null;
	public Class<?> mClass = null;
	//文件保存路径
	public String mSource = null;

	public DisposeDataHandle(DisposeDataListener listener)
	{
		this.mListener = listener;
	}

	public DisposeDataHandle(DisposeDataListener listener, Class<?> clazz)
	{
		this.mListener = listener;
		this.mClass = clazz;
	}

	public DisposeDataHandle(DisposeDataListener listener, String source)
	{
		this.mListener = listener;
		this.mSource = source;
	}
}