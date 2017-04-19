package prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
	//Math.sqrt(w*w+h*h);
	public static void main(String[] args) {
		//List<Shape> list = new ArrayList<Shape>();
		//list.add(도형);
		List<Shape> list = new ArrayList<Shape>();
		
		Shape rect = new Rectangle(5,6);
		Shape trian = new RectTriangle(6,2);
		
		list.add(rect);
		list.add(trian);

		//size(),get() : 컬렉션클래스에만 있는 메서드
		//length = 상수/list[i]는 쓸 수 없음 -> list.get(i)
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getClass());
			System.out.println(" area : "+list.get(i).getArea());
			System.out.println(" perimeter : "+list.get(i).getPerimeter());
			System.out.println("");
			
			//만일 해당 Shpae가 Resizable 하다면
			//리스트의 해당 객체가 Resizable인터페이스를 구현한다면
			if(list.get(i) instanceof Resizable){
				
				Resizable resizable = (Resizable)list.get(i);
			    resizable.resize(0.5);
				System.out.println(" new area : "+list.get(i).getArea());
				System.out.println(" new perimeter : "+list.get(i).getPerimeter());
				System.out.println("");
			}
		}
	}

}
