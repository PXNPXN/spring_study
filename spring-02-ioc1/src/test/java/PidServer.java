import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PidServer {
    public static void main(String[] args) {
        try {
            int port = 1919;
            ServerSocket serverSocket = new ServerSocket(port); //建立服务端Socket，并绑定端口号
            while(true){
                Socket socket = serverSocket.accept();  //服务器开始监听
                System.out.println("服务端已连接。。。。。。");
                InputStream inputStream = socket.getInputStream();  //获取客户端发来的数据
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream); //将字节流转换为字符流
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  //将字符流写入缓冲区
                String data = bufferedReader.readLine();  //从缓冲区中读取一行
                String[] datas = data.split("-");  //将字符串，按照“-”号分割
                int sum = 0;
                for(int i=0;i<datas.length;i++){   //计算每个参数的综合，这里用PID算法替代
                    sum += Integer.parseInt(datas[i]);
                }
                System.out.println(sum);
                OutputStream outputStream = socket.getOutputStream();  //获取写入socket的权限
                outputStream.write((String.valueOf(sum)+"\n").getBytes("utf-8"));  //以字节流的形式将服务端要发送的数据写入到socket中
                outputStream.flush(); //刷新缓冲区，并强制将数据写入
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
