package com.kwon.os.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OSMain2 {
	public static void main(String[] args) {
		// Ÿ��Ʋ�� ������ JFrame �����
		JFrame p = new JFrame("����");
		// �װ� ������ 300, 400����
		p.setSize(300, 400);
		
		// �ؽ�Ʈ�� ȫ�浿�� JButton �����
		JButton h = new JButton("ȫ�浿");
		// JFileChooser�����
		//JFileChooser h = new JFileChooser();
		// JTextField�����
		//JTextField h = new JTextField();
		
		// �ķڽø� �����
		Flashman f = new Flashman();
		
		// ȫ�浿�� �ķڽø��� ��(addActionListener)
		h.addActionListener(f);
		
		// ������ add
		p.add(h);
		
		// �װ� ���̰�
		p.setVisible(true);
	}

}




