class ThreadExt extends Thread{
    public void run(){
        System.out.println("thread "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadExt td=new ThreadExt();
  
        td.start();
        System.out.println(Thread.currentThread().getName());
    }
}

