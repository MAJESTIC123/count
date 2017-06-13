class counts{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
int b=0;
if(a<0){
a=a*-1;}
else if(a==0){
a=1;}
while(a>0){
a=a/10;
b++;}
System.out.println("the counts is"+b);
}
}