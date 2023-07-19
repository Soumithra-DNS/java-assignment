public class SeriesMultiplication {
    private int result;

    public SeriesMultiplication(){
        result = 1;
    }
    public int seriesMultiplication(int highest_number){
        for(int count = 1; count <= highest_number; count++){
            result*=count;
        }
        return result;
    }
}
