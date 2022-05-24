import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class MinHeapRunner{

 public static void main(String[] args)
  {
  Heap<Double> h = new Heap<Double>(4);
  h.add(1.0);
  h.add(2.0);

// for (double x = 0; x<10;x++){
//   h.add(x);
// }
System.out.print(h);
  }
}


// public class MinHeapRunner extends JPanel implements ActionListener
// {
//   private static final Dimension appSize = new Dimension(750, 400);


//   private Heap h;
//   private JButton newHeap, remove, add;
//   private JTextField val;
//   private String output = "Waiting...";

//   public MinHeapRunner(JFrame f)
//   {
//     Insets in = new Insets(2, 2, 2, 2);
//     Font mb12 = new Font(Font.MONOSPACED, Font.BOLD, 14);
//     h = new Heap(5);
//     super.setBackground(new Color(225, 225, 225));
//     super.setPreferredSize(new java.awt.Dimension(1050, 600));
//     super.setMinimumSize(new java.awt.Dimension(1050, 600));
//     super.setMaximumSize(new java.awt.Dimension(1050, 600));
//     super.setLayout(null);
//     val = new JTextField();
//     val.addActionListener(this);
//     super.add(val);
//     val.setBounds(20, 110, 65, 30);
//     val.addActionListener(this);
//     val.setFont(mb12);

//     newHeap = new JButton("New Heap");
//     newHeap.setMargin(in);
//     newHeap.addActionListener(this);
//     this.add(newHeap);
//     newHeap.setBounds(20, 10, 125, 30);
//     newHeap.setFont(mb12);
//     remove = new JButton("Remove Min");
//     remove.setMargin(in);
//     remove.addActionListener(this);
//     this.add(remove);
//     remove.setBounds(20, 60, 125, 30);
//     remove.setFont(mb12);

//     add = new JButton("Add");
//     add.setMargin(in);
//     add.addActionListener(this);
//     this.add(add);
//     add.setBounds(95, 110, 50, 30);
//     add.setFont(mb12);
//                 }


//   public void paintComponent(Graphics g)
//   {
//     super.paintComponent(g);    
//     g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 24));
//     h.paint(g);
//     g.setColor(Color.BLACK);
//     g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 24));
//     g.drawString(output, 400, 25);
//   }

//   public void actionPerformed(ActionEvent e)
//   {
//     JButton b = null;
//     if (e.getSource() instanceof JButton) b = (JButton) e.getSource();
//     if (b == newHeap)
//     {
//       h = new Heap(5);
//       output = "";
//     }
//     else if (b == remove)
//     {
//       if (h.isEmpty())
//       {
//         output = "Empty heap: cannot remove!";
//       }
//       else
//       {
//         output = "Removed the min: "+h.removeMin();
//       }
//     }
//     else if (b == add)
//     {
//       String text = val.getText();
//       val.setText("");
//       try
//       {
//         output = "Added ";
//         Scanner in = new Scanner(text);
//         while (in.hasNext())
//         {
//         Double number = new Double(in.next());
//         h.add(number);
//         output += number+" ";
//         }
//       }
//       catch (NumberFormatException ex)
//       {
//         output = "Invalid double: "+text;
//       }
//     }
//     val.requestFocus();
//     repaint();
//   }

 

        // System.out.println("Testing 10 ... 49");
        
        // for (double m = 10; m < 50; m += 1) h.add(m);
        // // while (!h.isEmpty()) System.out.print(h.removeMin()+" ");


        // // System.out.println("\n\nTesting 99 ... 12 counting by threes");


        // for (double m = 99; m >= 12; m -= 3) h.add(m);
        // // while (!h.isEmpty()) System.out.print(h.removeMin()+" ");

        // // System.out.println("\n\n");
        // int size = 250;
        // // System.out.println("\n\nAdding "+size+" random 3-digit integers");
        // double[] vals = new double[size];
        // for (int m = 0; m < size; m++)
        // {
        //   double x = (int) (100 + Math.random()*900);
        //   h.add(x);
        //   vals[m] = x;
        // }
        // java.util.Arrays.sort(vals);
        // int m = 0;
        // while (!h.isEmpty())
        // {
        //   double a = h.removeMin(), b = vals[m++];
        //   if (a != b)
        //   {
        //     // System.out.println("\n\nheap says "+a+ "but it should be "+b);
        //     // System.exit(-1);
        //   }
        //   // System.out.println(a+"  "+b);
        // }

// System.out.println("\n\nPassed all tests!");




    // JFrame.setDefaultLookAndFeelDecorated(false);
    // java.awt.EventQueue.invokeLater( 
    // new Runnable() 
    // { 
    //   public void run() 
    //   {
       
    //     JFrame fr = new JFrame("MinHeapRunner");
    //     fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     fr.setLocation(10, 10);
    //     JScrollPane jsp = new JScrollPane(new MinHeapRunner(fr));

    //     jsp.setPreferredSize(appSize);
    //     jsp.setMinimumSize(appSize);
    //     jsp.setMaximumSize(appSize);
    //     fr.setContentPane(jsp);
    //     //fr.setResizable(false);
    //     fr.setContentPane(jsp);
    //     fr.pack();
    //     fr.setVisible(true);
    //   }
    // } 
//     );
//   }


// }