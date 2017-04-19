package prob5;
import java.io.IOException;

public class MyStack {
	private int top;
	private String[] buffer;
	
	public MyStack(int a){//스택 생성 
		top=-1;//탑 인덱스 초기값 -1설정
		resize(a);//a크기의 스택 배열 생성
	}
	
	public void resize(int size){
		if(size-1<top){
			top=size-1;
			return;
		}
		//int length=buffer.length;
		String[] temp=new String[size];
		for(int i=0; i<=top; i++){
			temp[i]=buffer[i];
		}
		buffer=temp;
	}
	
	public String pop() throws MyStackException {
		if(top<=-1)//빈스택
			throw new MyStackException("stack is empty");
		String s = buffer[top];
		top--;
		return s;
	}
	
	public void push(String str){
		if(top==buffer.length-1)//stack 가득찼는지 확인
			resize(buffer.length*2);
		buffer[++top]=str;
	}
	
	public boolean isEmpty(){
		if(top<0)
			return true;
		return false;//비었음
	}
}

