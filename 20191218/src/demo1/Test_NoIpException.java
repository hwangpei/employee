package demo1;

import java.util.Scanner;

public class Test_NoIpException {
	//判断ip字符串是否合法
	public boolean checkIp(String ip) throws NoIpException, Exception{
		boolean flg = true;
		
		if(ip == null) {
			flg = false;
			throw new NoIpException("无法获取ip");
		}else {
			//split
			String[] arr = ip.split("[.]");
			//是不是4部分
			if(arr.length!=4) {
				flg = false;
				throw new NoIpException("ip格式不正确");
			}else {
				//每一部分是不是0-255
				for(int i=0; i < arr.length; i++) {
					int num = Integer.parseInt(arr[i]);
					if(!(num >=0 && num <=255)) {
						flg = false;
						throw new NoIpException("ip的第"+(i+1)+"部分组成不是0~255");
					}
				}
			}
		}
		return flg;
	}
	
	
	//根据url字符串返回协议
	public String getXieyi(String url) throws Exception{
		//判断url如果为null，则抛出NoIpException
		//url如果没有协议，则抛出Exception
		//否则返回协议
		String xy = null;
		
		if(url == null) {
			throw new NoIpException("无法获取网址");
		}else {
			int index = url.indexOf(":");
			if(index == -1) {
				throw new Exception("网址格式不正确");
			}else {
				xy = url.substring(0, index);
			}
		}		
		return xy;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Test_NoIpException obj = new Test_NoIpException();
//		try {
//			System.out.println("请输入网址");
//			String s = input.next();
//			String s2 = obj.getXieyi(null);
//			System.out.println(s2);
//		}catch(Exception ex) {
//			System.out.println(ex.getClass()+"\t"+ex.getMessage());
//			
//		}
		try {
			System.out.println("请输入ip");
			String ip = input.next();
			boolean b = obj.checkIp(ip);
			System.out.println("ip是否正确："+b);
		}catch (NoIpException e1) {
			System.out.println(e1.getMessage());
		}catch (Exception e2) {
			e2.printStackTrace();
		}

	}

}
