class person implements student,Youtuber{
    @Override// its is must when using an abstract keyword
    public void study() {
        System.out.println("the person is studying");
    }

    @Override
    public void make() {
        System.out.println("the person is making a video");
    }
}
public class classMain {

    public static void main(String[] args){
        person p1  = new person();
        p1.study();
        p1.make();
        p1.uploadVideo();

    }
}
