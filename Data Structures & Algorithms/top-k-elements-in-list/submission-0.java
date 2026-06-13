class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        // Min Heap once you add elements to pq least element will be on top. When size is greater
        // than k then we will remove the element from pq and later we return k greatest freq elements

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
            if(pq.size() > k) pq.poll();
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = pq.poll()[1];
        }        
        return res;
    }
}
