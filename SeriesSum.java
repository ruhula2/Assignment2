public class SeriesSum {
    private int result;
    public SeriesSum(){
        result = 0;
    }
    public int sumOfTheSeries(int n){
        for(int loopCount=0;loopCount<=n;loopCount++){
            result = result + loopCount;
        }
        return result;
    }
}
