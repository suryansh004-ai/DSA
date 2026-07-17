class Pair{
    int first;
    int second;
Pair(int a, int b)
{
    first =a;
    second =b;

}
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num ,map.getOrDefault(num ,0)+1);
   }
PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a,b) -> {if (a.first != b.first)
    return a.first -b.first;
    return a.second -b.second;
    }
);
 for(Map.Entry<Integer,Integer>entry :map.entrySet()){
    pq.offer(new Pair(entry.getValue(),entry.getKey()));
    if(pq.size()>k){
        pq.poll();

    }}
 int []ans = new int[k];
 for(int i =k-1;i>=0;i--)ans[i] = pq.poll().second;
   return ans ;
    }
}