import java.util.ArrayList;

class Main2{

    private static void solve(int i,int j,int[][] m,int n,ArrayList<String> ans, String path,int[][] vis,int[] di,int[] dj){
        if(i == n-1 && j == n-1){
            ans.add(path);
            return;
        }
        String dir = "DLRU";
        vis[i][j] = 1;

        for(int ind=0;ind<4;ind++){
            int nexti = i+di[ind];
            int nextj = j+dj[ind];

            if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj] == 0 && m[nexti][nextj] == 1){  
                solve(nexti,nextj,m,n,ans,path+dir.charAt(ind),vis,di,dj);
            }
        }
        vis[i][j] = 0;

        
    }
    public static void main(String[] args) {
        int[][] m = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        System.out.println("MAIN-2");
        int n = m.length;
        ArrayList<String> ans = new ArrayList<>();
        int[][] vis = new int[n][n];
        
        int[] di = {+1,0,0,-1};
        int[] dj = {0,-1,+1,0};

        if(m[0][0] == 1) solve(0,0,m,n,ans,"",vis,di,dj);

        
        System.out.println(ans);

    }
}