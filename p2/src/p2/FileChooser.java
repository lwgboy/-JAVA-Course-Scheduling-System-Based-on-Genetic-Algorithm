package p2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileChooser extends JFrame implements ActionListener{
	JButton open=null;
	public static void main(String[] args) {
		new FileChooser();
	}
	public FileChooser(){
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser jfc=new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
		jfc.showDialog(new JLabel(), "ѡ��");
		File file=jfc.getSelectedFile();
		if(file.isDirectory()){
			System.out.println("�ļ���:"+file.getAbsolutePath());
		}else if(file.isFile()){
			System.out.println("�ļ�:"+file.getAbsolutePath());
		}
		System.out.println(jfc.getSelectedFile().getName());
	}
	public String ac(){
		JFileChooser jfc=new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
		jfc.showDialog(new JLabel(), "ѡ��");
		File file=jfc.getSelectedFile();
		if(file.isDirectory()){
			System.out.println("�ļ���:"+file.getAbsolutePath());
		}else if(file.isFile()){
			System.out.println("�ļ�:"+file.getAbsolutePath());
		}
		System.out.println(jfc.getSelectedFile().getName());
		return file.getAbsolutePath();
	}

}