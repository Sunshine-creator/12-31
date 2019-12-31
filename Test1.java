import java.util.Arrays;
public class Test1 {
    public static void main(String[] args) {
        int Arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        String newArr = Arrays.toString(arr);   //数组转化为字符串
        int[] newArr = Arrays.copyOf(arr, arr.length);
        int[] newArr2 = Arrays.copyOfRange(Arr, 2, 5);
        System.out.println("newArr:" + Arrays.toString(newArr));
        System.out.println("newArr2:" + Arrays.toString(newArr2));
    }
}
//    public static  String toString(int[] arr){
//         String ret = "[";
//         for(int i =0;i<arr.length;i++){
//             ret+=arr[i];
//             if(i!=arr.length-1){
//                 ret +=",";
//             }
//         }
//         ret +="]";
//         return  ret;
//        int [] output = transform(arr);
////        printArrary(arr);
////    }
////    public static  void  printArrary(int[] arr){
////       for(int i =0;i<arr.length;i++){
////           System.out.println(arr[i]);
////       }
////    }
////    public  static int[] transform(int[] arr){
////        int ret [] = new  int [arr.length];
////        for(int i =0;i<arr.length;i++){
////            ret[i] =arr[i] * 2;
////        }
////        return  ret;

