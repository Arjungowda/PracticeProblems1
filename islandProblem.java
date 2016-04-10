import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mandy on 2/23/2016.
 */
public class islandProblem {
    class Node {
        int iIndex;
        int jIndex;
        public Node(int iIndex, int jIndex) {
            super();
            this.iIndex = iIndex;
            this.jIndex = jIndex;
        }
        public int getiIndex() {
            return iIndex;
        }
        public void setiIndex(int iIndex) {
            this.iIndex = iIndex;
        }
        public int getjIndex() {
            return jIndex;
        }
        public void setjIndex(int jIndex) {
            this.jIndex = jIndex;
        }
        public Node() {
            super();
        }
    }
    public int findNumberOfIslands(boolean[][] islands) {
        boolean[][] visited= new boolean[islands.length][islands[0].length];
        for(boolean row[]:visited)
            Arrays.fill(row, false);
        int count = 0;
        for(int i=0; i < islands.length;i++) {
            for(int j=0; j < islands[0].length;j++) {
                if(islands[i][j] && !visited[i][j]) {
                    visitAdjacentPlaces(islands, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void visitAdjacentPlaces(boolean[][] islands, boolean[][] visited, int i, int j) {
        Queue<Node> queue = new LinkedList<Node>();
        visited[i][j] = true;
        queue.add(new Node(i,j));
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int currenti = node.getiIndex();
            int currentj = node.getjIndex();
            if(currenti+1 < islands.length && islands[currenti+1][currentj] && !visited[currenti+1][currentj]) {
                visited[currenti+1][currentj] = true;
                Node tempNode = new Node(currenti+1, currentj);
                queue.add(tempNode);
            }
            if(currentj+1 < islands[0].length && islands[currenti][currentj+1] && !visited[currenti][currentj+1]) {
                visited[currenti][currentj+1]=true;
                Node tempNode = new Node(currenti, currentj+1);
                queue.add(tempNode);
            }
            if(currentj+1 < islands[0].length && currenti+1 < islands.length && islands[currenti+1][currentj+1] && !visited[currenti+1][currentj+1]) {
                visited[currenti+1][currentj+1]=true;
                Node tempNode = new Node(currenti, currentj+1);
                queue.add(tempNode);
            }
        }
    }

    public static void main(String[] argc) {
        islandProblem islandsObj = new islandProblem();
        boolean[][] islands = {
                {true,false,false,false,true,true},
                {true,false,true,false,true,false},
                {false,false,true,false,false,false}};
        int count = islandsObj.findNumberOfIslands(islands);
        System.out.println(count);
    }

}
