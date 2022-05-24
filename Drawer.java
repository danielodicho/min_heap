// import java.awt.Graphics;
// import java.awt.Color;
// import java.awt.Font;

// public class Drawer
// {
//   public static void paint(Graphics g, Comparable[] list, int nextOpenIndex)
//   {
//     g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 24));
//     boolean isValid = true;
// if (list == null || list.length == 0) return;
//     for (int k = 0; k < nextOpenIndex / 2; k++)
//     {
//       int lc = k * 2 + 1, rc = lc + 1;
//       if (lc < nextOpenIndex && list[k] > list[lc]) isValid = false;
//       if (rc < nextOpenIndex && list[k] > list[rc]) isValid = false;
//     }
//     if (isValid)
//     {
//       g.setColor(Color.BLACK);
//       g.drawString("Heap is valid.", 150, 25);
//     }
//     else
//     {
//       g.setColor(Color.RED);
//       g.drawString("Heap is NOT valid!", 150, 25);
//     }
//     g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
//     g.setColor(Color.BLACK);
//     int numRows = 1 + (int) (Math.log(list.length) / Math.log(2));
//     int index = 0, startX = 512, pow2 = 2;
//     for (int row = 0; row < numRows; row++)
//     {
//       int y = row * 60 + 100;
//       int x = startX;
//       while (index < pow2-1)
//       {
//         g.setColor(Color.BLUE);
//         if (index < list.length)
//         {
//           g.drawString(""+list[index],x-14,y+18);
//         }
//         g.setColor(Color.BLACK);
//         g.drawRect(x-16,y,30,30);
//         g.drawString(""+index,x-16,y-2);
//         x += startX * 2;
//         index++;
//         if (index >= list.length) return;
//       }
//       pow2 *= 2;
//       startX /= 2;
//     }
//   }
// }