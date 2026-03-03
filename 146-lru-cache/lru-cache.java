class LRUCache {
    int capacity;
    HashMap<Integer,Integer> map;
    Stack<Integer> stack;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.stack = new Stack<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        stack.remove((Integer) key);
        stack.push(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            stack.remove((Integer) key);
        }
        else if(map.size() == capacity){
            int bottom = stack.remove(0);
            map.remove(bottom);
        }
        stack.push(key);
        map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */