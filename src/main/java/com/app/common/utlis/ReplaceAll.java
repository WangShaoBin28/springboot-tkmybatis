package com.app.common.utlis;
/**
 * 字符替换函数
 * @author ccj
 *
 */
public class ReplaceAll {
	/**
	 * 字符替换函数
	 * @param source
	 * @param oldString
	 * @param newString
     * @return
     */
	  public static String replace(String source, String oldString,
	                               String newString) {
	    if (source == null) {
	      return null;
	    }
	    StringBuffer output = new StringBuffer();
	    int lengOfsource = source.length();
	    int lengOfold = oldString.length();
	    int posStart = 0;
	    int pos;
	    while ( (pos = source.indexOf(oldString, posStart)) >= 0) {
	      output.append(source.substring(posStart, pos));
	      output.append(newString);
	      posStart = pos + lengOfold;
	    }
	    if (posStart < lengOfsource) {
	      output.append(source.substring(posStart));
	    }
	    return output.toString();
	  }

}

