package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //소규모 영화관 좌석
        //A1-A5
        //B1-B5
        //C1-C5

        String[] seaA={"A1", "A2", "A3", "A4"};
        String[] seaB={"B1", "B2", "B3", "B4"};
        String[] seaC={"C1", "C2", "C3", "C4"};

        //3(세로)x5(가로) 크기의 2차월 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4","A5"},//1줄   <세로>
                {"B1", "B2", "B3", "B4","B5"},//2줄
                {"C1", "C2", "C3", "C4","C5"},//3줄
                //1     2      3    4     5
        };

        //B2에 접근하려면?
        System.out.println(seats[1][1]);

        //C5에 접근하려면?
        System.out.println(seats[2][4]);

        //첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
         String[][] seats2 ={
                 {"A1","A2", "A3"},
                 {"B1", "B2", "B3", "B4"},
                 {"C1", "C2", "C3", "C4","C5"},
         };

         //A3에 접근 하려면?
        System.out.println(seats2[0][2]);

        //A5값은 없지만 접근하려면?
        // System.out.println(seats2[0][4]);

        // 3차원, 거의 2차원 사용함 업무에서 (세로 * 가로 *높이) 직육면체
        String[][][] marray = new String[][][] {
                { {},{},{} },
                { {},{},{} },
                { {},{},{} },

        };
     //  marray[0][1][2]

        }

    }
