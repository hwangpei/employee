package demo1;

import java.util.Scanner;

public class Test_NoIpException {
	//�ж�ip�ַ����Ƿ�Ϸ�
	public boolean checkIp(String ip) throws NoIpException, Exception{
		boolean flg = true;
		
		if(ip == null) {
			flg = false;
			throw new NoIpException("�޷���ȡip");
		}else {
			//split
			String[] arr = ip.split("[.]");
			//�ǲ���4����
			if(arr.length!=4) {
				flg = false;
				throw new NoIpException("ip��ʽ����ȷ");
			}else {
				//ÿһ�����ǲ���0-255
				for(int i=0; i < arr.length; i++) {
					int num = Integer.parseInt(arr[i]);
					if(!(num >=0 && num <=255)) {
						flg = false;
						throw new NoIpException("ip�ĵ�"+(i+1)+"������ɲ���0~255");
					}
				}
			}
		}
		return flg;
	}
	
	
	//����url�ַ�������Э��
	public String getXieyi(String url) throws Exception{
		//�ж�url���Ϊnull�����׳�NoIpException
		//url���û��Э�飬���׳�Exception
		//���򷵻�Э��
		String xy = null;
		
		if(url == null) {
			throw new NoIpException("�޷���ȡ��ַ");
		}else {
			int index = url.indexOf(":");
			if(index == -1) {
				throw new Exception("��ַ��ʽ����ȷ");
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
//			System.out.println("��������ַ");
//			String s = input.next();
//			String s2 = obj.getXieyi(null);
//			System.out.println(s2);
//		}catch(Exception ex) {
//			System.out.println(ex.getClass()+"\t"+ex.getMessage());
//			
//		}
		try {
			System.out.println("������ip");
			String ip = input.next();
			boolean b = obj.checkIp(ip);
			System.out.println("ip�Ƿ���ȷ��"+b);
		}catch (NoIpException e1) {
			System.out.println(e1.getMessage());
		}catch (Exception e2) {
			e2.printStackTrace();
		}

	}

}
