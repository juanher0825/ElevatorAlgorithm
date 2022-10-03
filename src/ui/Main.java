package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		System.out.println("Elevator Algorithm");
		
		Integer[] a= {5,29,13,10}; 
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(5, 2);
		map.put(29, 10);
		map.put(13, 1);
		map.put(10, 1);
		
		elevatorA(a, 4, map);
	}
	
	
	public static void elevatorA(Integer floors[], int IFloor, Map<Integer, Integer> map) {
		boolean senseUp = false;
		boolean finish = false;
		
		while(finish == false) {
			System.out.println("---Elevador en piso: " + IFloor);
			int minimus[] = new int[floors.length];
			for (int j = 0; j < floors.length; j++) {
				minimus[j] = Math.abs((IFloor - floors[j]));
			}
			
			
			int menor = minimus[0];
			int pos = 0;
			
			
			
			for (int j = 0; j < minimus.length; j++) {
				if(minimus[j] < menor) {
					menor = minimus[j];
					pos = j;
				}
			}
			//System.out.println("----"+Arrays.toString(floors));
			//System.out.println("----"+Arrays.toString(minimus));
			
			//System.out.println("----Resta menor: " + menor);
			//System.out.println("----Posicion : " + pos);
			
			
			
			//Bajando
			if(IFloor > floors[pos]) {
				System.out.println("---Elevador Bajando..");
				
				
				for (int i = IFloor - 1; i >= floors[pos]; i--) {
					System.out.println("---Elevador en piso: " + i);
				}
				
				//Llego al piso
				IFloor = floors[pos];
				Integer[] newArr = null;
		        int elementToBeDeleted = floors[pos];
				
				for (int i = 0; i <= floors.length-1; i++) {
		            if(floors[i] == elementToBeDeleted){
		                newArr = new Integer[floors.length - 1];
		                for(int index = 0; index < i; index++){
		                    newArr[index] = floors[index];
		                }
		                for(int j = i; j < floors.length - 1; j++){
		                    newArr[j] = floors[j+1];
		                }
		                floors = newArr;
		                break;
		            }
		        }
				
				//System.out.println(Arrays.toString(floors));
				System.out.println("---Elevador se detiene");
				
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					Integer key = (Integer) it.next();
					if(IFloor == key) {
						//System.out.println(key + "=" + IFloor);
						//System.out.println("*****"+map.get(key));
						//añadir nuevo piso
						
				        
				        //Convert to ArrayList
						List<Integer> lista1 = Arrays.asList(floors);
						List<Integer> lista = new ArrayList(lista1);
						
						//System.out.println(lista.toString());
				
						
					
				        
				        //Add elements to it
						try{
							lista.add(map.get(key));
						}catch(Exception e){
							System.out.println(e);
						}
						
				       
				        
						//Convert the arraylist back to an array
						newArr = new Integer[lista.size()];
						floors = lista.toArray(newArr);
				        //arr = new String[ testList.size() ];
				        //testList.toArray(arr);
						System.out.println("---Piso agregado: " + map.get(IFloor) + Arrays.toString(floors));
					}
				
				}
				
				
				
				
				
				
				if(floors.length == 0) {
					finish = true;
				}
				
			//Subiendo	
			}else if(IFloor < floors[pos]) {
				senseUp = true;
				System.out.println("---Elevador Subiendo...");
				for (int i = IFloor + 1; i <= floors[pos]; i++) {
					System.out.println("---Elevador en piso: " + i);
				}
				
				//Llego al piso
				IFloor = floors[pos];
				Integer[] newArr = null;
		        int elementToBeDeleted = floors[pos];
				
				for (int i = 0; i <= floors.length-1; i++) {
		            if(floors[i] == elementToBeDeleted){
		                newArr = new Integer[floors.length - 1];
		                for(int index = 0; index < i; index++){
		                    newArr[index] = floors[index];
		                }
		                for(int j = i; j < floors.length - 1; j++){
		                    newArr[j] = floors[j+1];
		                }
		                floors = newArr;
		                break;
		            }
		        }
				
				//System.out.println(Arrays.toString(floors));
				System.out.println("---Elevador se detiene");
				
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					Integer key = (Integer) it.next();
					if(IFloor == key) {
						//System.out.println(key + "=" + IFloor);
						//añadir nuevo piso
						//System.out.println("*****"+map.get(key));
				        
				        //Convert to ArrayList
						List<Integer> lista1 = Arrays.asList(floors);
						List<Integer> lista = new ArrayList(lista1);
						
						//System.out.println(lista.toString());
				
				        
				        //Add elements to it
						try{
							lista.add(map.get(key));
						}catch(Exception e){
							System.out.println(e);
						}
				       
				        
						//Convert the arraylist back to an array
						newArr = new Integer[lista.size()];
						floors = lista.toArray(newArr);
				        //arr = new String[ testList.size() ];
				        //testList.toArray(arr);
						System.out.println("---Piso agregado: " + map.get(IFloor) + Arrays.toString(floors));
					}
				
				}
				
				
				
				
				
				
				//System.out.println(Arrays.toString(floors));
				
				if(floors.length == 0) {
					finish = true;
				}
				
				
			}else if(IFloor == floors[pos]) {
				//Llego al piso
				IFloor = floors[pos];
				Integer[] newArr = null;
		        int elementToBeDeleted = floors[pos];
				
				for (int i = 0; i <= floors.length-1; i++) {
		            if(floors[i] == elementToBeDeleted){
		                newArr = new Integer[floors.length - 1];
		                for(int index = 0; index < i; index++){
		                    newArr[index] = floors[index];
		                }
		                for(int j = i; j < floors.length - 1; j++){
		                    newArr[j] = floors[j+1];
		                }
		                floors = newArr;
		                break;
		            }
		        }
				
			//System.out.println(Arrays.toString(floors));
				
				System.out.println("---Elevador se detiene");
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					Integer key = (Integer) it.next();
					if(IFloor == key) {
						//System.out.println(key + "=" + IFloor);
						//añadir nuevo piso
						//System.out.println("*****"+map.get(key));
				        
				        //Convert to ArrayList
						List<Integer> lista1 = Arrays.asList(floors);
						List<Integer> lista = new ArrayList(lista1);
						
						//System.out.println(lista.toString());
				
				        
				        //Add elements to it
						try{
							lista.add(map.get(key));
						}catch(Exception e){
							System.out.println(e);
						}
				       
				        
						//Convert the arraylist back to an array
						newArr = new Integer[lista.size()];
						floors = lista.toArray(newArr);
				        //arr = new String[ testList.size() ];
				        //testList.toArray(arr);
						System.out.println("---Piso agregado: " + map.get(IFloor) + Arrays.toString(floors));
					}
				
				}
				
				
				
				
				
				
				//System.out.println(Arrays.toString(floors));
				
				if(floors.length == 0) {
					finish = true;
				}
			}
						
			
		}
		
		
	}
	

}
