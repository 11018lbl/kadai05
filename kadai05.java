import java.util.Scanner;

public class kadai05{
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
    System.out.println("出発地点を定義");
    int start = scanner.nextInt();
    System.out.println("最終地点を定義");
    int gall = scanner.nextInt();

  }
}



//####参考###
//https://nw.tsuda.ac.jp/lec/dijkstra/