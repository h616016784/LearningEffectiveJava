package com.learn.chart3;

public class PhoneNumber {
	short areaCode;
	short prefixe;
	short lineNumber;
	public PhoneNumber(int areaCode,int prefixe,int lineNumber){
		rangCheck(areaCode,999,"area code");
		rangCheck(prefixe,999,"prefixe");
		rangCheck(lineNumber,9999,"line number");
		this.areaCode=(short) areaCode;
		this.prefixe=(short) prefixe;
		this.lineNumber=(short) lineNumber;
	}
	private void rangCheck(int areaCode2, int i, String string) {
		if(areaCode2<0||areaCode2>i)
			throw new IllegalArgumentException(string+":"+areaCode2);
	}
	int hashCode;
	@Override
	public int hashCode() {
		int result=hashCode;
		if(result==0){
			result=17;
			result=31*result+areaCode;
			result=31*result+prefixe;
			result=31*result+lineNumber;
			hashCode=result;
		}
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj==this)
			return true;
		if(!(obj instanceof PhoneNumber))
			return false;
		PhoneNumber pn=(PhoneNumber) obj;
		return pn.lineNumber==lineNumber && pn.prefixe==prefixe && pn.areaCode==areaCode;
	}
}
