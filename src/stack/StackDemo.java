package stack;
/**
 * 使用栈来检验输入正确性
 * 
 * @author MoWenqiong
 * 2015-7-10
 */
public class StackDemo {

	public static boolean isIn(char c,char[] chars){
		boolean result = false;
		for (int i = 0; i < chars.length; i++) {
			if (c==chars[i]) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	public static char getAppropriateChar(char c){
		char result = 0;
		switch (c) {
		case ')':
			result = '(';
			break;
		case ']':
			result = '[';
			break;
		case '}':
			result = '{';
			break;
		default:
			break;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		char[] chars = new char[]{'{','(',')','[',']','{','}'};
		
		char[] inChars = new char[]{'{','[','('};
		char[] outChars = new char[]{')',']','}'};
		
		Stack stack = new Stack();
		
		for (char c : chars) {
			
			if(isIn(c,inChars)){
				stack.add(c);
			}else if (isIn(c, outChars)) {
				char topChar =  (char)stack.pop();
				if (getAppropriateChar(c)!=topChar) {
					System.out.println(c + "与" + topChar + "不匹配");
					stack.add(topChar);
					break;
				}
			}
			
		}
		if(stack.isEmpty()){
			System.out.println("匹配");
		}else {
			System.out.println("不匹配");
		}
		
		stack.show();

		
		
	}

}
