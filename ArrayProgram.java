public class Main {
    public static int findIndex(int[] arr, int t){
        if (arr==null){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i]==t){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,12,25};
        int itemToSearch = 5;
        System.out.println(findIndex(arr,itemToSearch));
    }
}