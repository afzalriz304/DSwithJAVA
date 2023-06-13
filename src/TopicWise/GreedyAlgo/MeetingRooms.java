package TopicWise.GreedyAlgo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MeetingRooms {
    public static void main(String[] args) {
        /*int[][] meetings = new int[][]{
                {5,10},
                {15,20},
                {0,30}
        };*/
        /*int[][] meetings = new int[][]{
                {0, 10},
                {1, 5},
                {2, 7},
                {3, 4}
        };*/
        //[[1,20],[2,10],[3,5],[4,9],[6,8]]
        /*int[][] meetings = new int[][]{
                {1, 20},
                {2, 10},
                {3, 5},
                {4, 9},
                {6, 8}
        };*/
        //[[18,19],[3,12],[17,19],[2,13],[7,10]]
        int[][] meetings = new int[][]{
                {18, 19},
                {3, 12},
                {17, 19},
                {2, 13},
                {7, 10}
        };
        //System.out.println(minimumRoomRequired(2, meetings));
        System.out.println(mostBooked(4,meetings));
    }

    public static int minimumRoomRequired(int n, int[][] meetings) {
        int current = 0;
        int maxRoom = 0;
        int totalLength = meetings.length * meetings[0].length;
        int[][] timeToCost = new int[totalLength][2];
        int index = 0;
        for (int i = 0; i < meetings.length; i++) {
            timeToCost[index][0] = meetings[i][0];
            timeToCost[index][1] = 1;
            index++;
            timeToCost[index][0] = meetings[i][1];
            timeToCost[index][1] = -1;
            index++;
        }
        Arrays.sort(timeToCost, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < timeToCost.length; i++) {
            current += timeToCost[i][1];
            maxRoom = Math.max(current, maxRoom);
        }
        return maxRoom;
    }

    public static int mostBooked(int n, int[][] meetings) {
        int[] roomCount = new int[n];
        int index = 0;
        for(int i=0;i<n;i++){
            roomCount[i]=0;
        }
        for (int i = 0; i < meetings.length; i++) {
            if(index==n)
                index=0;
            roomCount[index] = roomCount[index]+1;
            index++;
        }
        Arrays.sort(roomCount);
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(i<n-1 && roomCount[i]<roomCount[i+1]){
                if(!visited.contains(roomCount[i]))
                    return roomCount[i];
            }
            visited.add(roomCount[i]);
        }
        return 0;
    }
}
