class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        
// handling if its impossible to reach office        
        if(hour <= dist.length-1)
        return -1;

        int max = Integer.MIN_VALUE;
        for(int ele : dist){
            max = Math.max(max,ele);
        }
        int lo = 1, hi = 10000000, speed = max;
        while(lo <= hi){       
            int mid = lo + (hi-lo)/2;
            if(hours(mid,dist) <= hour){
                hi = mid-1;
                speed = mid;
            }
            else lo = mid +1 ;
        }
        return speed;
    }

    private double hours(int speed, int[] dist){
        double time = 0;
        for(int i=0; i<dist.length-1 ; i++){
            double t = (double)dist[i]/speed;
            time += Math.ceil(t);
        }

//handling last case 

        time += (double)dist[dist.length -1]/speed ;
        return  time;
    }
}

// each train can only depart at integer hour
