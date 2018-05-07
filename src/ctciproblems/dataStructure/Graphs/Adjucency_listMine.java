package ctciproblems.dataStructure.Graphs;
//NOT COMPLETE
import java.util.HashMap;
import java.util.LinkedList;
//Vertices and Edges
//question: Graph is undirected, weights Highways

import org.junit.experimental.theories.Theories;


public class Adjucency_listMine {	
	int edgeWeight; //if two connections have weight
	//vertex start; //very first entry
	vertex LinkV;
	HashMap <String,vertex> start;

	public static void amin (String [] args){

	}

	class vertex {
		//vertex needs to know about the address of the node that it has a connection and it should have a name
		String name;//name of the stored filled
		vertex next; //this will hold the address of the connection

	}



	//constructor
	Adjucency_listMine(){		
		start=new HashMap <>();	// start out adjuency list 
	}

	//this one adds data with a connection
	public void addConnections(vertex v){
		//if vertex already exists just add the connections
		//start the linkist
		if (v.next==null){
			v.next=new vertex();
			this.start.put(v.name, v.next);
		}
		else {
			while(v.next!=null){
				v=v.next;				
			}
			this.start.put(v.name, v.next);
		}


	}	 





}
