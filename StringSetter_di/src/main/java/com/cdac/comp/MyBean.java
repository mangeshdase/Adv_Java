package com.cdac.comp;

public class MyBean {
		private int beanNo;
		private String beanMsg;
		public MyBean() {
			System.out.println("No argument MyBean...");
		}
		/*public int getBeanNo() {
			System.out.println("Get Bean No....");

			return beanNo;
		}
		public void setBeanNo(int beanNo) {
			this.beanNo = beanNo;
			System.out.println("Set Bean No");
		}
		public String getBeanMsg() {
			System.out.println("Get Bean Msg//////");
			return beanMsg;
		}
		public void setBeanMsg(String beanMsg) {
			System.out.println("Set Bean Msg//////");
			this.beanMsg = beanMsg;
		}*/
		public MyBean(int beanNo, String beanMsg) {
			
			this.beanNo = beanNo;
			this.beanMsg = beanMsg;
		}
		@Override
		public String toString() {
			return beanNo +"  "+ beanMsg;
		}
		
		
		
}
