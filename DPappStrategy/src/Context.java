public class Context {
    private IStategy iStategy = new IStategyImpl1();
    public void appliquerStrategy(){
        iStategy.strategy();
    }

    public void setiStategy(IStategy is){
        this.iStategy = is;
    }
}
