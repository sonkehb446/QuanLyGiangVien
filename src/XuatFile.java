
import com.sonke.model.GiangVienCNTT;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NHS
 */
public class XuatFile {
    public void XuatFiles() throws IOException{
        File file = TaoFIle();
        
        
        FileReader fileReader = new FileReader(file);
        int c = fileReader.read();
        System.out.println(c);
        while (c != -1) {            
            System.out.print((char)c);
            c = fileReader.read();
        }
    }
    
    public void XuatFiles1(List<GiangVienCNTT> a) throws IOException{
        File file = TaoFIle();
        FileWriter fileWriter = new FileWriter(file);
        for (GiangVienCNTT giangVienCNTT : a) {
            fileWriter.write(a.toString());
        }
        fileWriter.close();
    }

    private File TaoFIle() throws IOException {
        File ThuMuc = new File("Hello");
        if(!ThuMuc.exists()){
            ThuMuc.mkdir();
        }
        File file = new File("Hello/1.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        return file;
    }
    
    public static void main(String[] args) {
        try {
            XuatFile a = new XuatFile();
            a.XuatFiles();
            List<GiangVienCNTT> A= new ArrayList<GiangVienCNTT>();
            GiangVienCNTT b = new GiangVienCNTT("12", "12", "12", true, "12");
            A.add(b);
            a.XuatFiles1(A);
        } catch (IOException ex) {
            Logger.getLogger(XuatFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
