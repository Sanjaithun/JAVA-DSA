import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Edge
{
    String src;
	String des;
	int wt;
	Edge ( String s, String d, int w )
	{
	    src = s;
		des = d;
		wt  = w;
	}
	public void print()
	{
		System.out.printf("src = %s des = %s weight = %02d\n", src, des, wt);
	}
	// src = abc , des = xyz, weight = num 
}

class Vertex
{
   String apc;// airport code
   String city_n; ;// city name
   String country_n ; // country name
   int inDeg;
   int outDeg;
   
   
   Vertex ( String apc, String city_n, String country_n )
   {
      this.apc = apc;
	  this.city_n = city_n;
	  this.country_n = country_n;
	  inDeg = 0;
	  outDeg = 0;
   }
   public void print()
   {
	   System.out.printf("%s:%s:%s:%d:%d\n", apc, city_n,country_n, inDeg, outDeg);
   }
}
record master_data ( String country, String capital, String ap_name, String apc )
{
}
class graph
{
     int non; // number of nodes
	 int noe; // number of edges
	 int [][] adjMatrix;
	 ArrayList < ArrayList<String> > adjList;
	 ArrayList < Vertex > allNodes;
	 Set < String > allNodes_set;
	 String [] nodes;
	 ArrayList < Edge > edges ;
	 String line;
	 String [] words;
	 String master_file_name = "INTERNATIONAL_DATA.txt";
	 private void printNodes()
	 {
		  for ( Vertex v : allNodes )
			  v.print();
	 }
	 private void printEdges()
	 {
		 for ( Edge e : edges )
			 e.print();
	 }
	 private int indexFinder ( String str )
	 {
		 for( int ind = 0; ind < non ; ind++)
			 if ( nodes[ind].equals( str ) == true )
				 return ind;
			 
			 return -1; 
	 }
	 private void printAdjMatrix()
	 {
		 System.out.printf("     ");
		for ( String ele : nodes )
			System.out.printf("%s  ", ele );
		for ( int row = 0; row <  non ;row ++)
		{
			System.out.println();
			System.out.printf("%s  ", nodes  [ row ] );
			for( int col = 0 ; col < non; col ++)
			{
				System.out.printf(" %02d  ", adjMatrix [ row ] [ col ]);
			}
		}
	 }
     private void formAdjMatrix()
	 {
		 adjMatrix = new int [ non ] [ non ] ;
		 int src_index;
		 int des_index;
		 src_index = 0;
		 des_index = 0;
		 for( Edge e : edges )
		 {
			 src_index = indexFinder ( e.src );
			 des_index = indexFinder ( e.des );
			 adjMatrix [ src_index ] [ des_index ]  = e.wt;
			 adjMatrix [ des_index ] [ src_index ]  = e.wt; 
		 }
	 }
	 private void formAdjList()
	 {
		 
		 adjList = new ArrayList<>();
		 for( int ind = 0; ind < non; ind ++)
			 adjList.add( new ArrayList<>());
		 
		 int src_index;
		 int des_index;
		 src_index = 0;
		 des_index = 0;
		 for( Edge e : edges )
		 {
			 src_index = indexFinder ( e.src );
			 adjList.get(src_index).add(e.des);
			 des_index = indexFinder ( e.des );
			 adjList.get(des_index).add( e.src );
			 
		 }
	 }
	 private void printAdjList()
	 {
		 System.out.println("\n\nAdjacency List ");
		 for( int row = 0; row < non ; row ++)
		 {
			 System.out.printf("%s ", nodes[row]);
			 for ( int conn = 0; conn < adjList.get(row).size(); conn++)
				 System.out.printf("%c  %s ", 0X2794, adjList.get(row).get(conn));
			 
			 System.out.println();
		 }
	 }
	 public void bfs_adjList ( String vert )
	 {
		 Queue < String > que = new LinkedList< >();
		 boolean [] visited = new boolean [ non ];
		 boolean [] queued  = new boolean [ non ];
		 que.add( vert );
		 queued [ indexFinder( vert ) ] = true;
		 String proc;
		 int procIndex;
		 boolean first = true;
		 while ( que.isEmpty() == false )
		 {
			 proc = que.remove();
			 procIndex = indexFinder ( proc );
			 visited [ procIndex ] = true;
			 if ( first == true )
			 {
				  System.out.printf("%s ", proc );
				  first = false;
			 }
			 else
				 System.out.printf("%c  %s ", 0X2794, proc );
			 for( String ele : adjList.get( procIndex ))
			 {
				 int tempIndex = indexFinder ( ele );
				 if ( visited [ tempIndex ] == false && 
				      queued  [ tempIndex ] == false )
					  {
						  que.add (ele);
						  queued [ tempIndex ] = true;
					  }
			 }
			 
		 }
		 
	 }
	 public void dfs_adjMatrix( String src )
	 {
		 // arm length
		 
		 // set an environment
		 boolean [] visited = new boolean [ non ];
		// int visitedCtr;
		 // call the helper - recursive, pass , initiate
		 dfs_adjMatrix_helper ( src, visited, 1 );
	 }
	 private void dfs_adjMatrix_helper (String ver, boolean [] visited, int visitCtr )
	 {
		    int verIndex;
			if ( visitCtr == 1 )
			System.out.printf("%s ", ver );			
			else
			System.out.printf("%c %s ", 0X21A0, ver );
			
			verIndex = indexFinder ( ver );
			visited [ verIndex ] = true;
			if ( visitCtr == visited.length - 1) 
				return;
			for( int col = 0; col < non; col++)
			{
				if ( adjMatrix [ verIndex ] [ col ] != 0 &&
				      visited [ col ] == false )
					  {
						  dfs_adjMatrix_helper (nodes[col], visited, visitCtr+1);
					  }
			}
	 }
	 
	 //-------------------------------------------------------------------------------------------//
	 
	 public void dfs_adjList( String src )
	 {
		 // arm length
		 
		 // set an environment
		 boolean [] visited = new boolean [ non ];
		// int visitedCtr;
		 // call the helper - recursive, pass , initiate
		 dfs_adjList_helper ( src, visited, 1 );
	 }
	 private void dfs_adjList_helper (String ver, boolean [] visited, int visitCtr )
	 {
		    int verIndex;
			if ( visitCtr == 1 )
			System.out.printf("%s ", ver );			
			else
			System.out.printf("%c %s ", 0X21A0, ver );
			
			verIndex = indexFinder ( ver );
			visited [ verIndex ] = true;
			if ( visitCtr == visited.length - 1) 
				return;
			for( int col = 0; col < non; col++)
			{
				if ( adjList.get( verIndex ).get(col ) != 0 &&
				      visited [ col ] == false )
					  {
						  dfs_adjList_helper (nodes[col], visited, visitCtr+1);
					  }
			}
	 }
	 private void bfs ( String vert )
	 {
		 
	 }
	 graph ( File fname )
	 {
	   // master data
       ArrayList < master_data > md = new ArrayList<>();
	   words = new String[4];
	   try
	   {
		   Scanner fileSc = new Scanner ( new File (master_file_name ));
		   while ( fileSc.hasNextLine() )
		   {
			   line = fileSc.nextLine();
			   words = line.split(",");
			   md.add( new master_data(words[0], words[1], words[2], words[3]) );
		   }	
/*		   for( master_data ele : md )
		   {
			   System.out.printf("%s - %s - %s - %s\n",ele.country(),ele.capital(),
													ele.ap_name(), ele.apc());
		   }	*/ 
			fileSc.close();		   
	   }
	   catch( Exception exp )
	   {
		   System.out.println( exp );
	   }
	   // master_data filling completed
	   
	   // read the graph file 
	   // fill the edges and nodes 
	   // edges filling 
	   try{
		   Scanner fileSc = new Scanner ( fname );
		   edges = new ArrayList< Edge >();
		   allNodes_set = new LinkedHashSet<>();
		   allNodes = new ArrayList<>();
		   String src_str;
		   String des_str;
		   int src_num;
		   int des_num;
		   int weight;
		   noe = 0;
		   
		   while ( fileSc.hasNextLine() )
		   {
			   line = fileSc.nextLine();
			   words = line.split(",");
			   src_num = Integer.parseInt ( words [ 0 ] );
			   des_num = Integer.parseInt ( words [ 1 ] );
			   weight  = Integer.parseInt ( words [ 2 ] );
               src_str = md.get( src_num - 1 ).apc();
			   if ( allNodes_set.contains ( src_str ) == false )
			   {
				     allNodes_set.add( src_str );
allNodes.add( new Vertex( md.get( src_num -1).apc(), md.get( src_num -1).capital(), md.get( src_num -1).country()) );
			   }
			   des_str = md.get( des_num - 1 ).apc();
			   if ( allNodes_set.contains ( des_str ) == false )
			   {
				   allNodes_set.add( des_str );
allNodes.add( new Vertex( md.get( des_num -1).apc(), md.get( des_num -1).capital(), md.get( des_num -1).country() ) );
			   }
			   edges.add ( new Edge ( src_str, des_str, weight ) );
			   noe++;
			   
		   }
		   nodes = allNodes_set.toArray( new String[0] );
		   non = allNodes_set.size();
	   }
	   catch ( Exception exp )
	   {
	   }
	  // printEdges();
	   //printNodes();
	   // edges filling and nodes filling completed 
//	   fillAllNodes();
       formAdjMatrix();
	   printAdjMatrix();
	  // System.out.println(Arrays.toString ( nodes ));
	  formAdjList();
	  printAdjList();
	   
	 }
}


class graph_tester
{
	public static void main( String [] parameters )
	{
		graph gph1 = new graph ( new File("GRAPH_1.TXT")) ;
		System.out.println();
		gph1.dfs_adjMatrix( "DEL");
		System.out.println();
		gph1.bfs_adjList("DAC");
		System.out.println("DFS - LIST");
		gph1.dfs_adjList("DAC");
		
		
	}
}















