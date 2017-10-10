import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.util.*;
class jtree extends JFrame implements TreeSelectionListener{
	JLabel l1;
	JTree jt;
	jtree(){
		setLayout (new FlowLayout());
		l1 = new JLabel("Path");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("COMPUTER SCIENCE");
		DefaultMutableTreeNode fy = new DefaultMutableTreeNode("F.Y.Bsc");
		DefaultMutableTreeNode py = new DefaultMutableTreeNode("PYTHON");
		DefaultMutableTreeNode ms = new DefaultMutableTreeNode("MYSQL");
		DefaultMutableTreeNode sy = new DefaultMutableTreeNode("S.Y.Bsc");
		DefaultMutableTreeNode j  = new DefaultMutableTreeNode("JAVA");
		DefaultMutableTreeNode n  = new DefaultMutableTreeNode(".NET");
		DefaultMutableTreeNode ty = new DefaultMutableTreeNode("T.Y.Bsc");
		DefaultMutableTreeNode an = new DefaultMutableTreeNode("ANDROID");
		DefaultMutableTreeNode or = new DefaultMutableTreeNode("ORACLE");
		
		root.add(fy);
		fy.add(py);
		fy.add(ms);
		root.add(sy);
		sy.add(j);
		sy.add(n);
		root.add(ty);
		ty.add(an);
		ty.add(or);
		jt = new JTree(root);
		jt.addTreeSelectionListener(this);
		add(jt);
		add(l1);
		l1.setOpaque(true);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void valueChanged (TreeSelectionEvent tse){
		TreePath tp = tse.getPath();
		l1.setText(tp.toString());
	}
	public static void main(String args[]){
		jtree jtr = new jtree();
	}
}