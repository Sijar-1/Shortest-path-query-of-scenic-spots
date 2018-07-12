package com.ecust.jingdianchaxun.controller;

public class Dijkstra {
	 
    public static boolean sur;
	public static int INFINITY = 65535;
	public static String str="";
    public static int[][] Graph =  {
    		{ 0,        456,      INFINITY,  245,       INFINITY, INFINITY, INFINITY, INFINITY, INFINITY,  INFINITY },
    		{ 456,      0,        INFINITY,  INFINITY,  INFINITY, INFINITY, INFINITY, INFINITY, INFINITY,  INFINITY },
    		{ INFINITY, INFINITY, 0,         307,       110,      INFINITY, INFINITY, INFINITY, 376,       INFINITY },
    		{ 245,      INFINITY, 307,       0,         INFINITY, INFINITY, INFINITY, INFINITY, INFINITY,  732      },
    		{ INFINITY, 380,      110,       INFINITY,  0,        400,      INFINITY, INFINITY, INFINITY,  INFINITY },
    		{ INFINITY, INFINITY, INFINITY,  INFINITY,  INFINITY, 0,        265,      INFINITY, INFINITY,  INFINITY },
    		{ INFINITY, INFINITY, INFINITY,  INFINITY,  INFINITY, 265,      0,        304,      210,       INFINITY },
    		{ INFINITY, INFINITY, INFINITY,  INFINITY,  INFINITY, INFINITY, 304,      0,        INFINITY,  307      },
    		{ INFINITY, INFINITY, 376,       INFINITY,  INFINITY, INFINITY, 210,      INFINITY, 0,         527      },
    		{ INFINITY, INFINITY, INFINITY,  732,       INFINITY, INFINITY, INFINITY, 307,      527,       0        }
    };
    public static int NUM = Graph[0].length;
	public static int[] prenode = new int[NUM];// 前驱节点数组

	


    /**
     * Dijkstra最短路径。
     * 即图中"节点vs"到其它各个节点的最短路径。
     * @param vs 起始节点
     * @param Graph 图
     */
    public static void dijkstra(int vs,int s2, int[][] Graph) {
        
        // 最短距离数组
        int[] mindist = new int[NUM];
        // 该节点是否已经找到最短路径
        boolean[] find = new boolean[NUM];
         
        int vnear = 0;
        sur=true;
        if(vs<0||s2<0||vs>9||s2>9) {
        	str+="序号出错啦~~~请重新输入\n";
        	sur=false;
        	return;
        }
        for (int i = 0; i < mindist.length; i++) {
            mindist[i] = Graph[vs][i];
            if(mindist[i]<INFINITY)
            	prenode[i] = vs;
            else
            	prenode[i] = -1;
            find[i] = false;
        }
        
        find[vs] = true;
        while(true) {   
            // 求得距离vs最近的节点vnear和最短距离min
            int min = INFINITY;
            for (int j = 0; j < Graph.length; j++) {
                if (!find[j] && mindist[j] < min) {
                    min = mindist[j];
                    vnear = j;
                }
            }
            if(min<INFINITY)
               find[vnear] = true;
            else
            	break;   //错误
 
            // 根据vnear修正vs到其他所有节点的前驱节点及距离
            for (int k = 0; k < Graph.length; k++) {
            	if(!find[k] && Graph[vnear][k] < INFINITY){
                    if(Graph[vnear][k]<0) {
                    	System.out.println("error..");
                    	return;
                    	}
            		if (mindist[vnear] + Graph[vnear][k] < mindist[k]) {
                    prenode[k] = vnear;
                    mindist[k] = min + Graph[vnear][k];
                }
            	}
            }
        }
        //System.out.print( "最短路线为：\n"+(s2+1));
        str+="最短路线为：\n"+(s2+1);
        for (int v=s2; v!=vs; v=prenode[v]) {
            //System.out.print("  <---  " + (prenode[v]+1));
            str+="  <---  " + (prenode[v]+1);
        }
        //System.out.println( "\n路径最短为"+mindist[s2]);
        str+="\n路径最短为"+mindist[s2]+"米\n";
    }
}