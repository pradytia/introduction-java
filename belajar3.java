import java.util.*;


class belajar3 {


	public static String segitigaKebalik(int a){
	
		String b = "";
		
		
		for(int i = 1; i <= a; i++){
			for(int j = i; j <= a; j++){
			
				b += "*"; 
			}
			b+="\r\n";
		}
		
		return b;
	}
	
	public static String segitigaNormal (int x){
		
		String c = "";
		
		for(int i = 1; i <= x; i++){
			
			for(int j = 1; j <= i; j++){
				
				c+= "*";
				
			}
			
			c+="\r\n";
	
		}
		return c;
	}
	
	public static List<Integer> pushArray(int x){
		
		List<Integer> array = new ArrayList<>();
		
		for(int i = 1; i <= x; i++){
			
			array.add(i);
		}
		
		return array;
		
	}
	
	public static void main(String args[]){
		
		System.out.print(segitigaKebalik(5));
		System.out.print(segitigaNormal(5));
		System.out.print(pushArray(5));
	}

}