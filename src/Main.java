import java.io.*;


public class Main {

    public static void writeUsingBufferedWriter(String content){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("bTest.txt"))){
            bw.write(content);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void writeUsingOutputStream(String data){
        try{
            OutputStream os = new FileOutputStream(new File("test.txt"));
            os.write(data.getBytes(), 0, data.length());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void writeUsingFileWrite(String data){
        try(FileWriter fw = new FileWriter(new File("fTest.txt"))){
            fw.write(data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeUsingBufferedWriter("Hello");
        writeUsingBufferedWriter("Java World");
        writeUsingBufferedWriter("Again!");
       // writeUsingFileWrite("Hello, Java World!");
        //writeUsingOutputStream("Necesen");
    }
}
