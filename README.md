# SortingAlgoritms
This application allows choice between different List Sorting Algorithms through the Strategy Design Pattern for OO Programming.
<hr>
Exploring Bubble Sort, Selection Sort, Insertion Sort, Merge Sort and Quick Sort, the system sorts a list of given integers choosing a different Strategy each time. <br><br>
The system also outputs the time taken to execute the computation for each sorting algorithm.
<br><br><br>
Feel free to add any sorting algorithm implementation as: <br><br>

new class NewSort implements SortingAlgorithm { <br>
  @Override <br>
    public ArrayList<Integer> sort(ArrayList<Integer> input) { ... } <br>
      @Override <br>
    public long executionTime() { ... } <br>
