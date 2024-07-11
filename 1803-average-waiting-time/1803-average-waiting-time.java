class Solution {
    public double averageWaitingTime(int[][] customers) {
       double waiting_time = 0;
       int current_time = 0;

       for(int[] customer : customers){
        int arrival = customer[0];
        int service = customer[1];
        if(current_time < arrival){
            current_time = arrival;
        }
        int wait_time = current_time - arrival + service;
        waiting_time += wait_time;
        current_time += service;
       } 
       return waiting_time / customers.length;
    }
}