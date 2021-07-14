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
            ServerSocket serverSocket = new ServerSocket(port); //���������Socket�����󶨶˿ں�
            while(true){
                Socket socket = serverSocket.accept();  //��������ʼ����
                System.out.println("����������ӡ�����������");
                InputStream inputStream = socket.getInputStream();  //��ȡ�ͻ��˷���������
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream); //���ֽ���ת��Ϊ�ַ���
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  //���ַ���д�뻺����
                String data = bufferedReader.readLine();  //�ӻ������ж�ȡһ��
                String[] datas = data.split("-");  //���ַ��������ա�-���ŷָ�
                int sum = 0;
                for(int i=0;i<datas.length;i++){   //����ÿ���������ۺϣ�������PID�㷨���
                    sum += Integer.parseInt(datas[i]);
                }
                System.out.println(sum);
                OutputStream outputStream = socket.getOutputStream();  //��ȡд��socket��Ȩ��
                outputStream.write((String.valueOf(sum)+"\n").getBytes("utf-8"));  //���ֽ�������ʽ�������Ҫ���͵�����д�뵽socket��
                outputStream.flush(); //ˢ�»���������ǿ�ƽ�����д��
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
