package aop;
/*
 * 日志处理程序（切面程序）
 */
public class LogHandler {
	public void LogBefore()
	{
		//获取系统当前时间
		System.out.println("Log before method:"+System.currentTimeMillis());
	}
	public void LogAfter()
	{
		System.out.println("Log after method:"+System.currentTimeMillis());
	}
}
