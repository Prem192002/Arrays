import java.util.ArrayList;

class test {
    static ArrayList<Integer> indices(int[]num,int N, int target, int idx){
        ArrayList<Integer> res = new ArrayList<>();
        if(idx==N){
            return res;
        }
        if(num[idx]==target){
            res.add(idx);
        }
        res.addAll(indices(num, N, target, idx+1));
        return res;
    }

    public static void main(String[] args) {
        int[] num = {5,8,2,7,12,2,1,2};
        for (int i = 0; i <indices(num, 8, 2, 0).size(); i++) {
            System.out.println(indices(num, 8, 2, 0).get(i));
        }
    }
}
