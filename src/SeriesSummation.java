public class SeriesSummation {
    private int result;
    public SeriesSummation(){
        result= 0;
    }
    public int seriesSummation(int hightsNumber){
        for(int loopCount = 1;loopCount<=hightsNumber;loopCount++){
            result = result + loopCount;
        }
        return result;
    }
}
