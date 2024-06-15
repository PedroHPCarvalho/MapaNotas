package mapanotas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MapaNotas {
	JFrame f,a;    
	JButton btAdd;
	JTextField tf1, tf2, tf3;
	int id = 0;
	public MapaNotas() {
		
		f=new JFrame();
		a=new JFrame();
		btAdd = new JButton("Adicionar");
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		
		DefaultTableModel dtm = new DefaultTableModel();
	    JTable jt = new JTable(dtm);
	    dtm.addColumn("ID");
	    dtm.addColumn("Nome");
	    dtm.addColumn("Salario");
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    
	    tf1.setBounds(30, 100, 100, 30);
	    tf2.setBounds(30, 130, 100, 30);
	    tf3.setBounds(30, 160, 100, 30);
	    btAdd.setBounds(30,210,200,30);
	    
	    btAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				id = id + 1;
				dtm.addRow(new Object[] {id,tf2.getText(),tf3.getText()});
				
			}
	    	
	    });
	    
	    
	    f.add(sp);
	    
	    a.setLayout(null);
	    a.add(btAdd);
	    //a.add(tf1);
	    a.add(tf2);
	    a.add(tf3);
	    
	    a.setSize(300,400);
	    a.setVisible(true);
	    
	    f.setSize(300,400);
	    f.setVisible(true);
	}
	
	public static void main(String []args) {
		new MapaNotas();
	}
}
