package stack;

public class Stack {
	
	private Object[] objects = new Object[5];
	private int currentCount = 0;
	
	public void add(Object object){
		objects[currentCount] = object;
		currentCount++;
		if (currentCount == objects.length) {
			//扩容
			Object[] temp = new Object[objects.length+5];
			for (int i = 0; i < objects.length; i++) {
				temp[i] = objects[i];
			}
			objects = temp;
		}
		
	}
	
	public Object pop(){
		if (currentCount==0) {
			return null;
		}
		
		Object currentObject = objects[currentCount-1];
		objects[currentCount-1] = null;
		currentCount--;
		return currentObject;
	}
	
	public boolean isEmpty() {
		return currentCount==0;
	}
	
	public void show() {
		System.out.println("---------------------");
		for (Object o : objects) {
			System.out.print(o+"\t");
		}
		System.out.println();
	}
	
//	public static void main(String[] args) {
//		Stack stack = new Stack();
//		stack.add('{');
//		stack.add('[');
//		stack.add('(');
//		stack.add('a');
//		stack.add('b');
//		stack.add(')');
//		stack.add(']');
//		stack.add('}');
//		stack.show();
//	}
	
}
