import java.util.Scanner;

public class kadai05{

  public static int min(x[]){
    int minimamu;
    for(i=0;i<x.length;i++){
      if(minimamu<x[i]){
        minimamu=i;
      }
    }
    return minimamu;
  }


  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("場所の数を入力");
    int map =scanner.nextInt();
    double maplist[][];
    maplist = new double[map][map];
    int i,l;

    for(i=0; map>i; i++){
      for(l=0; map>l; l++){
        int numx=i+1;
        int numy=l+1;
        String numxx=String.valueOf(numx);
        String numyy=String.valueOf(numy);

        String mess = numx+","+numy+"の距離を入力";
        System.out.println(mess);
        System.out.println("＊つながっていない場合は0を入力")
        maplist[i][l]=scanner.nextInt();
      }
    }
    for(i=0;map>i;i++){
      maplist[i][i]=0;
    }
    System.out.println("出発地点を定義");
    int start = scanner.nextInt();
    int startin = start-1;
    System.out.println("最終地点を定義");
    int goal = scanner.nextInt();
    int goalin = goal-1;

    int n,m;
    double route[];
    route = new double[map];
    for(n=0;n<map;n++){
      if(maplist[startin][n]>0){
        route[n]=maplist[startin][n]
      }
    }
    int minadd = 

    for(i=1;route[goalin]==0;i++){
      for(n=0;n<map;n++){
        if(maplist[startin][n]>0){
          route[n]=maplist[startin][n]
        }
      }
    }
  }
}



//####参考###
//https://nw.tsuda.ac.jp/lec/dijkstra/
