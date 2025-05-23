public class Review26 {
    public static void main(String[] args) {
        int[] numArray = new int[]{10,11,12,13,14,15};
        int target=10;
        int count=0;
        for(int i=0;i<numArray.length;i++){
            if(numArray[i]==target){
                count++;
            }
            System.out.println("探索した値:"+numArray[i]);
            System.out.println("一致した数:"+count);
        }
    }
}
