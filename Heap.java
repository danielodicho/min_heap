import java.awt.Graphics;

public class Heap<Comparable>
{
  private Comparable[] listx;
  private int nextOpenIndex;

  public Heap(int initCapacity)
  {
     this.listx =  new Comparable[initCapacity];
     this.nextOpenIndex =0;
  }

  public boolean isEmpty()
  {
    if (nextOpenIndex == 0){
        return true;
    }
    return false;
  }

  public Comparable peekMin()
  {
    if (this.isEmpty() == true){
      throw new Error("Empty Heap");
    }
    return this.listx[0];
  }

  public void add(Comparable d)
  {
    // (nextOpenIndex+1).compareTo(this.listx.length) >=0
      
    
    if (nextOpenIndex+1 >= this.listx.length ){
        Comparable[] list1 =  new Comparable[this.listx.length*2];
        for (int x = 0; x < this.listx.length; x++){
          list1[x] = listx[x];
        }
        this.listx = list1;
    }
    listx[ nextOpenIndex] = d; // list[3] = 3
    int temp = (nextOpenIndex-1)/2; //[1]
    int tempIndex = nextOpenIndex;

    // d < listx[temp]
    while (d.compareTo(listx[temp])< 0){ // 3<1
      // int valtemp = list[nextOpenIndex];
      listx[tempIndex] = listx[temp];//l[3] =l[1]
      listx[temp] = d; //l[1] = 3
      tempIndex = temp;
      temp = (temp-1)/2; //
      // System.out.print(temp);
    }
    nextOpenIndex++;
    
 }
  public Comparable removeMin()
  {
    Comparable root;

      if (this.isEmpty()==true){
        throw new Error("Empty Heap");
      }
      else if (nextOpenIndex<=0){
          throw new Error("NO, STOP PRESSING REMOVE MIN");
      }
      else{
        root = listx[0];
        listx[0] = listx[nextOpenIndex-1];
        nextOpenIndex--;
        if (nextOpenIndex > 0){
          heapFix(0);
        }
        
      }
return root;
  }

  private void heapFix(int nIndex){
    
    int leftC =  2*nIndex+1;
    int rightC =  2*nIndex+2;
    int mIndex;
  
    
    if (rightC>=nextOpenIndex){
      if (leftC>=nextOpenIndex){
        return;
      }
      else{
        mIndex = leftC;
      }}
      else{
        // listx[leftC] <= listx[rightC]
        Comparable a = listx[leftC];
        Comparable b = listx[rightC];
        if (a.compareTo(b) <= 0){
          mIndex = leftC;
        }
        else{
          mIndex = rightC;
        }
      }
      // listx[nIndex]> listx[mIndex]
      
      if (listx[nIndex].compareTo(listx[mIndex]) >0){
        Comparable temp = listx[mIndex];
        listx[mIndex] = listx[nIndex];
        listx[nIndex] = temp;
        heapFix(mIndex);
      }
    }
  
  @Override
  public String toString(){
    String queue = "";
    if (this.isEmpty()) throw new Error("Empty queue");
    queue += listx[0] + " ";
    for (int x = 1; x<= nextOpenIndex/2; x++){
        queue += listx[x] + " ";
        queue += listx[2*x] + " " ;
        queue += listx[2*x+1] + " ";
    } 
    return queue;
  }











public Comparable dequeue(){
  return this.removeMin();
}
  
}
  //________________________________________________________
  //
  // do not alter this code...
//   //
//     public void paint(Graphics g)
//     {
//       Drawer.paint(g, listx, nextOpenIndex);
//     }
//   //
//   //________________________________________________________

// }