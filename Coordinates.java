import java.util.Scanner;
public class Coordinates{
public static class Points{
int x;
int y;
}
public static boolean doOverlap(Points l1,Points r1,Points l2,Points r2){
if(l1.x==r1.x||l2.x==r2.x||l1.y==r1.y||l2.y==r2.y){   //line check
return false;
}
if(l1.x>=r1.x||l2.x>=r2.x){            //left check
return false;
}
if(r1.y>=l2.y||r2.y>=l1.y){
return false;
}
return true;
}
public static void main(String[] args){
Scanner in = new Scanner(System.in);
Points l1= new Points(),r1 =new Points(),
l2 = new Points(),r2 =new Points();
System.out.println("Enter the coordinates");
l1.x = in.nextInt();
l1.y = in.nextInt();
r1.x = in.nextInt();
r1.y = in.nextInt();
l2.x = in.nextInt();
l2.y = in.nextInt();
r2.x = in.nextInt();
r2.y = in.nextInt();
if(doOverlap(l1,r1,l2,r2)){
System.out.println("Yes");
} else {
System.out.println("No");
}
}
}
   
