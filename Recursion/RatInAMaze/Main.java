import java.util.ArrayList;

class Main{

    private static void solve(int i,int j,int[][] m,int n,ArrayList<String> ans, String path,int[][] vis){
        if(i == n-1 && j == n-1){
            ans.add(path);
            return;
        }

        vis[i][j] = 1;

        //downward movement
        if(i+1 < n && vis[i+1][j] == 0 && m[i+1][j] == 1){    
            solve(i+1,j,m,n,ans,path+'D',vis);
        }

        //Left movement
        if(j-1 >= 0 && vis[i][j-1] == 0 && m[i][j-1] == 1){
            solve(i,j-1,m,n,ans,path+'L',vis);
        }

        //Right movement
        if(j+1 < n && vis[i][j+1] == 0 && m[i][j+1] == 1){
            solve(i,j+1,m,n,ans,path+'R',vis);
        }

        //Upward movement
        if(i-1 >= 0 && vis[i-1][j] == 0 && m[i-1][j] == 1){
            solve(i-1,j,m,n,ans,path+'U',vis);
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

        int n = m.length;
        ArrayList<String> ans = new ArrayList<>();
        int[][] vis = new int[n][n];

        if(m[0][0] == 1) solve(0,0,m,n,ans,"",vis);

        
        System.out.println(ans);

    }
}