public abstract interface Youtuber { // applying abstraction is needed as interface work in that manner
    abstract void make();
    // we cannot make interfaces object or methods , we could do method declaration

    //but in JDK 11 above we can do that using default keyword
    default void uploadVideo(){
        System.out.println("upload");
    }
}
